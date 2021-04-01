package iniciante.level2;

import java.util.Scanner;

public class Uri1175_TrocaEmVetorI {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer numeros[] = new Integer[20];
		Integer aux;
		
		for (int i = 0; i < numeros.length; i ++) {
			numeros[i] = teclado.nextInt();
		}
		
		for (int i = 0; i < numeros.length/2; i++) {
			aux = numeros[i];
			numeros[i] = numeros[numeros.length - (i + 1)];
			numeros[numeros.length - (i + 1)] = aux;
		}
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.printf("N[%d] = %d\n", i, numeros[i]);
		}
		
		teclado.close();

	}

}
