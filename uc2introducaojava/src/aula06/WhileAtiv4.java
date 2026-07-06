package aula06;

import java.util.Scanner;

public class WhileAtiv4 {

	public static void main(String[] args) {
		int valida = 1, codigo, contador = 0, limite = 5;

		Scanner input = new Scanner(System.in);

		while (valida == 1) {
			contador++;
			System.out.println(contador+"ª Tentativa");
			System.out.println("DIGITE UM CÓDIGO: ");
			codigo = input.nextInt();

			if (contador == limite) {
				valida = 0;
			}

		}

		System.out.println("Sistema encerrado");

	}

}
