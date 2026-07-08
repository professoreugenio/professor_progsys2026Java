package aula13;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;



public class TelaComPainel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame tela = new JFrame();

        tela.setTitle("Tela com JPanel");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setBackground(Color.LIGHT_GRAY);

        tela.add(painel);

        tela.setVisible(true);

	}

}
