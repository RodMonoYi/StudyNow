package controle;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.UnsupportedLookAndFeelException;

import visao.Frame;
import visao.PanelCadastro2;
import visao.PanelRobo;


public class ControladorFrame {

	Frame f;
	
	public ControladorFrame() {
		
		f = new Frame();	
		f.repaint();
		f.validate();	
		
	}
		



	public static void main(String[] args) {
		try {
			for(javax.swing.UIManager.LookAndFeelInfo info: javax.swing.UIManager.getInstalledLookAndFeels()) {
				if("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch(ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
			System.err.println(e);
		}
		new ControladorFrame();
	}

}
