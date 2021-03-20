package iniciante.level1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1079_MediasPonderadas {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casoTeste = teclado.nextInt();
		teclado.nextLine();
		
		for (int caso = 1; caso <= casoTeste; caso++) {
			String[] notas = teclado.nextLine().replace(",", ".").split(" ");
			BigDecimal media = new BigDecimal(0);
			
			for (int i = 0; i < 3; i++) {
				BigDecimal nota = new BigDecimal(notas[i]);
				BigDecimal mediaPonderada = calcularMediaPonderadaNota(nota, i);
				media = media.add(mediaPonderada);
			}
			
			System.out.println(media.setScale(1, RoundingMode.HALF_UP));
			
		}

		teclado.close();
	}
	
	private static BigDecimal calcularMediaPonderadaNota(BigDecimal nota, int ordemNota) {

		switch (ordemNota) {
		case 0:
			return nota.multiply(new BigDecimal(2.0)).divide(new BigDecimal(10.0));
		case 1:
			return nota.multiply(new BigDecimal(3.0)).divide(new BigDecimal(10.0));
		default:
			return nota.multiply(new BigDecimal(5.0)).divide(new BigDecimal(10.0));
		}
	}

}
