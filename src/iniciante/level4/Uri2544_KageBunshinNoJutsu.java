package iniciante.level4;

import java.util.Scanner;

public class Uri2544_KageBunshinNoJutsu {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			int quantidadeJutsu = calcularJutsu(teclado.nextInt());
			System.out.println(quantidadeJutsu);
		}
		
		teclado.close();
	}

	private static int calcularJutsu(int quantidadeClone) {
		int quantidadeJutsu = 0;
		
		while (quantidadeClone != 1) {
			quantidadeClone /= 2;
			quantidadeJutsu++;	
		}
		
		return quantidadeJutsu;
	}
}