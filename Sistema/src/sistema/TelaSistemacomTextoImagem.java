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
import javax.swing.ImageIcon;
import java.awt.Image;

public class TelaSistemacomTextoImagem {
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
		subtituloSistema2.setForeground(new Color(0, 51, 102));

		// Adicionando título e subtítulo ao painel
		painelCabecalho.add(nomeSistema);
		painelCabecalho.add(subtituloSistema);
		painelRodape.add(subtituloSistema2);

		// Carregando a imagem original
		ImageIcon logoOriginal = new ImageIcon("imagem/logo.png");

		// Ajustando o tamanho da imagem
		int larguraDesejada = 180;

		// Pegando o tamanho original da imagem
		int larguraOriginal = logoOriginal.getIconWidth();
		int alturaOriginal = logoOriginal.getIconHeight();

		// Calculando a altura automaticamente
		int alturaAutomatica = (larguraDesejada * alturaOriginal) / larguraOriginal;

		// Redimensionando mantendo a proporção
		Image imagemRedimensionada = logoOriginal.getImage().getScaledInstance(
				larguraDesejada,
				alturaAutomatica,
				Image.SCALE_SMOOTH
		);

		// Criando o novo ImageIcon com a imagem redimensionada
		ImageIcon logo = new ImageIcon(imagemRedimensionada);

		// Criando o JLabel da imagem
		JLabel imagemLogo = new JLabel(logo);
		imagemLogo.setHorizontalAlignment(SwingConstants.CENTER);
		imagemLogo.setVerticalAlignment(SwingConstants.CENTER);

		// Painel exclusivo para controlar a posição da imagem
		JPanel painelImagem = new JPanel(new BorderLayout());

		// Espaçamento: topo, esquerda, baixo, direita
		painelImagem.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));

		// Adicionando a imagem dentro do painel
		painelImagem.add(imagemLogo, BorderLayout.WEST);

		// Adicionando o painel ao topo da tela
		tela.add(painelCabecalho, BorderLayout.NORTH);
		tela.add(painelRodape, BorderLayout.SOUTH);
		tela.add(imagemLogo, BorderLayout.CENTER);

		tela.setVisible(true);

	}
}
