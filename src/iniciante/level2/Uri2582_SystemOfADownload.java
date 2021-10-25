package iniciante.level2;

import java.util.Scanner;

public class Uri2582_SystemOfADownload {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casosTeste = teclado.nextInt();
		int botao1;
		int botao2;
		String musica;

		for (int caso = 1; caso <= casosTeste; caso++) {
			botao1 = teclado.nextInt();
			botao2 = teclado.nextInt();
			musica = escolherMusica(botao1 + botao2);
			System.out.println(musica);
		}
		teclado.close();

	}

	private static String escolherMusica(int somaBotao) {
		switch (somaBotao) {
		case 0:
			return "PROXYCITY";
		case 1:
			return "P.Y.N.G.";
		case 2:
			return "DNSUEY!";
		case 3:
			return "SERVERS";
		case 4:
			return "HOST!";
		case 5:
			return "CRIPTONIZE";
		case 6:
			return "OFFLINE DAY";
		case 7:
			return "SALT";
		case 8:
			return "ANSWER!";
		case 9:
			return "RAR?";
		case 10:
			return "WIFI ANTENNAS";
		default:
			return null;
		}
	}
}
