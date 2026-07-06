package aula06;

public class ArraysMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] notas = {6.5,2.0,3.0,6.0};
		double soma = 0, media ;
		String resultado ="";
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Notas avaliação "+(i+1)+" : "+notas[i]);
            soma = soma + notas[i];
        }
		
		media = soma/notas.length;
		
		if(media>=7) { resultado = "Aprovado"; }
		else if(media>=4) { resultado = "Recuperação";}
		else { resultado = "Reprovado";}
		
		System.out.printf("Média final: %.2f%n ",media );
		System.out.println("analise: "+ resultado);
		
		

	}

}
