package controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import modelo.Pessoa;
import visao.PanelCadastro2;

public class ControladorCadastro implements ActionListener{

	PanelCadastro2 pc2;
	ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	public ControladorCadastro(PanelCadastro2 pc2) {
		
		this.pc2 = pc2;
		addEventos();
		
		
	}

	private void addEventos() {
		pc2.getBtcadastro().addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == pc2.getBtcadastro()) {
			cadastrarPessoa();
			
		}
		
	}

	private void cadastrarPessoa() {
		Pessoa p = new Pessoa(pc2.getTextFieldNome().getText(), pc2.getTextFieldCPF().getText(), pc2.getTextFieldLogin().getText(), pc2.getPasswordFieldRepass().getText());
		pessoas.add(p);
		
	}
}
