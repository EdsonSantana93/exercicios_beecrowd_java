package iniciante.level2;

import java.util.Scanner;

public class Uri1185_AcimaDaDiagonalSecundaria {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double numeros[][] = new Double[12][12];

		Character operacao = teclado.nextLine().toUpperCase().charAt(0);
		Integer contador = 0;
		Double soma = 0.0;
		
		for (int i = 0; i < 12; i ++) {
			for (int j = 0; j < 12; j ++) {
				numeros[i][j] = teclado.nextDouble();
				
				if(j < 11 - i) {
					soma += numeros[i][j];
					contador ++;
				}
			}
		}
		
		System.out.printf("%.1f\n", operacao == 'S' ? soma : soma/contador);
		
		teclado.close();

	}

}
