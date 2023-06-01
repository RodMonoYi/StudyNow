package visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class PanelWelcome extends JPanel {
	public PanelWelcome() {
		setLayout(null);
		
		JButton btnMeuPerfil = new JButton("");
		btnMeuPerfil.setContentAreaFilled(false);
		btnMeuPerfil.setBorder(null);
		btnMeuPerfil.setBorderPainted(false);
		btnMeuPerfil.setBackground(new Color(255, 255, 255));
		btnMeuPerfil.setIcon(null);
		btnMeuPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelUser panelUser = new PanelUser();
				Frame.carregarPanel(panelUser);
			}
		});
		btnMeuPerfil.setBounds(25, 158, 72, 15);
		setVisible(false);
		
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login login = new Login();
				Frame.carregarPanel(login);
			}
		});
		btnVoltar.setIcon(new ImageIcon(PanelWelcome.class.getResource("/assets/Seta voltar.png")));
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBounds(1, 2, 27, 22);
		add(btnVoltar);
		
		JButton btnNewButton_1_1 = new JButton("");
		btnNewButton_1_1.setContentAreaFilled(false);
		btnNewButton_1_1.setBorderPainted(false);
		btnNewButton_1_1.setBorder(null);
		btnNewButton_1_1.setBackground(Color.WHITE);
		btnNewButton_1_1.setBounds(206, 158, 72, 15);
		add(btnNewButton_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelSeletorDificuldade seletor = new PanelSeletorDificuldade();
				Frame.carregarPanel(seletor);
			}
		});
		btnNewButton_1.setContentAreaFilled(false);
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setBounds(118, 158, 72, 15);
		add(btnNewButton_1);
		add(btnMeuPerfil);
		
		
		JLabel lblNewLabel = new JLabel("Seja bem vindo \"NomeDaPessoa\"");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 19));
		lblNewLabel.setBounds(0, 52, 287, 25);
		add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon(PanelWelcome.class.getResource("/assets/Teste fundo2.png")));
		lblNewLabel_1.setBounds(0, 0, 287, 234);
		add(lblNewLabel_1);
		
	}
}
