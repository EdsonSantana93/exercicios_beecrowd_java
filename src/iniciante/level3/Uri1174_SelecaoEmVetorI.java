package iniciante.level3;

import java.util.Scanner;

public class Uri1174_SelecaoEmVetorI {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double[] numeros = new Double[100];
		
		for (int i = 0; i < 100; i ++) {
			numeros[i] = teclado.nextDouble();
			
			if (numeros[i] <= 10) {
				System.out.printf("A[%d] = %.1f\n", i, numeros[i]);
			} 			
		}
		
		
		teclado.close();

	}

}
