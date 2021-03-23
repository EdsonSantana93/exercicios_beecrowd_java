package iniciante.level2;

import java.util.Scanner;

public class Uri1151_FibonacciFacil {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer totalSerie = input.nextInt();
		
		Integer anterior = 0;
		Integer atual = null;
		
		System.out.print(0);
		
		for (int i = 2; i <= totalSerie; i ++) {
			if (i == 2) {
				atual = anterior + 1;
			} else {
				Integer aux = atual;
				atual += anterior;
				anterior = aux;
			}
			
			System.out.print(" " + atual);
		}
		System.out.println();
		input.close();

	}

}
