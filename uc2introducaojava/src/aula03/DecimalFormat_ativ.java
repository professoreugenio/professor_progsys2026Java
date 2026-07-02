package aula03;

import java.text.DecimalFormat;

public class DecimalFormat_ativ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double v1, v2, resultado;

		DecimalFormat formatar = new DecimalFormat("R$ #,##0.00");

		v1 = 1000;
		v2 = 50;
		resultado = v1 * v2;

		System.out.println("Resultado: " + formatar.format(resultado));

	}

}
