package aula03;

import java.text.NumberFormat;
import java.util.Locale;

public class Numberformatatv2 {

	public static void main(String[] args) {

		double valor = 1234.5;

		Locale brasil = Locale.of("pt", "BR");
		NumberFormat moedaBrasil = NumberFormat.getCurrencyInstance(brasil);

		System.out.println(moedaBrasil.format(valor));

	}

}
