package iniciante.level2;

import java.util.Scanner;

public class Uri1046_TempoJogo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int inicio = teclado.nextInt();
		int fim = teclado.nextInt();
		int tempo;
		
		if (inicio == fim) {
			tempo = 24;
		} else if (inicio < fim) {
			tempo = fim - inicio;
		} else { 
			tempo = (24 - inicio) + fim;
		}
		
		System.out.printf("O JOGO DUROU %d HORA(S)", tempo);
		
		teclado.close();

	}

}
