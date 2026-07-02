package sistema;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.BorderFactory;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.Color;


public class TelaSostemacomSubtitulo {
	
	public static void main(String[] args) {
		JFrame tela = new JFrame();

		tela.setTitle("Tela do Sistema");
		tela.setSize(600, 450);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLocationRelativeTo(null);

		// Criando o painel do cabeçalho
		JPanel painelCabecalho = new JPanel();
		painelCabecalho.setLayout(new GridLayout(3, 1));
		painelCabecalho.setBorder(BorderFactory.createEmptyBorder(30, 0, 0, 0));
		
		// Criando o painel do RODAPÉ
		JPanel painelRodape = new JPanel();
		painelRodape.setLayout(new GridLayout(3, 1));
		painelRodape.setBorder(BorderFactory.createEmptyBorder(0, 30, 0, 0));

		// Título do sistema
		JLabel nomeSistema = new JLabel("Sistema de Cadastro", SwingConstants.CENTER);
		nomeSistema.setFont(new Font("Arial", Font.BOLD, 28));
		nomeSistema.setForeground(new Color(0, 102, 204));

		// Subtítulo do sistema
		JLabel subtituloSistema = new JLabel("controle de estoque", SwingConstants.CENTER);
		subtituloSistema.setFont(new Font("Arial", Font.PLAIN, 18));
		subtituloSistema.setForeground(new Color(2, 51, 204));
		
		// Subtítulo do sistema
		JLabel subtituloSistema2 = new JLabel("Professor Eugênio", SwingConstants.LEFT);
		subtituloSistema2.setFont(new Font("Arial", Font.PLAIN, 12));
		subtituloSistema2.setForeground(new Color(0, 51, 102	));

		// Adicionando título e subtítulo ao painel
		painelCabecalho.add(nomeSistema);
		painelCabecalho.add(subtituloSistema);
		painelRodape.add(subtituloSistema2);

		
		// Adicionando o painel ao topo da tela
		tela.add(painelCabecalho, BorderLayout.NORTH);
		tela.add(painelRodape, BorderLayout.SOUTH);

		

		tela.setVisible(true);
	}

}
