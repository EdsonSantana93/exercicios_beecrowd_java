package iniciante.level2;

import java.util.Scanner;

public class Uri1182_ColunaNaMatriz {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double numeros[][] = new Double[12][12];

		Integer coluna = teclado.nextInt();
		teclado.nextLine();
		Character operacao = teclado.nextLine().toUpperCase().charAt(0);
		Double soma = 0.0;
		
		for (int i = 0; i < 12; i ++) {
			for (int j = 0; j < 12; j ++) {
				numeros[i][j] = teclado.nextDouble();
			}
		}
		
		for (int i = 0; i < 12; i++) {
			soma += numeros[i][coluna];
		}
		
		if (operacao.equals('M')) {
			System.out.printf("%.1f\n", soma / 12);
		} else {
			System.out.printf("%.1f\n", soma);
		}
		
		teclado.close();

	}

}
