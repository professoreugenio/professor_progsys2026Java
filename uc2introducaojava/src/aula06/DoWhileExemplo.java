package aula06;
import java.util.Scanner;
public class DoWhileExemplo {

	public static void main(String[] args) {
		int condicao ;
		
		String[] menu = {
				"1-CADASTRO DE PRODUTO",
				"2-LISTAR PRODUTOS",
				"3-CONSULTAR PRODUTO",
				"0-SAIR"
		};
		
		Scanner input = new Scanner(System.in);
		
		do {
			String lista ="";
			
			for(int i=0; i<menu.length;i++) {
				lista+= menu[i]+"\n";
			}
			
			System.out.println(lista);
		condicao = input.nextInt();
			
		}while(condicao!= 0);
		
		System.out.println("\n\nEncerrado");

	}

}
