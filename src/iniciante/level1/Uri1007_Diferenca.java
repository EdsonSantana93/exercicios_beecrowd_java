package iniciante.level1;

import java.util.Scanner;

public class Uri1007_Diferenca {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final Integer A = teclado.nextInt();
		final Integer B = teclado.nextInt();
		final Integer C = teclado.nextInt();
		final Integer D = teclado.nextInt();
		
		Integer diferenca = A * B - C * D;
		
		System.out.printf("DIFERENCA = %d", diferenca);
		
		teclado.close();
	}

}
