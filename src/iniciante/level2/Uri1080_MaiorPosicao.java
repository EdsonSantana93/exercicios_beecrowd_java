package iniciante.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri1080_MaiorPosicao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Integer> numeros = new ArrayList<>();

		for (int i = 1; i <= 100; i++) {
			numeros.add(teclado.nextInt());
		}
		
		Integer maior = Collections.max(numeros);
		
		System.out.println(maior);
		System.out.println(numeros.indexOf(maior) + 1);
		
		teclado.close();
	}

}
