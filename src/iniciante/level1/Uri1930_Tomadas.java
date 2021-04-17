package iniciante.level1;

import java.util.Scanner;

public class Uri1930_Tomadas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer quantTomadas = 0;
		
		for (int i = 1; i <= 4; i ++) {
			quantTomadas += i == 4 ? teclado.nextInt() : teclado.nextInt() - 1;
		}
		
		System.out.println(quantTomadas);
		teclado.close();

	}

}
