package iniciante.level4;

import java.util.Scanner;

public class Uri2165_Tuitando {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String texto = teclado.nextLine();

		String resposta = texto.length() <= 140 ? "TWEET" : "MUTE";

		System.out.println(resposta);

		teclado.close();

	}

}
