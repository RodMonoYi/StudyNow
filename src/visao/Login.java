package visao;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import visao.Frame;
import javax.swing.ImageIcon;

public class Login extends JPanel {
	private JPasswordField pwdSenha;
	private JTextField txtUsuario;
	public Login() {
		setLayout(null);
		
		pwdSenha = new JPasswordField();
		pwdSenha.setSelectionStart(2);
		pwdSenha.setToolTipText("Insira sua senha");
		pwdSenha.setBounds(83, 132, 121, 20);
		add(pwdSenha);
		
		txtUsuario = new JTextField();
		txtUsuario.setForeground(new Color(192, 192, 192));
		txtUsuario.setText("Usuario");
		txtUsuario.setBounds(83, 83, 121, 20);
		add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Senha");
		lblNewLabel.setBounds(83, 114, 46, 14);
		add(lblNewLabel);
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(83, 61, 46, 14);
		add(lblLogin);
		
		JButton btnNextLogin = new JButton("");
		btnNextLogin.setContentAreaFilled(false);
		btnNextLogin.setBackground(new Color(255, 255, 255));
		btnNextLogin.setBorderPainted(false);
		btnNextLogin.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Downloads\\button_avancar (2).png"));
		btnNextLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelWelcome seletor = new PanelWelcome();
				Frame.carregarPanel(seletor);
			}
		});
		btnNextLogin.setBounds(113, 163, 60, 20);
		add(btnNextLogin);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Frame.carregarPanel(Frame.panelHome);
			}
		});
		btnVoltar.setIcon(new ImageIcon(Login.class.getResource("/assets/Seta voltar.png")));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(1, 2, 27, 22);
		add(btnVoltar);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(Login.class.getResource("/assets/Teste fundo.png")));
		lblNewLabel_1.setBounds(0, 0, 287, 234);
		add(lblNewLabel_1);
	}
}
