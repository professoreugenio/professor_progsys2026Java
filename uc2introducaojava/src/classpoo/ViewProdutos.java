package classpoo;

import aula05.Calculadora;

public class ViewProdutos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produtos produto1 = new Produtos();
		
		produto1.nome="CARRO";
		produto1.preco=25250.50;
		produto1.estoque=3;
		
		produto1.exibirDados();
		
		double total = produto1.calcular();
		System.out.printf("R$ %.2f%n",total);

	}

}
