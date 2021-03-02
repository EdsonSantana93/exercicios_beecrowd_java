package iniciante.level1;

import java.util.Scanner;

public class Uri1038_Lanche {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int codigo = teclado.nextInt();
		int quantidade = teclado.nextInt();
		
		double total = calcularValor(codigo, quantidade);

		System.out.printf("Total: R$ %.2f\n", total);

		teclado.close();

	}

	private static double calcularValor(int codigo, int quantidade) {
		switch (codigo) {
		case 1:
			return 4.00 * quantidade;
		case 2:
			return 4.50 * quantidade;
		case 3:
			return 5.00 * quantidade;
		case 4:
			return 2.00 * quantidade;
		case 5:
			return 1.50 * quantidade;
		default:
			return 0.00;
		}
		
	}

}
