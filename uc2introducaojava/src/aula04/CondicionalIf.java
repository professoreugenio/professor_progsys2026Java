package aula04;

import java.util.Scanner;

public class CondicionalIf {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String aluno;
		double media;
		
		
		System.out.println("DIGITE O NOME DO ALUNO");
		aluno = entrada.nextLine();
		
		
		System.out.println("DIGITE A MÉDIA");
		media = entrada.nextDouble();
		
		if (media >= 7) {
            System.out.println(aluno + " está aprovado.");
        } else if (media >= 5) {
            System.out.println(aluno + " está em recuperação.");
        } else {
            System.out.println(aluno + " está reprovado.");
        }
		
		entrada.close();
		
		
		
		

	}

}
