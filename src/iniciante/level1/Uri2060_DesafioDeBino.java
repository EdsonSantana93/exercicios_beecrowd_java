package iniciante.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2060_DesafioDeBino {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		List<Integer> numeros = new ArrayList<>();
		Integer casoTeste = teclado.nextInt();

		for (int i = 1; i <= casoTeste; i++) {
			numeros.add(teclado.nextInt());
		}

		for (int divisor = 2; divisor <= 5; divisor++) {
			calcularMultiplo(numeros, divisor);
		}

		teclado.close();

	}

	private static void calcularMultiplo(List<Integer> numeros, int divisor) {
		Integer totalMultiplo = 0;
		for (Integer numero : numeros) {
			if (numero % divisor == 0) {
				totalMultiplo ++;
			}
		}
		
		System.out.printf("%d Multiplo(s) de %d\n", totalMultiplo, divisor);
	}

}
