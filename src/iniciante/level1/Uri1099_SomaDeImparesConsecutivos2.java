package iniciante.level1;

import java.util.Scanner;

public class Uri1099_SomaDeImparesConsecutivos2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer casoTeste = teclado.nextInt();
		
		for (int i = 1; i <= casoTeste; i++) {
			Integer X = teclado.nextInt();
			Integer Y = teclado.nextInt();
			Integer soma = 0;
			
			if (X > Y) {
				Integer aux = X;
				X = Y;
				Y = aux;
			}
			
			for (int j = X + 1; j < Y; j++) {
				soma += j % 2 != 0 ? j : 0;
			}
			
			System.out.println(soma);
		}
		
		
		teclado.close();

	}

}
