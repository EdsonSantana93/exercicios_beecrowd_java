package iniciante.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1044_Multiplos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer[] numeros = new Integer[2];
		
		for (int i = 0; i < 2; i++) {
			numeros[i] = teclado.nextInt();
		}
		
		Arrays.sort(numeros);
		
		verificarMultiplos(numeros);
		
		teclado.close();
	}

	private static void verificarMultiplos(Integer[] numeros) {
		
		if (numeros[1] % numeros[0] == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}

}
