package iniciante.level2;

import java.util.Arrays;
import java.util.Scanner;

public class Uri1042_ShortSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int[] numeros = new int[3];
		int[] numerosOrdenados = new int[3];
		numeros[0] = teclado.nextInt();
		numerosOrdenados[0] = numeros[0];
		numeros[1] = teclado.nextInt();
		numerosOrdenados[1] = numeros[1];
		numeros[2] = teclado.nextInt();
		numerosOrdenados[2] = numeros[2];
		
		Arrays.sort(numerosOrdenados);
		
		for (int numero : numerosOrdenados) {
			System.out.println(numero);
		}
		
		System.out.println();
		
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		teclado.close();

	}

}
