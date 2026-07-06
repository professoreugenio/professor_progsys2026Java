package aula06;

public class ForAtiv1 {

	public static void main(String[] args) {
		
		// For para repetição
		
		String[] pessoas = {
				"Paula Lins","Carlos Antônio",
				"José Maria", "Eduardo Melo"
		};
		
		for(int i=0;i<pessoas.length;i++) {
			
			System.out.println((i+1)+"-Repetição: "+pessoas[i]);
		}
		
		System.out.println("\nVALOR DE UM ARRAY\nNome:"+pessoas[2]+"-índice num: 2 ");

	}

}
