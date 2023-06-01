package visao;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelUser extends JPanel {
	public PanelUser() {
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
		btnVoltar.setIcon(new ImageIcon(PanelUser.class.getResource("/assets/Seta voltar.png")));
		btnVoltar.setBounds(1, 2, 27, 22);
		add(btnVoltar);
		
		JLabel lblScore = new JLabel("<html><body>Score<br>0/10</body></html>");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Century Gothic", Font.PLAIN, 14));
		lblScore.setBounds(186, 119, 75, 64);
		add(lblScore);
		
		JLabel lblTexto2 = new JLabel("Respostas enviadas: 0");
		lblTexto2.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTexto2.setHorizontalAlignment(SwingConstants.LEFT);
		lblTexto2.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 13));
		lblTexto2.setBounds(10, 146, 130, 14);
		add(lblTexto2);
		
		JLabel lblTexto3 = new JLabel("Ajudas: 0");
		lblTexto3.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTexto3.setHorizontalAlignment(SwingConstants.LEFT);
		lblTexto3.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 13));
		lblTexto3.setBounds(10, 171, 130, 14);
		add(lblTexto3);
		
		JLabel lblTexto1 = new JLabel("Perguntas respondidas: 0");
		lblTexto1.setVerticalAlignment(SwingConstants.BOTTOM);
		lblTexto1.setHorizontalAlignment(SwingConstants.LEFT);
		lblTexto1.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 13));
		lblTexto1.setBounds(10, 121, 130, 14);
		add(lblTexto1);
		
		JLabel lblNomeUsuario = new JLabel("Nome do Usuario");
		lblNomeUsuario.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNomeUsuario.setFont(new Font("Barlow Condensed Light", Font.PLAIN, 17));
		lblNomeUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblNomeUsuario.setBounds(105, 53, 169, 29);
		add(lblNomeUsuario);
		
		JLabel lblImagem = new JLabel("");
		lblImagem.setIcon(new ImageIcon(PanelUser.class.getResource("/assets/Teste fundo com avatar.png")));
		lblImagem.setBounds(0, 0, 284, 236);
		add(lblImagem);
	}

}
