package contestNatal2021;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ChaA_CategorizandoPresentes {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int qtdePresente = teclado.nextInt();
		int[] qtdePorCategoria = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		Map<Integer, String> categorias = dicionarioCategoria();
		teclado.nextLine();

		for (int p = 1; p <= qtdePresente; p++) {
			String[] entrada = teclado.nextLine().split(" ");
			String descricao = entrada[0];
			int categoria = Integer.parseInt(entrada[1]);
			qtdePorCategoria = contabilizarPresente(qtdePorCategoria, categoria);
		}
		
		for (int index = 0; index < qtdePresente; index ++) {
			System.out.printf("Total de %s: %d\n", categorias.get(index + 1), qtdePorCategoria[index]);
		}

		teclado.close();

	}

	private static Map<Integer, String> dicionarioCategoria() {
		Map<Integer, String> categoria = new HashMap<>();
		categoria.put(1, "Brinquedos");
		categoria.put(2, "Alimentos");
		categoria.put(3, "Roupas");
		categoria.put(4, "Calcados");
		categoria.put(5, "Eletronicos");
		categoria.put(6, "Livros");
		categoria.put(7, "Gadgets");
		categoria.put(8, "Smartphones");
		categoria.put(9, "Jogos");
		categoria.put(10, "Papelaria");
		return categoria;
	}

	private static int[] contabilizarPresente(int[] qtdePorCategoria, int categoria) {
		
		switch (categoria) {
		case 1:
			qtdePorCategoria[0] = qtdePorCategoria[0] + 1;
			return qtdePorCategoria;
		case 2:
			qtdePorCategoria[1] = qtdePorCategoria[1] + 1;
			return qtdePorCategoria;
		case 3:
			qtdePorCategoria[2] = qtdePorCategoria[2] + 1;
			return qtdePorCategoria;	
		case 4:
			qtdePorCategoria[3] = qtdePorCategoria[3] + 1;
			return qtdePorCategoria;
		case 5:
			qtdePorCategoria[4] = qtdePorCategoria[4] + 1;
			return qtdePorCategoria;
		case 6:
			qtdePorCategoria[5] = qtdePorCategoria[5] + 1;
			return qtdePorCategoria;
		case 7:
			qtdePorCategoria[6] = qtdePorCategoria[6] + 1;
			return qtdePorCategoria;
		case 8:
			qtdePorCategoria[7] = qtdePorCategoria[7] + 1;
			return qtdePorCategoria;
		case 9:
			qtdePorCategoria[8] = qtdePorCategoria[8] + 1;
			return qtdePorCategoria;
		case 10:
			qtdePorCategoria[9] = qtdePorCategoria[9] + 1;
			return qtdePorCategoria;
		default:
			return qtdePorCategoria;
		}
	}

}
