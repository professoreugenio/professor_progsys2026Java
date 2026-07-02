package aula04;

import java.util.Scanner;

public class CondicionalifOficina {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		double media, bim1,bim2,bim3,bim4;
		int contador = 1;
		
		media = 0;
		while(contador==1) {
			
			System.out.println("DIGITE A NOTA DO 1º BIMESTRE: ");
			bim1 = input.nextDouble();
			
			System.out.println("DIGITE A NOTA DO 2º BIMESTRE: ");
			bim2 = input.nextDouble();
			
			System.out.println("DIGITE A NOTA DO 3º BIMESTRE: ");
			bim3 = input.nextDouble();
			
			System.out.println("DIGITE A NOTA DO 4º BIMESTRE: ");
			bim4 = input.nextDouble();
			
			media = (bim1+bim2+bim3+bim4)/4;
			
			if(media>=7) {
				System.out.printf("APROVADO com média %.1f%n",media);
			}else if(media>=4) {
				System.out.printf("RECUPERAÇÃO com média %.1f%n",media);			
			}else {
				System.out.printf("REPROVADO com média %.2f%n",media);
				
			}
			
			
			System.out.println("CANCELAR DIGITE: 0\nCONTINUAR DIGITE: 1");
			contador = input.nextInt();
			if(contador>1) {
				System.out.println("número inválido");
				contador=1;
			}
			
			
		}
		System.out.println("SISTEMA ENCERRADO");
		input.close();
		
		
		
		
		
		
		
		
		

	}
}
