package iniciante.level3;

import java.util.Scanner;

public class Uri1176_FibonacciEmVetor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Long fibonacci[] = new Long[61];
		Integer casoTeste = teclado.nextInt();
		Integer posicao;
		
		fibonacci[0] = 0L;
		fibonacci[1] = 1L;
		
		for (int i = 2; i <= 60; i ++) {
			fibonacci[i] = fibonacci[i - 2] + fibonacci[i - 1];
		}
		
		for (int i = 1; i <= casoTeste; i++) {
			posicao = teclado.nextInt();
			System.out.printf("Fib(%d) = %d\n", posicao, fibonacci[posicao]);
		}
		
		teclado.close();

	}

}
