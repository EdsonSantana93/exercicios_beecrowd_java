package iniciante.level2;

import java.util.Scanner;

public class Uri1071_SomaImparesConsecutivos1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int X = teclado.nextInt();
		int Y = teclado.nextInt();
		int soma = 0;
		
		if (X > Y) {
			int aux = X;
			X = Y;
			Y = aux;
		}
		
		for (int i = X + 1; i < Y; i++) {
			if (i % 2 != 0) {
				soma += i;
			}
		}
		System.out.println(soma);
		teclado.close();

	}

}
