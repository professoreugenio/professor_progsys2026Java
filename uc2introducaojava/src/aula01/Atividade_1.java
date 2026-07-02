package aula01;
import java.util.Scanner;
public class Atividade_1 {

	public static void main(String[] args) {
		
		String nome, profissao,email;
		int idade;
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("DIGITE SEU NOME: ");
		nome = input.nextLine();
		
		System.out.println("DIGITE SEU E-MAIL");
		email = input.nextLine();
		
		System.out.println("DIGITE SUA IDADE: ");
		idade = input.nextInt();
		input.nextLine();
		
		System.out.println("DIGITE SUA PROFISSÃO: ");
		profissao = input.nextLine();
		
		
		System.out.println("CADASTRO DE USUÁRIO");
		System.out.println("NOME: "+ nome);
		System.out.println("E-MAIL: "+ email);
		System.out.println("IDADE: "+ idade);
		System.out.println("PROFISSÃO: "+ profissao);
		
		
		
		input.close();
		
		
		
		
		
		
		

	}

}
