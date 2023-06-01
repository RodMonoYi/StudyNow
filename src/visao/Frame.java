package visao;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.UIManager;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.DebugGraphics;
import java.awt.CardLayout;
import java.awt.ComponentOrientation;


public class Frame extends JFrame {
	private JMenuBar menuBar;
	private JMenu mnNewMenu;
	private JMenuItem mntmNewMenuItem;
	private JPanel panelRobo;
	public static JPanel panelPlaceHolder;
	private JButton btnAvancar;
	private JLabel textoRobo;
	private JMenuItem mntmNewMenuItem_2;
	public static PanelHome panelHome = new PanelHome();



	public Frame() {
		setTitle("Study Now");
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		setJMenuBar(getMenuBar_1());
		getContentPane().setLayout(null);
		getContentPane().add(getPanelRobo());
		getContentPane().add(getPanelPerguntas());
		setResizable(false);
		
	}

	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setToolTipText("");
			menuBar.add(getMnNewMenu());
		}
		return menuBar;
	}
	private JMenu getMnNewMenu() {
		if (mnNewMenu == null) {
			mnNewMenu = new JMenu("Cadastro");
			mnNewMenu.add(getMntmNewMenuItem());
			mnNewMenu.add(getMntmNewMenuItem_2());
		}
		return mnNewMenu;
	}
	public JMenuItem getMntmNewMenuItem() {
		if (mntmNewMenuItem == null) {
			mntmNewMenuItem = new JMenuItem("Pessoa");
		}
		return mntmNewMenuItem;
	}
	private JPanel getPanelRobo() {
		if (panelRobo == null) {
			panelRobo = new JPanel();
			panelRobo.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
			panelRobo.setBounds(2, 0, 145, 234);
			panelRobo.setLayout(null);
			
			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.setFont(new Font("Tahoma", Font.PLAIN, 10));
			btnVoltar.setFocusPainted(false);
			btnVoltar.setBounds(2, 2, 72, 23);
			panelRobo.add(btnVoltar);
			panelRobo.add(getBtnNewButton_1());
			panelRobo.add(getLblNewLabel_1());
			
			JLabel lblImagemRobo = new JLabel("");
			lblImagemRobo.setBorder(null);
			lblImagemRobo.setBounds(3, 24, 141, 208);
			lblImagemRobo.setIcon(new ImageIcon(Frame.class.getResource("/visao/Px-68 com fundo e sem qualidade - Copia.png")));
			panelRobo.add(lblImagemRobo);
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					panelHome.setVisible(true);
					
					panelPlaceHolder.removeAll();
					panelPlaceHolder.setLayout(new CardLayout(0, 0));
					panelPlaceHolder.add(panelHome, "name_27870330385800");
					panelPlaceHolder.repaint();
					panelPlaceHolder.revalidate();
					
					
					btnAvancar.setEnabled(true);//Codigo q fiz so pra teste
					textoRobo.setText("Você clicou em voltar");
				}
			});
		}
		return panelRobo;
	}
	private JPanel getPanelPerguntas() {
		if (panelPlaceHolder == null) {
			panelPlaceHolder = new JPanel();
			panelPlaceHolder.setBounds(147, 0, 287, 234);
			
			
			
			panelHome.getBtnLogin().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					Login login = new Login();
					login.setVisible(true);
					
					panelPlaceHolder.removeAll();
					panelPlaceHolder.setLayout(new CardLayout(0, 0));
					panelPlaceHolder.add(login, "name_27870330385800");
					panelPlaceHolder.repaint();
					panelPlaceHolder.revalidate();
					
				}
			});
			panelHome.getBtnCadastro().addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					PanelCadastro2 cadastro = new PanelCadastro2();
					cadastro.setVisible(true);
					
					panelPlaceHolder.removeAll();
					panelPlaceHolder.setLayout(new CardLayout(0, 0));
					panelPlaceHolder.add(cadastro, "name_27870330385800");
					panelPlaceHolder.repaint();
					panelPlaceHolder.revalidate();
					
				}
			});
			panelHome.getBtnCadastro().setFont(new Font("Calibri", Font.PLAIN, 19));
			panelHome.getBtnCadastro().setVerticalAlignment(SwingConstants.BOTTOM);
			panelHome.getBtnLogin().setFont(new Font("Calibri", Font.PLAIN, 19));
			panelHome.getBtnLogin().setVerticalAlignment(SwingConstants.BOTTOM);
			
			//aqui eu carrego o jpanel tela
			carregarPanel(panelHome);
			panelHome.setVisible(true);
			
		
		}
		return panelPlaceHolder;
	}
	private JButton getBtnNewButton_1() {
		if (btnAvancar == null) {
			btnAvancar = new JButton("Avançar");
			btnAvancar.setFont(new Font("Tahoma", Font.PLAIN, 9));
			btnAvancar.setEnabled(false);
			btnAvancar.setFocusPainted(false);
			btnAvancar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnAvancar.setBounds(73, 2, 71, 23);
		}
		return btnAvancar;
	}
	private JLabel getLblNewLabel_1() {
		if (textoRobo == null) {
			textoRobo = new JLabel("Seja Bem-Vindo!");
			textoRobo.setHorizontalAlignment(SwingConstants.CENTER);
			textoRobo.setOpaque(true);
			textoRobo.setBounds(10, 200, 125, 23);
			textoRobo.setBorder(null);
			textoRobo.setBackground(new Color(255, 255, 255));
		}
		return textoRobo;
	}
	private JMenuItem getMntmNewMenuItem_2() {
		if (mntmNewMenuItem_2 == null) {
			mntmNewMenuItem_2 = new JMenuItem("Home");
			mntmNewMenuItem_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					PanelHome obj = new PanelHome();
					panelPlaceHolder.add(obj);
					obj.setVisible(true);
				}
			});
		}
		return mntmNewMenuItem_2;
	}
	public static void carregarPanel(JPanel j) {		
		j.setVisible(true);
		panelPlaceHolder.removeAll();
		panelPlaceHolder.setLayout(new CardLayout(0, 0));
		panelPlaceHolder.add(j, "name_27870330385800");
		panelPlaceHolder.repaint();
		panelPlaceHolder.revalidate();
	}
	//public static void removerHome () {
	//	panelPerguntas.remove(tela);
	//}
}
