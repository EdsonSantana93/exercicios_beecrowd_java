package iniciante.level5;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1040_Media3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String[] notas = teclado.nextLine().replace(",", ".").split(" ");
		BigDecimal media = new BigDecimal(0);

		for (int i = 0; i < 4; i++) {
			BigDecimal nota = new BigDecimal(notas[i]);
			BigDecimal mediaPonderada = calcularMediaPonderadaNota(nota, i);
			media = media.add(mediaPonderada);
		}

		System.out.println("Media: " + media.setScale(1, RoundingMode.FLOOR));

		verificarAprovacao(media);

		if (media.compareTo(new BigDecimal(4.9)) == 1 && media.compareTo(new BigDecimal(7)) == -1) {
			BigDecimal notaExame = teclado.nextBigDecimal();
			System.out.println("Nota do exame: " + notaExame.setScale(1, RoundingMode.FLOOR));
			calcularMediaExame(media, notaExame);
		}
		teclado.close();
	}

	private static void verificarAprovacao(BigDecimal media) {
		if (media.compareTo(new BigDecimal(6.9)) == 1) {
			System.out.println("Aluno aprovado.");
		} else if (media.compareTo(new BigDecimal(5.0)) == -1) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno em exame.");
		}
	}

	private static void calcularMediaExame(BigDecimal media, BigDecimal notaExame) {
		BigDecimal mediaFinal = media.add(notaExame).divide(new BigDecimal(2));

		if (mediaFinal.compareTo(new BigDecimal(5)) == -1) {
			System.out.println("Aluno reprovado.");
		} else {
			System.out.println("Aluno aprovado.");
		}

		System.out.printf("Media final: %.1f\n", mediaFinal);
	}

	private static BigDecimal calcularMediaPonderadaNota(BigDecimal nota, int ordemNota) {

		switch (ordemNota) {
		case 0:
			return nota.multiply(new BigDecimal(2.0)).divide(new BigDecimal(10.0));
		case 1:
			return nota.multiply(new BigDecimal(3.0)).divide(new BigDecimal(10.0));
		case 2:
			return nota.multiply(new BigDecimal(4.0)).divide(new BigDecimal(10.0));
		default:
			return nota.multiply(new BigDecimal(1.0)).divide(new BigDecimal(10.0));
		}
	}

}
