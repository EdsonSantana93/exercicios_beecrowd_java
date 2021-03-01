package iniciante.level1;

import java.util.Scanner;

public class Uri1016_Distancia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int distancia = teclado.nextInt();

		System.out.printf("%d minutos", (distancia * 2));

		teclado.close();

	}

}
