package iniciante.level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee2542_IuDiOh {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNext()) {
			int atributosCarta = teclado.nextInt();
			int qtdeCartasMarcos = teclado.nextInt();
			int qtdeCartasLeo = teclado.nextInt();
			int escolhidaMarcos;
			int escolhidaLeo;
			int atributoSorteado;
			int valorCartaMarcos;
			int valorCartaLeo;

			List<List<Integer>> baralhoMarcos = new ArrayList<>();
			List<List<Integer>> baralhoLeo = new ArrayList<>();

			for (int c = 1; c <= qtdeCartasMarcos; c++) {
				List<Integer> carta = new ArrayList<>();
				for (int atrib = 1; atrib <= atributosCarta; atrib++) {
					carta.add(teclado.nextInt());
				}
				baralhoMarcos.add(carta);
			}

			for (int c = 1; c <= qtdeCartasLeo; c++) {
				List<Integer> carta = new ArrayList<>();
				for (int atrib = 1; atrib <= atributosCarta; atrib++) {
					carta.add(teclado.nextInt());
				}
				baralhoLeo.add(carta);
			}

			escolhidaMarcos = teclado.nextInt();
			escolhidaLeo = teclado.nextInt();
			atributoSorteado = teclado.nextInt();

			valorCartaMarcos = baralhoMarcos.get(escolhidaMarcos - 1).get(atributoSorteado - 1);
			valorCartaLeo = baralhoLeo.get(escolhidaLeo - 1).get(atributoSorteado - 1);

			if (valorCartaMarcos == valorCartaLeo) {
				System.out.println("Empate");
			} else {
				System.out.println(valorCartaMarcos > valorCartaLeo ? "Marcos" : "Leonardo");
			}
		}

		teclado.close();

	}

}
