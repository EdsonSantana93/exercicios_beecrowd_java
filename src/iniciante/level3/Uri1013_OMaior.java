package iniciante.level3;

import java.util.Scanner;

public class Uri1013_OMaior {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int a, b, c, maior = 0;
		
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();
		
		if (a > maior) {
			maior = a;
		}
		if (b > maior) {
			maior = b;
		}
		if (c > maior) {
			maior = c;
		}
		
		System.out.println(maior + " eh o maior");
		
		teclado.close();

	}

}
