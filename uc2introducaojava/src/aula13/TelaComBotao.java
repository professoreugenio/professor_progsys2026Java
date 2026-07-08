package aula13;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;


public class TelaComBotao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame tela = new JFrame();

        tela.setTitle("Tela com Botão");
        tela.setSize(500, 350);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLocationRelativeTo(null);

        JPanel painel = new JPanel();

        JLabel labelNome = new JLabel("Nome:");
        JTextField campoNome = new JTextField(30);
        JButton botaoEnviar = new JButton("Enviar");
        JButton botaoSair = new JButton("Sair");
        JLabel mensagem = new JLabel("Digite seu nome e clique em Enviar.");

        botaoEnviar.addActionListener(e -> {
            String nome = campoNome.getText();

            mensagem.setText("Olá, " + nome + "!");
            campoNome.setText("");

        });
        
        

        painel.add(labelNome);
        painel.add(campoNome);
        painel.add(botaoEnviar);
        painel.add(botaoSair);
        painel.add(mensagem);

        tela.add(painel);

        tela.setVisible(true);

	}

}
