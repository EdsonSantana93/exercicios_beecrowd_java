package iniciante.level2;

import java.util.Scanner;

public class Uri1164_NumeroPerfeito {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N, X, soma = 0;
		
		N = teclado.nextInt();
		
		for (int c = 0; c < N; c++) {
			X = teclado.nextInt();
			for (int div = 1; div < X; div++) {
				if (X % div == 0) {
					soma += div;
				}
			}
			if (soma == X) {
			System.out.println(X + " eh perfeito");
			}else {
				System.out.println(X + " nao eh perfeito");
			}
			soma = 0;
		}
		
		teclado.close();

	}

}
