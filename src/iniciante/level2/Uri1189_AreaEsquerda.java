package iniciante.level2;

import java.util.Scanner;

public class Uri1189_AreaEsquerda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Double numeros[][] = new Double[12][12];

		Character operacao = teclado.nextLine().toUpperCase().charAt(0);
		Integer contador = 0;
		Double soma = 0.0;
		
		for (int i = 0; i < 12; i ++) {
			for (int j = 0; j < 12; j ++) {
				numeros[i][j] = teclado.nextDouble();
			}
		}
		
		for (int i = 0; i <= 6; i ++) {
			for (int j = 0; j <= 4; j ++) {
				if(j < i) {
					soma += numeros[i][j];
					contador ++;
				}
			}
		}
		
		int coluna = 3;
		for (int i = 7; i < 12; i ++) {
			for (int j = coluna; j >= 0; j --) {
				if(j < i) {
					soma += numeros[i][j];
					contador ++;
				}
			}
			coluna--;
		}
				
		System.out.printf("%.1f\n", operacao == 'S' ? soma : soma/contador);
		
		teclado.close();
	}

}
