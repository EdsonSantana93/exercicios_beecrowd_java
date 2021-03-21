package iniciante.level3;

import java.util.Scanner;

public class Uri1118_VariasNotasComValidacao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double soma = null;
		Double nota;
		Integer resposta = null;

		do {
			soma = 0.0;
			for (int i = 1; i <= 2; i++) {
				do {
					nota = teclado.nextDouble();
					if (nota < 0 || nota > 10) {
						System.out.println("nota invalida");
					}
				} while (nota < 0 || nota > 10);

				soma += nota;
			}

			System.out.printf("media = %.2f\n", soma / 2);

			do {
				System.out.println("novo calculo (1-sim 2-nao)");
				resposta = teclado.nextInt();
			} while (resposta != 1 && resposta != 2);

		} while (resposta != 2);
		teclado.close();
	}

}
