package iniciante.level3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1789_ACorridaDeLesmas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		List<Integer> velocidades = new ArrayList<>();
		Integer quantidade;
		Integer maior;

		while (teclado.hasNext()) {
			quantidade = teclado.nextInt();

			for (int i = 0; i < quantidade; i++) {
				velocidades.add(teclado.nextInt());
			}

			maior = velocidades.stream().mapToInt(pessoa -> pessoa.intValue()).max().getAsInt();

			verClasseMaisRapido(maior);
			velocidades.clear();
		}

		teclado.close();

	}

	private static void verClasseMaisRapido(Integer maior) {
		if (maior < 10) {
			System.out.println(1);
		} else if (maior < 20) {
			System.out.println(2);
		} else {
			System.out.println(3);
		}
	}

}
