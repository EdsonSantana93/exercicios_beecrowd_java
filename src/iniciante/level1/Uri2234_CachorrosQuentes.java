package iniciante.level1;

import java.util.Scanner;

public class Uri2234_CachorrosQuentes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cachorroQuente = teclado.nextInt();
		int participantes = teclado.nextInt();

		double media = (double) cachorroQuente / participantes;

		System.out.printf("%.2f", media);

		teclado.close();
	}

}
