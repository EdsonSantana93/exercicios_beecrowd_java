package iniciante.level1;

import java.util.Scanner;

public class Uri1172_SubstituicaoEmVetorI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		Integer numeros[] = new Integer[10];
		
		for (int i = 0; i < numeros.length; i ++) {
			numeros[i] = input.nextInt();
			if (numeros[i] <= 0 || numeros[i] == null) {
				numeros[i] = 1;
			}
		}
		
		
		for (int i = 0; i < numeros.length; i ++) {
			System.out.printf("X[%d] = %d\n", i, numeros[i]);
		}
		
		input.close();

	}

}
