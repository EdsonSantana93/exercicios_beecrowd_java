package iniciante.level2;

import java.util.Scanner;

public class Uri1067_NumerosImpares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer maximo = teclado.nextInt();
		
		for (Integer i= 1; i <= maximo; i++)
			if (i % 2 != 0)
				System.out.println(i);
		teclado.close();
	}

}
