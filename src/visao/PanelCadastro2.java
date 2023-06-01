package visao;

import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import visao.Frame;
import javax.swing.ImageIcon;
import javax.swing.JPasswordField;

public class PanelCadastro2 extends JPanel {
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JLabel lblNome;
	private JLabel lblCpf;
	private JButton btcadastro;
	private JLabel lblNewLabel_1;
	private JButton btnVoltar;
	private JTextField textFieldLogin;
	private JPasswordField textFieldPass;
	private JPasswordField passwordFieldRepass;
	private JLabel ImagemVisual;
	public PanelCadastro2() {
		setLayout(null);
		
		add(getBtnVoltar());
		add(getLblNome());
		add(getTextFieldLogin());
		add(getTextFieldNome());
		add(getLblCpf());
		add(getTextFieldCPF());
		add(getPasswordFieldRepass());
		add(getBtcadastro());
		add(getLblNewLabel_1());
	}
	

	public JTextField getTextFieldNome() {
		if (textFieldNome == null) {
			textFieldNome = new JTextField();
			textFieldNome.setBounds(102, 151, 126, 20);
			textFieldNome.setText("Seu Nome");
			textFieldNome.setForeground(new Color(192, 192, 192));
			textFieldNome.setColumns(10);
		}
		return textFieldNome;
	}
	public JTextField getTextFieldLogin() {
		if (textFieldLogin == null) {
			textFieldLogin = new JTextField();
			textFieldLogin.setText("NomeDeUsuario");
			textFieldLogin.setForeground(Color.LIGHT_GRAY);
			textFieldLogin.setColumns(10);
			textFieldLogin.setBounds(102, 51, 126, 20);
			
		}
		return textFieldLogin;
	}
	public JTextField getTextFieldCPF() {
		if (textFieldCPF == null) {
			textFieldCPF = new JTextField();
			textFieldCPF.setBounds(102, 180, 126, 20);
			textFieldCPF.setText("000.000.000-00");
			textFieldCPF.setForeground(Color.LIGHT_GRAY);
			textFieldCPF.setColumns(10);
		}
		return textFieldCPF;
	}
	public JPasswordField getPasswordFieldRepass() {
		if (passwordFieldRepass == null) {
			passwordFieldRepass = new JPasswordField();
			passwordFieldRepass.setText("Seu Nome");
			passwordFieldRepass.setForeground(Color.LIGHT_GRAY);
			passwordFieldRepass.setColumns(10);
			passwordFieldRepass.setBounds(102, 112, 126, 20);
		}
		return passwordFieldRepass;
	}
	public JLabel getLblNome() {
		if (lblNome == null) {
			lblNome = new JLabel("Nome completo:");
			lblNome.setBounds(23, 150, 81, 14);
			lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblNome;
	}
	public JLabel getLblCpf() {
		if (lblCpf == null) {
			lblCpf = new JLabel("Seu CPF:");
			lblCpf.setBounds(23, 181, 57, 14);
			lblCpf.setHorizontalAlignment(SwingConstants.LEFT);
		}
		return lblCpf;
	}
	public JButton getBtcadastro() {
		if (btcadastro == null) {
			btcadastro = new JButton("");
			btcadastro.setContentAreaFilled(false);
			btcadastro.setBorderPainted(false);
			btcadastro.setBackground(new Color(255, 255, 255));
			btcadastro.setIcon(new ImageIcon(PanelCadastro2.class.getResource("/assets/Skipar Frame.png")));
			btcadastro.setBounds(236, 91, 45, 45);
			btcadastro.setToolTipText("Cadastrar");
			btcadastro.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showInternalMessageDialog(null, "Usuário cadastrado com sucesso!", "Cadastro realizado", JOptionPane.PLAIN_MESSAGE);
					Frame.carregarPanel(Frame.panelHome);
				}
			});
		}
		return btcadastro;
	}
	
	
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PanelCadastro2.class.getResource("/assets/Teste fundo.png")));
			lblNewLabel_1.setBounds(0, 0, 287, 234);
		}
		return lblNewLabel_1;
	}	
	private JButton getBtnVoltar() {
		if (btnVoltar == null) {
			btnVoltar = new JButton("");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					Frame.carregarPanel(Frame.panelHome);
				}
			});
			
			add(getImagemVisual());
			
			JLabel lblRepitaASenha = new JLabel("Repita a senha:");
			lblRepitaASenha.setHorizontalAlignment(SwingConstants.LEFT);
			lblRepitaASenha.setBounds(23, 112, 81, 14);
			add(lblRepitaASenha);
			
			/*passwordFieldRepass = new JPasswordField();
			passwordFieldRepass.setText("Seu Nome");
			passwordFieldRepass.setForeground(Color.LIGHT_GRAY);
			passwordFieldRepass.setColumns(10);
			passwordFieldRepass.setBounds(102, 112, 126, 20);
			add(passwordFieldRepass);*/
			
			textFieldPass = new JPasswordField();
			textFieldPass.setText("Seu Nome");
			textFieldPass.setForeground(Color.LIGHT_GRAY);
			textFieldPass.setColumns(10);
			textFieldPass.setBounds(102, 83, 126, 20);
			add(textFieldPass);
			
			JLabel lblSenha = new JLabel("Sua senha:");
			lblSenha.setHorizontalAlignment(SwingConstants.LEFT);
			lblSenha.setBounds(23, 83, 57, 14);
			add(lblSenha);
			
			JLabel lblLogin = new JLabel("Seu login:");
			lblLogin.setHorizontalAlignment(SwingConstants.LEFT);
			lblLogin.setBounds(23, 51, 57, 14);
			add(lblLogin);
			btnVoltar.setContentAreaFilled(false);
			btnVoltar.setBorder(null);
			btnVoltar.setBorderPainted(false);
			btnVoltar.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Desktop\\Seta voltar.png"));
			btnVoltar.setBounds(1, 2, 27, 22);
			add(btnVoltar);
		}
		return btnVoltar;
	}
	private JLabel getImagemVisual() {
		if (ImagemVisual == null) {
			ImagemVisual = new JLabel("");
			ImagemVisual.setEnabled(false);
			ImagemVisual.setIcon(new ImageIcon(PanelCadastro2.class.getResource("/visao/Px-68 com fundo.png")));
			ImagemVisual.setBounds(23, 141, 205, 1);
		}
		return ImagemVisual;
	}
}
