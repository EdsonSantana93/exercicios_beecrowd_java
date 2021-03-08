package iniciante.level2;

import java.util.Scanner;

public class Uri1012_Area {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;

		A = teclado.nextDouble();
		B = teclado.nextDouble();
		C = teclado.nextDouble();

		triangulo = (A * C) / 2;
		circulo = (C * C) * 3.14159;
		trapezio = ((A + B) * C) / 2;
		quadrado = B * B;
		retangulo = A * B;

		System.out.print("TRIANGULO: ");
		System.out.printf("%.3f\n", triangulo);
		System.out.print("CIRCULO: ");
		System.out.printf("%.3f\n", circulo);
		System.out.print("TRAPEZIO: ");
		System.out.printf("%.3f\n", trapezio);
		System.out.print("QUADRADO: ");
		System.out.printf("%.3f\n", quadrado);
		System.out.print("RETANGULO: ");
		System.out.printf("%.3f\n", retangulo);

		teclado.close();
	}

}
