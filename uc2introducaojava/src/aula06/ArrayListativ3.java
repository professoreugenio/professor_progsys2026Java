package aula06;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListativ3 {
	
	public static void main(String[] args) {
		
		int condicao=1;
		String produto;
		
		ArrayList<String> nomes = new ArrayList<String>();
		Scanner input = new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("DIGITE UM novo NOME ");
			produto = input.nextLine();
			
			if(produto!="") {
				
				nomes.add(produto);
				System.out.println("TOTAL REGISTROS: "+nomes.size());
				
				for(int i = 0; i<nomes.size();i++) {
					
					System.out.println("Nomes: " + nomes.get(i));
				}
			} 
			
			
			
			
			
		}while(condicao!=0);
		
		
		
		
		
	}

}
