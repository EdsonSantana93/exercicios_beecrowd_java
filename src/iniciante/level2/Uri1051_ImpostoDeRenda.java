package iniciante.level2;

import java.util.Scanner;

public class Uri1051_ImpostoDeRenda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double renda = teclado.nextDouble();

		System.out.println(
				renda <= 2000 ? "Isento" : "R$ " + String.format("%.2f", calcularImposto(renda)).replace(",", "."));

		teclado.close();
	}

	static double calcularImposto(double renda) {

		if (renda > 2000 && renda <= 3000) {
			renda -= 2000;
			return renda * 0.08;
		} else if (renda > 3000 && renda <= 4500) {
			renda -= 3000;
			return 80.00 + (renda * 0.18);
		} else {
			renda -= 4500;
			return (80 + 270) + renda * 0.28;
		}
	}
}
