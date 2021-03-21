package iniciante.level1;

import java.util.Scanner;

public class Uri1117_ValidacaoDeNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Double soma = 0.0;
		Double nota;
		
		for (int i = 1; i <= 2; i++) {
			do {
				nota = teclado.nextDouble();
				if (nota < 0 || nota > 10) {
					System.out.println("nota invalida");
				}
			} while (nota < 0 || nota > 10);
			
			soma += nota;
		}
		
		System.out.printf("media = %.2f\n", soma / 2);
		teclado.close();
	}

}
