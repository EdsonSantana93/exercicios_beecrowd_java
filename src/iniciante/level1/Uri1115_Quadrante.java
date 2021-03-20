package iniciante.level1;

import java.util.Scanner;

public class Uri1115_Quadrante {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			Integer X = teclado.nextInt();
			Integer Y = teclado.nextInt();
			
			if (X == 0 || Y == 0) {
				break;
			}
			
			System.out.println(verificarQuadrante(X, Y));
		}
		
		teclado.close();
	}

	private static String verificarQuadrante(Integer x, Integer y) {
		if (x > 0 && y > 0) {
			return "primeiro";
		} else if (x < 0 && y > 0) {
			return "segundo";
		} else if (x < 0 && y < 0) {
			return "terceiro";
		} else {
			return "quarto";
		}
		
	}

}
