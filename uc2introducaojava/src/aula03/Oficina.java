package aula03;

import java.text.DecimalFormat;


public class Oficina {

	public static void main(String[] args) {
		double v1,v2,
		soma, subtracao, multiplicacao, divisao, resto;
		DecimalFormat formatar = new DecimalFormat("R$ #,##0.00");
		
		v1 = 120000; v2 = 20;
		soma = v1 + v2;
		System.out.println("Soma: de " + formatar.format(v1) + " + "+formatar.format(v2)+" = " + formatar.format(soma));
		
		
		subtracao = v1 - v2;
		
	
		multiplicacao = v1 * v2;
		
		
		divisao = v1 / v2;
		
		
		resto = v1 % v2;
		
		System.out.println("Subtração: de " + v1 + " - "+v2+" = " + subtracao);		
		System.out.println("Multiplicação: de " + v1 + " * "+v2+" = " + multiplicacao);
		System.out.println("Divisão: de " + v1 + " / "+v2+" = " + divisao);
		System.out.println("Resto: de " + v1 + " % "+v2+" = " + resto);
		System.out.println("================================");
		System.out.println("MUDANÇA DE SAÍDA DE VALORES");
		System.out.printf("Total Soma: R$ %.2f%n", soma);
		System.out.printf("Total Subtração: R$ %.2f%n", subtracao);
		System.out.printf("Total Multiplicação: R$ %.2f%n", multiplicacao);
		System.out.printf("Total Divisão: R$ %.2f%n", divisao);
		System.out.println("================================");
		System.out.println("MUDANÇA DE SAÍDA DE VALORES");
		System.out.println("Soma R$ " + formatar.format(soma));
		System.out.println("Subtração R$ " + formatar.format(subtracao));
		System.out.println("Multiplicação R$ " + formatar.format(multiplicacao));
		System.out.println("Divisão R$ " + formatar.format(divisao));
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
