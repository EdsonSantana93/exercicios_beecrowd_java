package iniciante.level2;

import java.util.Scanner;

public class Uri2310_Voleibol {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int casosTeste = teclado.nextInt();
		String nomeJogador;
		int saquesTentados = 0;
		int bloqueiosTentados = 0;
		int ataqueTentados = 0;
		int saquesCertos = 0;
		int bloqueiosCertos = 0;
		int ataquesCertos = 0;

		for (int caso = 1; caso <= casosTeste; caso++) {
			teclado.nextLine();
			nomeJogador = teclado.nextLine();
			saquesTentados += teclado.nextInt();
			bloqueiosTentados += teclado.nextInt();
			ataqueTentados += teclado.nextInt();
			saquesCertos += teclado.nextInt();
			bloqueiosCertos += teclado.nextInt();
			ataquesCertos += teclado.nextInt();
		}

		double porcentagemSaque = calcularAcerto(saquesTentados, saquesCertos);
		double porcentagemBloqueio = calcularAcerto(bloqueiosTentados, bloqueiosCertos);
		double porcentagemAtaque = calcularAcerto(ataqueTentados, ataquesCertos);

		System.out.printf("Pontos de Saque: %.2f %%.\n", porcentagemSaque);
		System.out.printf("Pontos de Bloqueio: %.2f %%.\n", porcentagemBloqueio);
		System.out.printf("Pontos de Ataque: %.2f %%.\n", porcentagemAtaque);

		teclado.close();

	}

	private static double calcularAcerto(int tentados, int certos) {
		return (double) certos / tentados * 100;
	}

}
