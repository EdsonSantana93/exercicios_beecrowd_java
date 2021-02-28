package iniciante.level4;

import java.math.BigDecimal;
import java.util.Scanner;

public class Uri1002_AreaCirculo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final BigDecimal PI = new BigDecimal(3.14159);
		BigDecimal raio = teclado.nextBigDecimal();
		
		BigDecimal area = PI.multiply(raio.pow(2));
		
		System.out.printf("A=%.4f", area);
		
		teclado.close();
	}

}
