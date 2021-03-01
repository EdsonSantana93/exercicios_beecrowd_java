package iniciante.level1;

import java.util.Scanner;

public class Uri1006_Media2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A, B, C, MEDIA;

		A = teclado.nextFloat();
		A = (A * 2) / 10;
		B = teclado.nextFloat();
		B = (B * 3) / 10;
		C = teclado.nextFloat();
		C = (C * 5) / 10;
		MEDIA = (A + B + C);

		System.out.printf("MEDIA = " + "%.1f\n", MEDIA);
		teclado.close();

	}

}
