package iniciante.level1;

import java.util.Scanner;

public class Uri1113_CrescenteDecrescente {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		while (true) {
			Integer numero1 = teclado.nextInt();
			Integer numero2 = teclado.nextInt();

			if (numero1 > numero2) {
				System.out.println("Decrescente");
			} else if (numero1 < numero2) {
				System.out.println("Crescente");
			} else {
				break;
			}
		}

		teclado.close();
	}

}
