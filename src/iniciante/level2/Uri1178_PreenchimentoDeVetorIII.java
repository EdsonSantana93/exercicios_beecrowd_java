package iniciante.level2;

import java.util.Scanner;

public class Uri1178_PreenchimentoDeVetorIII {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Double numeros[] = new Double[100];
		Double inicio = teclado.nextDouble();
		
		numeros[0] = inicio;
		
		for (int i = 1; i < numeros.length; i++) {
			numeros[i] = numeros[i - 1] / 2;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("N[%d] = %.4f\n", i, numeros[i]);
		}
		
		teclado.close();

	}

}
