package aula08.poo;

public class Pessoa {
	String nome, nacionalidade,sexo,profissao;
	int idade;
	double altura,peso;
	
	void exibirPessoa() {
		System.out.println("Nome: "+nome);
		System.out.println("Idade: "+idade);
		System.out.println("Nacionalidade: "+nacionalidade);
	}
	
	void exibirDadosExtras() {
		System.out.println("Sexo: "+sexo);
		System.out.println("Profissão: "+profissao);
		System.out.println("Altura: "+altura);
		System.out.println("Peso: "+peso+"\n");
		System.out.println("========================");
	}
	
	

}
