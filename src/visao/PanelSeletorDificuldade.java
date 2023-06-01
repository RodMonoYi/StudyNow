package visao;

import javax.swing.JPanel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JCheckBoxMenuItem;
import java.awt.List;
import java.awt.Choice;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelSeletorDificuldade extends JPanel {
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	int checar;
	public PanelSeletorDificuldade() {
		setLayout(null);
		JButton btnVoltar = new JButton("");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PanelWelcome seletor = new PanelWelcome();
				Frame.carregarPanel(seletor);
			}
		});
		btnVoltar.setContentAreaFilled(false);
		btnVoltar.setBorder(null);
		btnVoltar.setBorderPainted(false);
		btnVoltar.setIcon(new ImageIcon(PanelSeletorDificuldade.class.getResource("/assets/Seta voltar.png")));
		btnVoltar.setBounds(1, 2, 27, 22);
		add(btnVoltar);
		
		add(getBtnNewButton());
		add(getLblNewLabel());
		add(getChckbxNewCheckBox());
		add(getChckbxNewCheckBox_1());
		add(getChckbxNewCheckBox_2());
		add(getChckbxNewCheckBox_3());
		add(getComboBox_1());
		add(getLblNewLabel_1());
		checar=0;
		
		
		
	}
	
	
	public JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("Mutliplicação");
			chckbxNewCheckBox.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checagem(chckbxNewCheckBox);
				}
			});
			chckbxNewCheckBox.setBackground(new Color(255, 255, 255));
			chckbxNewCheckBox.setBounds(39, 101, 97, 23);
		}
		return chckbxNewCheckBox;
	}
	public JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("Divisão");
			chckbxNewCheckBox_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checagem(chckbxNewCheckBox_1);
				}
			});
			chckbxNewCheckBox_1.setBackground(Color.WHITE);
			chckbxNewCheckBox_1.setBounds(39, 127, 97, 23);
		}
		return chckbxNewCheckBox_1;
	}
	public JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("Adição");
			chckbxNewCheckBox_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checagem(chckbxNewCheckBox_2);
				}
			});
			chckbxNewCheckBox_2.setBackground(Color.WHITE);
			chckbxNewCheckBox_2.setBounds(39, 153, 97, 23);
		}
		return chckbxNewCheckBox_2;
	}
	public JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("Subtração");
			chckbxNewCheckBox_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					checagem(chckbxNewCheckBox_3);					
				}
			});
			chckbxNewCheckBox_3.setBackground(Color.WHITE);
			chckbxNewCheckBox_3.setBounds(39, 179, 97, 23);
		}
		return chckbxNewCheckBox_3;
	}
	public JComboBox getComboBox_1() {
		if (comboBox_1 == null) {
			comboBox_1 = new JComboBox();
			comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Fácil", "Difícil", "Médio"}));
			comboBox_1.setBounds(202, 101, 54, 22);
		}
		return comboBox_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setIcon(new ImageIcon(PanelSeletorDificuldade.class.getResource("/assets/Teste fundo.png")));
			lblNewLabel_1.setBounds(0, 0, 287, 234);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			//lblNewLabel = new JLabel("Para prosseguirmos, \b\ffiltre o nivel de perguntas");
			lblNewLabel = new JLabel("<html><body>Agora filtre as questões<br>que você quer resolver!</body></html>" );
			lblNewLabel.setLocation(44, 40);
			lblNewLabel.setSize(202, 54);
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 19));
		}
		return lblNewLabel;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("");
			btnNewButton.setContentAreaFilled(false);
			btnNewButton.setBackground(new Color(255, 255, 255));
			btnNewButton.setBorder(null);
			btnNewButton.setBorderPainted(false);
			btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rodrigo\\Downloads\\button_buscar.png"));
			btnNewButton.setBounds(364, 349, 89, 23);
			
		}
		return btnNewButton;
	}
	public void checagem(JCheckBox cb) {
		if(cb.isSelected()) {
			checar++;
		}
		else{
			checar--;
		}
		if (checar >= 1) {
			btnNewButton.setBounds(177, 149, 89, 23);
		}
		else {
			btnNewButton.setBounds(364, 349, 89, 23);
		}
	}
}
