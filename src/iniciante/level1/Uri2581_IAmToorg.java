package iniciante.level1;

import java.util.Scanner;

public class Uri2581_IAmToorg {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casosTeste = teclado.nextInt();
		String pergunta;
		teclado.nextLine();

		for (int caso = 1; caso <= casosTeste; caso++) {
			pergunta = teclado.nextLine();
			System.out.println("I am Toorg!");
		}

		teclado.close();

	}

}
