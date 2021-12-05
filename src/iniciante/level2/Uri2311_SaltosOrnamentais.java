package iniciante.level2;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Uri2311_SaltosOrnamentais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		List<Double> notas = new ArrayList<>();

		int casosTeste = teclado.nextInt();
		teclado.nextLine();

		for (int caso = 1; caso <= casosTeste; caso++) {
			notas.clear();
			String nome = teclado.nextLine();
			double notaDificuldade = teclado.nextDouble();
			for (int nota = 1; nota <= 7; nota++) {
				notas.add(teclado.nextDouble());
			}
			Double notaFinal = calcularNota(notas, notaDificuldade);
			
			System.out.printf("%s %.2f\n", nome, notaFinal);
			teclado.nextLine();
		}

		teclado.close();

	}

	private static Double calcularNota(List<Double> notas, double notaDificuldade) {
		DoubleSummaryStatistics summary = notas.stream().collect(Collectors.summarizingDouble(Double::doubleValue));

		notas.remove(summary.getMax());
		notas.remove(summary.getMin());
		
		return calcularNotaParcial(notas) * notaDificuldade;
	}

	private static Double calcularNotaParcial(List<Double> notas) {
		DoubleSummaryStatistics summary = notas.stream().collect(Collectors.summarizingDouble(Double::doubleValue));
		
		return summary.getSum();
	}

}
