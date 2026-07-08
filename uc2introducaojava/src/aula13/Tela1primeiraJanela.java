package aula13;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.BorderLayout;
import java.awt.Font;


public class Tela1primeiraJanela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame tela = new JFrame();
		
		JPanel painel = new JPanel();

        tela.setTitle("Minha primeira tela Java");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);
        
        
        JLabel titulo = new JLabel("PAINAL SISTEMA");
        titulo.setFont(new Font("Arial", Font.BOLD, 24));
        titulo.setHorizontalAlignment(SwingConstants.CENTER);       
        titulo.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
        
        JLabel subtitulo = new JLabel("Professor Eugênio");
        subtitulo.setFont(new Font("Arial", Font.PLAIN, 10));
        subtitulo.setHorizontalAlignment(SwingConstants.RIGHT);       
        subtitulo.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 20));
        
        
        
        
        painel.setLayout(new BorderLayout());
        painel.add(titulo,BorderLayout.NORTH);
        painel.add(subtitulo,BorderLayout.SOUTH);
        tela.add(painel);
        tela.setVisible(true);
        

	}

}
