package iniciante.level5;

import java.util.Scanner;

public class Uri1160_CrescimentoPopulacional {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer casosTeste = teclado.nextInt();

		for (int i = 1; i <= casosTeste; i++) {
		Integer populacaoA = teclado.nextInt();
		Integer populacaoB = teclado.nextInt();
		
		Double aumentoA = teclado.nextDouble();
		Double aumentoB = teclado.nextDouble();
		
		Integer anos = 0;
		
			while (populacaoA <= populacaoB) {
				populacaoA += (int) (populacaoA * (aumentoA / 100));
				populacaoB += (int) (populacaoB * (aumentoB / 100));
				anos ++;
				if (anos > 101) {
					break;
				}
			}
			
			System.out.println(anos > 100 ? "Mais de 1 seculo." : anos + " anos.");
		}
		
		teclado.close();

	}

}
