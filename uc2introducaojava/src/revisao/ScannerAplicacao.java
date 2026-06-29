package revisao;

import java.util.Scanner; // inportando a biblioteca Scanner

public class ScannerAplicacao {

	public static void main(String[] args) {

		String nome;

		Scanner input = new Scanner(System.in);
		// atribuindo o scanner à variável input

		System.out.println("DIGITE SEU NOME: ");
		nome = input.nextLine();
		// vai armazenar no nome os dados inseridos no input
		

		System.out.println("O nome digitado foi: " + nome);

		input.close(); // fecha a aplicação do scanner

	}

}
