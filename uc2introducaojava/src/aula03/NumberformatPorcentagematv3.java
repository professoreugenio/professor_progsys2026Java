package aula03;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberformatPorcentagematv3 {
	
	public static void main(String[] args) {
		
		double desconto = 0.10;

        Locale brasil = Locale.of("pt", "BR");
        NumberFormat porcentagem = NumberFormat.getPercentInstance(brasil);

        System.out.println("Desconto: " + porcentagem.format(desconto));
	}

}
