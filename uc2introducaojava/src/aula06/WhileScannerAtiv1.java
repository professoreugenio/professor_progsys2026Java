package aula06;

import java.util.Scanner;

public class WhileScannerAtiv1 {

	public static void main(String[] args) {
		int condicao = 1, contador = 0, limite = 2;

		String senha = "eug123", senhadigitada="", resultado = "";
		Scanner input = new Scanner(System.in);

		while (contador++ < limite) {
			System.out.println("Tentativas:" + contador + " de " + limite);
			System.out.println("DIGITE A SENHA:");
			senhadigitada = input.nextLine();

			if (senhadigitada.equals(senha)) {
				resultado = "ACESSO LIBERADO\nSeja bem vindo ao sistema";
				contador = 2;
			} else {
				resultado = "SENHA INCORRETA";
			}
			
			System.out.println(resultado);

		}
		if (contador == limite&& senhadigitada.equals(senha)) {
			resultado = "\nSISTEMA ENCERRADO!";
			
		}

		System.out.println(resultado);

	}

}
