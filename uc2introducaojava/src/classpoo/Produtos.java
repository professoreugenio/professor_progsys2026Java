package classpoo;

public class Produtos {
	
	String nome;
	double preco;
	int estoque;
	
	void exibirDados() {
		System.out.println("Produto: "+nome);
		System.out.println("Preço unit: "+preco);
		System.out.println("Estoque: "+estoque);
	}
	
	double calcular() {
		return preco * estoque;
	}

}
