package iniciante.level5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2028_SequenciaDeSequencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int caso = 1;
		
		while (teclado.hasNext()) {
			List<Integer> numeros = new ArrayList<>();
			int limite = teclado.nextInt();
			int sequencia = 0;
			int vezes;
			
			do {
				if (sequencia == 0 || sequencia == 1) {
					numeros.add(sequencia);
					sequencia++;
				} else {
					vezes = 1;
					do {
						numeros.add(sequencia);
						vezes ++;
					} while (vezes <= sequencia);
					sequencia ++;
				}
			} while (sequencia <= limite);
			
			if (numeros.size() == 1) {
				System.out.printf("Caso %d: 1 numero\n", caso);
			} else {
				System.out.printf("Caso %d: %d numeros\n", caso, numeros.size());
			}
			
			for (int i = 0; i < numeros.size(); i++) {
				if (i != numeros.size() - 1) {
					System.out.print(numeros.get(i) + " ");
				} else {
					System.out.println(numeros.get(i) + "\n");
				}
			}
		
			caso ++;
		}
		
		teclado.close();
	}

}
