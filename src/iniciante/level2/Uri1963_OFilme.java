package iniciante.level2;

import java.util.Scanner;

public class Uri1963_OFilme {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double precoAntigo = teclado.nextDouble();
		double novoPreco = teclado.nextDouble();
		double aumento = calcularAumento(precoAntigo, novoPreco);

		System.out.printf("%.2f%%\n", aumento);
		teclado.close();

	}

	private static double calcularAumento(double precoAntigo, double novoPreco) {
		return (novoPreco * 100 / precoAntigo) - 100;
	}

}
