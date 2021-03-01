package iniciante.level4;

import java.util.Scanner;

public class Uri1018_Celulas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int saldo = teclado.nextInt();
		int nota = 100;
		System.out.println(saldo);
		do {
			int quant = saldo / nota;
			System.out.printf("%d nota(s) de R$ %d,00\n", quant, nota);
			saldo -= quant * nota;
			quant = 0;
			
			nota = atualizarNota(nota);
//			if (nota == 100) {
//				nota = 50;
//			} else {
//				if (nota == 50) {
//					nota = 20;
//				} else {
//					if (nota == 20) {
//						nota = 10;
//					} else {
//						if (nota == 10) {
//							nota = 5;
//						} else {
//							if (nota == 5) {
//								nota = 2;
//							} else {
//								if (nota == 2) {
//									nota = 1;
//								} else {
//									nota = 0;
//								}
//							}
//						}
//					}
//				}
//			}
		} while (nota != 0);
		teclado.close();

	}

	private static int atualizarNota(int nota) {
		switch (nota) {
		case 100:
			return 50;
		case 50:
			return 20;
		case 20: 
			return 10;
		case 10:
			return 5;
		case 5:
			return 2;
		case 2: 
			return 1;
		default:
			return 0;
		}
	}

}
