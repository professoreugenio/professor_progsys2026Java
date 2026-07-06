package aula06;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String[] nomes = new String[3];
		
		for(int i = 0; i< nomes.length;i++) {
			System.out.println("Digite o "+(i+1)+"º nome;");
			nomes[i] = entrada.nextLine();
		}
		
		
		for(int i = 0; i< nomes.length;i++) {
			System.out.println("Nomes: "+nomes[i]);
		}
		
		

	}

}
