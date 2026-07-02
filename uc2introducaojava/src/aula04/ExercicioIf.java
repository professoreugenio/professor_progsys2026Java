package aula04;
import java.util.Scanner;
public class ExercicioIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		int opcao,estoque;
		String produto;
		double valor;
		
		System.out.println("SISTEMA DE ESTOQUE\n Digite o código do produto:\n1-CARRO.\n2-AVIÃO:\n");
		opcao = input.nextInt();
		
		if(opcao==1) {
			produto = "CARRO";
			valor = 45850.85;
			estoque = 10;
		} else if (opcao==2) {
			produto = "AVIÃO";
			valor = 200.50;
			estoque = 0;
		} else {
			produto = "";
			valor = 0;
			estoque = 0;
		}
		
		if(opcao==0 || opcao>2) {
			System.out.println("Produto não identificado");
		} else if(estoque<1) {
			
			System.out.println("Estoque insuficiente para o produto "+produto);
		} else {
			System.out.println("Produto: "+ produto+"\nValor:"+valor+"\nEstoque:"+estoque);
			
		}

	}

}
