package aula03;

public class Stringmensagem_atv {
	
	public static void main(String[] args) {
		
		double valor = 55.45;
		
		String resultado = String.format("Valor: R$ %.2f%n",valor);
		
		System.out.println(resultado);
	}

}
