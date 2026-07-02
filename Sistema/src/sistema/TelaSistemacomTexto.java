package sistema;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Font;

public class TelaSistemacomTexto {
	public static void main(String[] args) {

		JFrame tela = new JFrame();

		tela.setTitle("Tela do Sistema");
		tela.setSize(500, 350);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);

		JLabel nomeSistema = new JLabel("Sistema de Cadastro", SwingConstants.CENTER);
		nomeSistema.setFont(new Font("Arial", Font.BOLD, 28));
		nomeSistema.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		
		tela.add(nomeSistema, BorderLayout.NORTH);

		

		tela.setVisible(true);
	}
}
