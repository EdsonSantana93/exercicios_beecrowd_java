package iniciante.level1;

import java.util.Scanner;

public class Uri1177_PreenchimentoDeVetorII {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer limite = teclado.nextInt() - 1;
		Integer[] numeros = new Integer[1000];
		Integer valor = 0;
		
		for (int i = 0; i < 1000; i ++) {
			numeros[i] = valor;
			if (valor != limite) {
				valor ++;
			} else {
				valor = 0;
			}
			System.out.printf("N[%d] = %d\n", i, numeros[i]);
		}
		
		
		
		teclado.close();

	}

}
