package contestNatal2021;

import java.util.Scanner;

public class ChaB_PresenteOuCarvao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int qtdeTraquinagem = teclado.nextInt();

		System.out.println(qtdeTraquinagem <= 25 ? "Recebe Presente, Feliz Natal!" : "Recebe Carvao");

		teclado.close();

	}

}
