package iniciante.level2;

import java.util.Scanner;

public class Uri2059_ImparParOuRoubo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String[] jogadas = teclado.nextLine().split(" ");
		
		String escolhaJogador1 = jogadas[0].equals("1") ? "par" : "impar";
		Integer totalJogo = Integer.parseInt(jogadas[1]) + Integer.parseInt(jogadas[2]);
		String resultadoJogo = totalJogo % 2 == 0 ? "par" : "impar";
		boolean roubou = jogadas[3].equals("1") ? true : false;
		boolean acusou = jogadas[4].equals("1") ? true : false;
		
		if ((roubou && !acusou) || (!roubou && acusou) || (!roubou && !acusou && escolhaJogador1.equals(resultadoJogo))) {
			System.out.println("Jogador 1 ganha!");
		} else {
			System.out.println("Jogador 2 ganha!");
		}
		
		teclado.close();

	}

}
