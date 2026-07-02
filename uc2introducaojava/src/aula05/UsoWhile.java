package aula05;
import java.util.Scanner;;
public class UsoWhile {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int contador = 1, numero, limite = 5;
				
		while(contador <=5) {
			
			System.out.println("DIGITE UM NÚMERO");
			numero = input.nextInt();
			int expira = limite-contador;
		
			System.out.println("Tentativas Restantes: "+expira+" de " + limite);
			contador++;
		}
		System.out.println("Você excedeu o limite de"+ contador +" tentativas");
	}

}
