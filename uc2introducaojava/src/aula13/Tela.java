package aula13;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Tela {
	
	void exibeTela() {
		tela.setTitle("Minha primeira tela Java");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        tela.setVisible(true);
        
        JLabel titulo = new JLabel("TÍTULO DA JANELA");
	}

}
