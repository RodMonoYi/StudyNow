package visao;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Color;

public class PanelHome extends JPanel {
	private JButton btnCadastro;
	private JButton btnLogin;
	public PanelHome() {
		setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Selecione a opção desejada");
		lblNewLabel.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(34, 39, 217, 31);
		add(lblNewLabel);
		add(getBtnCadastro());
		add(getBtnLogin());
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PanelHome.class.getResource("/assets/Teste fundo.png")));
		lblNewLabel_1.setBounds(0, 0, 287, 234);
		add(lblNewLabel_1);
	}
	public JButton getBtnCadastro() {
		if (btnCadastro == null) {
			btnCadastro = new JButton("");
			btnCadastro.setContentAreaFilled(false);
			btnCadastro.setFocusPainted(false);
			btnCadastro.setHorizontalAlignment(SwingConstants.LEFT);
			btnCadastro.setBackground(new Color(255, 255, 255));
			btnCadastro.setIcon(new ImageIcon(PanelHome.class.getResource("/assets/button_cadastro (1).png")));
			btnCadastro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Login telaLogin = new Login();
					telaLogin.setVisible(true);
				}
			});
			btnCadastro.setToolTipText("Ir para página de cadastro");
			btnCadastro.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 19));
			btnCadastro.setBorder(null);
			btnCadastro.setBounds(86, 135, 115, 53);
		}
		return btnCadastro;
	}
	public JButton getBtnLogin() {
		if (btnLogin == null) {
			btnLogin = new JButton("");
			btnLogin.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnLogin.setBackground(Color.WHITE);
			btnLogin.setIcon(new ImageIcon(PanelHome.class.getResource("/assets/button_login (1).png")));
			btnLogin.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 19));
			btnLogin.setFocusPainted(false);
			btnLogin.setBorder(null);
			btnLogin.setBounds(86, 71, 115, 53);
		}
		return btnLogin;
	}
}
