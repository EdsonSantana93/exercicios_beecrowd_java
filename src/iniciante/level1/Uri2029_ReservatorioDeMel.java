package iniciante.level1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri2029_ReservatorioDeMel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		while (teclado.hasNext()) {
			Double volume = teclado.nextDouble();
			Double diametro = teclado.nextDouble();
			final Double PI = 3.14;
			
			Double raio = diametro / 2;
			Double area = PI * Math.pow(raio, 2);
			Double altura = volume / area;
			
			System.out.printf("ALTURA = %.2f\n", altura);
			System.out.printf("AREA = %s\n", df.format(area));
		}
		
		teclado.close();

	}

}
