package contestNatal2021;

import java.util.Scanner;

public class ChaD_OPesoDoPapaiNoel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double pesoInicial = teclado.nextDouble();
		int qtdeCookies = teclado.nextInt();
		double pesoIdeal = teclado.nextDouble();
		double pesoFinal = pesoInicial;

		for (int cookie = 1; cookie <= qtdeCookies; cookie++) {
			pesoFinal += teclado.nextDouble();
		}

		System.out.printf("%.2f\n", pesoFinal);
		System.out.println(pesoFinal < pesoIdeal ? "ho ho ho" : "papai noel precisa fazer exercicios");

		teclado.close();

	}

}
