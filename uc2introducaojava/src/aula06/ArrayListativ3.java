package aula06;

import java.util.ArrayList;

public class ArrayListativ3 {
	
	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Paula Lins");
		nomes.add("João Paulo");
		nomes.add("Francisca Lins");
		
		
		
		for(int i = 0; i<nomes.size();i++) {
			
			System.out.println("Nomes: " + nomes.get(i));
		}
		
		
	}

}
