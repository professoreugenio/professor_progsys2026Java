package aula03;
import java.math.BigDecimal;
public class BiddecimalAtv {
	
	public static void main(String[] args) {
		double v1, v2, totald;
		v1 = 0.1;
		v2 = 0.2;
		totald = v1 + v2;
		System.out.println(totald);
		BigDecimal valor1 = new BigDecimal("0.1");
		BigDecimal valor2 = new BigDecimal("0.2");
		BigDecimal total = valor1.add(valor2);
		System.out.printf("%.2f%n",total);

	}

}
