package iniciante.level1;

import java.util.Scanner;

public class Uri1073_QuadradoDePares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int quadrado;
		
		for(int i = 2; i <= N; i += 2) {
			quadrado = (int) Math.pow(i, 2);
			System.out.printf("%d^2 = %d\n", i, quadrado);
		}
		
		teclado.close();

	}

}
