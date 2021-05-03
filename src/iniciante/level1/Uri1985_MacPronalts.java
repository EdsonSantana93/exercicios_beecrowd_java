package iniciante.level1;

import java.util.Scanner;

public class Uri1985_MacPronalts {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosTeste = teclado.nextInt();
		int pedido, quantidade;
		double total = 0;
		
		for (int item = 1; item <= casosTeste; item++) {
			pedido = teclado.nextInt();
			quantidade = teclado.nextInt();
			total += calcularPedido(pedido, quantidade); 
		}
		
		System.out.printf("%.2f\n", total);
		teclado.close();

	}

	private static double calcularPedido(int pedido, int quantidade) {
		switch (pedido) {
		case 1001:
			return 1.50 * quantidade;
		case 1002:
			return 2.50 * quantidade;
		case 1003:
			return 3.50 * quantidade;
		case 1004:
			return 4.50 * quantidade;
		case 1005:
			return 5.50 * quantidade;
		default:
			return 0;
		}
	}

}
