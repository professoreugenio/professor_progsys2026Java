package aula05;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		
		HoraDatapadrao datahora = new HoraDatapadrao();
		
		Scanner input = new Scanner(System.in);
		int numero, valida = 1;
		
		while(valida==1) {
			
			System.out.println("Em: "+ datahora.dataFormatada()+"\nDIGITE UM NÚMERO PARA VER A TABUADA\nDigite 0 para sair");
			numero = input.nextInt();
			
			for(int i = 1; i<=10;i++) {			
				System.out.println(numero + " x "+ i + " = " + (numero * i));
			}
			
			if(numero==0) {
				valida=0;
			}
		}
		input.close();
		
		System.out.println("\n\n----------------------------------\n"
				+ "\nSAIU DA TABUADA\n\n" + 
				"----------------------------------");
		
	}

}
