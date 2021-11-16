package iniciante.level1;

import java.util.Scanner;

public class Uri2344_NotasDaProva {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int nota = teclado.nextInt();

		System.out.println(calcularNota(nota));
		teclado.close();
	}

	private static String calcularNota(int nota) {
		if (nota < 1)
			return "E";
		else if (nota < 36)
			return "D";
		else if (nota < 61)
			return "C";
		else if (nota < 86)
			return "B";
		return "A";
	}

}
