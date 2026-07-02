package aula03;

import javax.swing.JOptionPane;


public class JoptinPaneativ {
	
	public static void main(String[] args) {
		
		String produto = "Mouse";
        double preco = 39.9;
        int quantidade = 2;
        double total = preco * quantidade;
        

        String mensagem = String.format(
                "Produto: %s%nPreço: R$ %.2f%nQuantidade: %d%nTotal: R$ %.2f",
                produto,
                preco,
                quantidade,
                total
                
                
        );

        JOptionPane.showMessageDialog(null, mensagem);
	}

}
