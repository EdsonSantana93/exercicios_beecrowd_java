package iniciante.level1;

import java.util.Scanner;

public class Uri1014_Consumo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int X = teclado.nextInt();
		double Y = teclado.nextDouble();
		double combustivel = X / Y;

		System.out.printf("%.3f km/l\n", combustivel);
		System.out.println("fim");
		teclado.close();

	}

}
