package view;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class TelaTestePainel extends JFrame {

    private static final long serialVersionUID = 1L;

    public TelaTestePainel() {
        setTitle("Teste do Painel de Cadastro de Produtos");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 800, 500);
        setLocationRelativeTo(null);

        setContentPane(new PainelCadastrarProduto());
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            TelaTestePainel tela = new TelaTestePainel();
            tela.setVisible(true);
        });
    }
}
