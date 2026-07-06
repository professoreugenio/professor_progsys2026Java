package sistema;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Dimension;

public class TelaSistemaComMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame tela = new JFrame();

        tela.setTitle("Professor Eugênio");
        tela.setSize(800, 600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        // Criando a barra de menu
        JMenuBar barraMenu = new JMenuBar();

        // Configurando altura da barra de menu
        barraMenu.setPreferredSize(new Dimension(500, 40));

        // Criando os menus principais
        JMenu menuArquivo = new JMenu("Arquivo");
        JMenu menuCadastro = new JMenu("Cadastro");
        JMenu menuAjuda = new JMenu("Ajuda");

        // Fonte dos menus principais
        Font fonteMenu = new Font("Arial", Font.BOLD, 16);

        menuArquivo.setFont(fonteMenu);
        menuCadastro.setFont(fonteMenu);
        menuAjuda.setFont(fonteMenu);

        // Configurando tamanho dos menus principais
        menuArquivo.setPreferredSize(new Dimension(100, 40));
        menuCadastro.setPreferredSize(new Dimension(120, 40));
        menuAjuda.setPreferredSize(new Dimension(100, 40));

        // Criando os itens do menu Arquivo
        JMenuItem itemNovo = new JMenuItem("Novo");
        JMenuItem itemSair = new JMenuItem("Sair");

        // Criando os itens do menu Cadastro
        JMenuItem itemCliente = new JMenuItem("Cliente");
        JMenuItem itemProduto = new JMenuItem("Produto");

        // Criando os itens do menu Ajuda
        JMenuItem itemSobre = new JMenuItem("Sobre");

        // Fonte dos itens internos do menu
        Font fonteItemMenu = new Font("Arial", Font.PLAIN, 15);

        itemNovo.setFont(fonteItemMenu);
        itemSair.setFont(fonteItemMenu);
        itemCliente.setFont(fonteItemMenu);
        itemProduto.setFont(fonteItemMenu);
        itemSobre.setFont(fonteItemMenu);

        // Configurando tamanho das opções internas do menu
        Dimension tamanhoItem = new Dimension(180, 35);

        itemNovo.setPreferredSize(tamanhoItem);
        itemSair.setPreferredSize(tamanhoItem);
        itemCliente.setPreferredSize(tamanhoItem);
        itemProduto.setPreferredSize(tamanhoItem);
        itemSobre.setPreferredSize(tamanhoItem);

        // Ação do item Sair
        itemSair.addActionListener(e -> {
            System.exit(0);
        });

        // Ação do item Sobre
        itemSobre.addActionListener(e -> {
            JOptionPane.showMessageDialog(
                    tela,
                    "Sistema de Cadastro\nVersão 1.0\nDesenvolvido em Java Swing",
                    "Sobre o Sistema",
                    JOptionPane.INFORMATION_MESSAGE
            );
        });

        // Adicionando itens ao menu Arquivo
        menuArquivo.add(itemNovo);
        menuArquivo.addSeparator();
        menuArquivo.add(itemSair);

        // Adicionando itens ao menu Cadastro
        menuCadastro.add(itemCliente);
        menuCadastro.add(itemProduto);

        // Adicionando itens ao menu Ajuda
        menuAjuda.add(itemSobre);

        // Adicionando os menus à barra
        barraMenu.add(menuArquivo);
        barraMenu.add(menuCadastro);
        barraMenu.add(menuAjuda);

        // Aplicando a barra de menu na tela
        tela.setJMenuBar(barraMenu);

        tela.setVisible(true);

	}

}
