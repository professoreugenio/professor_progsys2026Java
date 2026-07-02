package aula02.Desafios_aula02;

import java.util.Scanner;
import java.util.Locale;

public class desafio_01 {
	
	public static void main(String[] args) {
		
		double valor;
		
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("DIGITE UM VALOR: ");
		

		valor = input.nextDouble();
		
		System.out.println("valor: "+ valor);
		
		input.close();
		
		
	}

}
