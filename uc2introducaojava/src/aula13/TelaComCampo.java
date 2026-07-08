package aula13;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaComCampo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame tela = new JFrame();

        tela.setTitle("Tela com Campo de Texto");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(20);
        
        campoNome.getText();
        System.out.println(campoNome);


        painel.add(labelNome);
        painel.add(campoNome);

        tela.add(painel);

        tela.setVisible(true);

	}

}
