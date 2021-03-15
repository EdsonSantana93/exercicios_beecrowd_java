package iniciante.level3;

import java.util.Scanner;

public class Uri1036_FormulaDeBaskara {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		final Double A = teclado.nextDouble();
		final Double B = teclado.nextDouble();
		final Double C = teclado.nextDouble();
		final Double DELTA = calcularDelta(A, B, C);

		final Double X1 = calcularX(A, B, DELTA, "+");
		final Double X2 = calcularX(A, B, DELTA, "-");

		if (X1.isNaN() || X1.isInfinite() || X2.isNaN() || X2.isInfinite()) {
			System.out.println("Impossivel calcular");
		} else {
			System.out.printf("R1 = %.5f\n", X1);
			System.out.printf("R2 = %.5f\n", X2);
		}

		teclado.close();
	}

	private static Double calcularX(Double a, Double b, Double DELTA, String operacao) {
		Double raiz = Math.sqrt(DELTA);
		Double expoente;
		Double resultado;
		b = b > 0 ? b * (-1) : b;

		if (operacao.equals("+")) {

			expoente = raiz.isNaN() || raiz.isInfinite() ? Double.NaN : b + raiz;

		} else {
			expoente = raiz.isNaN() || raiz.isInfinite() ? Double.NaN : b - raiz;

		}

		resultado = expoente / (2 * a);
		return resultado;
	}

	private static Double calcularDelta(Double a, Double b, Double c) {
		Double resultado = Math.pow(b, 2) - (4 * a * c);
		return resultado;
	}

}
