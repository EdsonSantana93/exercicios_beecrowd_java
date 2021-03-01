package iniciante.level2;

import java.util.Scanner;

public class Uri1011_Esfera {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		final double PI = 3.14159;
		double volume, R;

		R = teclado.nextDouble();

		volume = (4.0 / 3) * PI * (R * R * R);

		System.out.printf("VOLUME = %.3f\n", volume);
		teclado.close();

	}

}
