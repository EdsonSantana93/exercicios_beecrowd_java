package iniciante.level1;

import java.util.Scanner;

public class Uri1116_DividindoXPorY {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Integer casoTeste = teclado.nextInt();
		
		for (int i = 1; i <= casoTeste; i++) {
			Integer X = teclado.nextInt();
			Integer Y = teclado.nextInt();
			if (Y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(X.doubleValue() / Y);			
			}
		}
		
		teclado.close();
	}

}
