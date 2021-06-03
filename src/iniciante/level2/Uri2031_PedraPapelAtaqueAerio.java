package iniciante.level2;

import java.util.Scanner;

public class Uri2031_PedraPapelAtaqueAerio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer casoTeste = teclado.nextInt();
		String jogador1;
		String jogador2;
		
		teclado.nextLine();
		
		for (int caso = 1; caso <= casoTeste; caso ++) {
			jogador1 = teclado.nextLine();
			jogador2 = teclado.nextLine();
			verificarGanhador(jogador1, jogador2);
		}

		teclado.close();
	}

	private static void verificarGanhador(String jogador1, String jogador2) {
		String ganhador;
		
		if (jogador1.toLowerCase().equals("ataque") && (jogador2.toLowerCase().equals("pedra") || jogador2.toLowerCase().equals("papel"))) {
			ganhador = "Jogador 1 venceu";
		} else if(jogador1.toLowerCase().equals("pedra") && jogador2.toLowerCase().equals("papel")){
			ganhador = "Jogador 1 venceu";
		} else if(jogador1.toLowerCase().equals("papel") && jogador2.toLowerCase().equals("papel")) {
			ganhador = "Ambos venceram";
		} else if (jogador1.toLowerCase().equals("pedra") && jogador2.toLowerCase().equals("pedra")) {
			ganhador = "Sem ganhador";
		} else if (jogador1.toLowerCase().equals("ataque") && jogador2.toLowerCase().equals("ataque")) {
			ganhador = "Aniquilacao mutua";
		} else {
			ganhador = "Jogador 2 venceu";
		}
		
		System.out.println(ganhador);
		
	}

}
