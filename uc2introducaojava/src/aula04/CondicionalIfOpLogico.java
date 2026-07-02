package aula04;

public class CondicionalIfOpLogico {
	public static void main(String[] args) {
		int idade,opcao;
		double renda;
		boolean ativo;
		
		idade = 55;
		opcao = 1;
		renda = 2450;
		ativo = false;
		
		if(idade>=18 && renda>=1500) {
		    System.out.println("Cadastro aprovado.");

		} else {
		    System.out.println("Cliente for dos padrões.");

		}
		
		if(opcao ==1 || opcao ==2) {
		    System.out.println("pções válidas");

		} else {
		    System.out.println("Opção inválida.");
		}
		
		if(!ativo) {
		    System.out.println("Sistema inativo."+ativo);

		}
		
		
	}

}
