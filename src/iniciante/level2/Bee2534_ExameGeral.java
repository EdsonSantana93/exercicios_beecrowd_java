package iniciante.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Bee2534_ExameGeral {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			List<Integer> notas = new ArrayList<>();
			List<Integer> notasPesquisadas = new ArrayList<>();

			int habitantes = teclado.nextInt();
			int consultas = teclado.nextInt();
			int posicao;

			for (int n = 1; n <= habitantes; n++) {
				notas.add(teclado.nextInt());
			}

			Collections.sort(notas);
			Collections.reverse(notas);
			
			for (int c = 1; c <= consultas; c++) {
				posicao = teclado.nextInt();
				notasPesquisadas.add(notas.get(posicao - 1));
			}


			for (int nota : notasPesquisadas) {
				System.out.println(nota);
			}
		}
		

		teclado.close();

	}

}
