package iniciante.level2;

import java.util.Scanner;

public class Uri1043_Triangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double A = teclado.nextDouble();
		double B = teclado.nextDouble();
		double C = teclado.nextDouble();
		
		if ((A + B) > C && (B + C) > A && (C + A) > B) {
			double perimetro = A + B + C;
			System.out.println("Perimetro = " + perimetro);
		} else {
			double area = ((A + B) / 2) * C;
			System.out.println("Area = " + area);
		}
		
		teclado.close();

	}

}
