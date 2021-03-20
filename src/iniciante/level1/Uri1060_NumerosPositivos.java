package iniciante.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1060_NumerosPositivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Double> numeros = new ArrayList<>();
		
		do {
			Double numero = teclado.nextDouble();
			if (numero != 0) {
				numeros.add(numero);
			}
		}while(numeros.size() < 6);
		
		Integer positivos = (int) numeros.stream().filter(num -> num > 0).count();
		
		System.out.printf("%d valores positivos\n", positivos);
		teclado.close();
	}

}
