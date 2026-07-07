package aula7;

import java.util.Scanner;

public class Switchativ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao = -1;
		int condicao=1;

		Scanner input = new Scanner(System.in);
		
		
		do {
			
			System.out.println("DIGITE UM NÚMERO:");

			if (input.hasNextInt()) {

				opcao = input.nextInt();

				switch (opcao) {
				case 0: {
					
					System.out.println("Opção 0 Sair");
					condicao = 0;
					break;
				}
				case 1: {

					System.out.println("Opção 1 Cadastrar produtos");
					break;
				}
				case 2: {

					System.out.println("Opção 2 Listar produtos");
					break;
				}
				case 3: {
					
					System.out.println("Opção 3 Excluir produtos");
					break;
				}
				case 4: {
					
					System.out.println("Opção  4 Editar produto");
					break;
				}
				default:
					System.out.println("Opção não disponível");
				}

			} else {

				System.out.println(opcao + " não é um Número inválido");

			}
			
			
		}while(condicao!=0);
		
		System.out.println("SISTEMA ENCERRADO");
		

	}

}
