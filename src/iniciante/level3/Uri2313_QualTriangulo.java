package iniciante.level3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri2313_QualTriangulo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int lado1 = teclado.nextInt();
		int lado2 = teclado.nextInt();
		int lado3 = teclado.nextInt();

		validarTriangulo(lado1, lado2, lado3);

		teclado.close();

	}

	private static void validarTriangulo(int lado1, int lado2, int lado3) {
		if ((lado1 + lado2) > lado3 && (lado1 + lado3) > lado2) {
			System.out.println("Valido-" + tipoTriangulo(lado1, lado2, lado3));
			System.out.println("Retangulo: " + ehRetangulo(lado1, lado2, lado3));
		} else {
			System.out.println("Invalido");
		}

	}

	private static String ehRetangulo(int lado1, int lado2, int lado3) {
		List<Integer> lados = Arrays.asList(lado1, lado2, lado3);
		
		Collections.sort(lados, Collections.reverseOrder());
		
		long cateto = (long) Math.pow(lados.get(0), 2);
		long hipotenusaA =  (long) Math.pow(lados.get(1), 2);
		long hipotenusaB = (long) Math.pow(lados.get(2), 2);
		
		if (cateto == (hipotenusaA + hipotenusaB))
			return "S" ;
		return "N";
	}

	private static String tipoTriangulo(int lado1, int lado2, int lado3) {
		if (lado1 == lado2 && lado2 == lado3) {
			return "Equilatero";
		} else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			return "Isoceles";
		}
		return "Escaleno";
	}

}
