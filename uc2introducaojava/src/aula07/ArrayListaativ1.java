package aula07;

import java.util.ArrayList;

public class ArrayListaativ1 {

	public static void main(String[] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("PAULA LINS");
		nomes.add("JOSÉ AMARO");
		nomes.add("ROBERTO CARLOS");
		
		System.out.println("TOTAL REGISTRO:"+nomes.size());
		
		for(String mickey : nomes) {
			System.out.println(mickey);
		}
		
		
		

	}

}
