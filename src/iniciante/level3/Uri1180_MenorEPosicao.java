package iniciante.level3;

import java.util.Scanner;

public class Uri1180_MenorEPosicao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer tamanho = teclado.nextInt();
		Integer numero;
		Integer menor = null;
		Integer posicao = null;
		
		Integer numeros[] = new Integer[tamanho];
		
		for (int i = 0; i < tamanho; i ++) {
			numero = teclado.nextInt();
			numeros[i] = numero;
			if (i == 0) {
				menor = numero;
				posicao = i;
			} else {
				if (menor > numero) {
					menor = numero;
					posicao = i;
				}
			}
		}
		
		System.out.println("Menor valor: " + menor);
		System.out.println("Posicao: " + posicao);
		
		
		teclado.close();

	}

}
