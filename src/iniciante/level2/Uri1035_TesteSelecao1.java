package iniciante.level2;

import java.util.Scanner;

public class Uri1035_TesteSelecao1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int A, B, C, D;

		A = teclado.nextInt();
		B = teclado.nextInt();
		C = teclado.nextInt();
		D = teclado.nextInt();

		if (B > C) {
			if (D > A) {
				if ((C + D) > (A + B)) {
					if (C > 0 && D > 0) {
						if (A % 2 == 0) {
							System.out.println("Valores aceitos");
						} else {
							System.out.println("Valores nao aceitos");
						}
					} else {
						System.out.println("Valores nao aceitos");
					}
				} else {
					System.out.println("Valores nao aceitos");
				}
			} else {
				System.out.println("Valores nao aceitos");
			}
		} else {
			System.out.println("Valores nao aceitos");
		}
		teclado.close();

	}

}
