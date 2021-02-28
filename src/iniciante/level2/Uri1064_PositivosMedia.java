package iniciante.level2;

import java.util.Scanner;

public class Uri1064_PositivosMedia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double numero;
		int qntPositivo = 0;
		double soma = 0;
		double mediaPositivo = 0;

		for (int i = 1; i <= 6; i++) {
			numero = teclado.nextDouble();

			if (numero > 0) {
				qntPositivo++;
				soma += numero;
			}
		}

		mediaPositivo = soma / qntPositivo;

		System.out.println(qntPositivo + " valores positivos");
		System.out.printf("%.1f\n", mediaPositivo);
		teclado.close();

	}

}
