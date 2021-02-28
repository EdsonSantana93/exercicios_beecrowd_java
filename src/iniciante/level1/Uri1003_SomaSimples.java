package iniciante.level1;

import java.util.Scanner;

public class Uri1003_SomaSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final Integer A = teclado.nextInt();
		final Integer B = teclado.nextInt();
		
		Integer soma = A + B;
		
		System.out.printf("SOMA = %d", soma);
		teclado.close();
	}

}
