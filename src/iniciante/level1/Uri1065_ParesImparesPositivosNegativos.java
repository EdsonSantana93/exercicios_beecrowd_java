package iniciante.level1;

import java.util.Scanner;

public class Uri1065_ParesImparesPositivosNegativos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int pares = 0, impares = 0, positivos = 0, negativos = 0;
		
		for(int i = 1; i <= 5; i++) {
			numero = teclado.nextInt();
			pares += numero % 2 == 0 ? 1: 0;
			impares += numero % 2 != 0 ? 1: 0;
			positivos += numero > 0 ? 1: 0;
			negativos += numero < 0 ? 1: 0;
		}
		
		System.out.println(pares + " valor(es) par(es)");
		System.out.println(impares + " valor(es) impar(es)");
		System.out.println(positivos + " valor(es) positivo(s)");
		System.out.println(negativos + " valor(es) negativo(s)");
		
		teclado.close();

	}

}
