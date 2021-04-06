package iniciante.level4;

import java.util.Scanner;

public class Uri1828_Bazinga {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		Integer jogada = teclado.nextInt();
		String sheldon; 
		String raj; 
		for (int i = 1; i <= jogada; i++) {
			sheldon = teclado.next();
			raj = teclado.next();
			
			System.out.printf("Caso #%d: %s\n", i, resultado(sheldon, raj));
		}
		
		teclado.close();

	}

	private static String resultado(String sheldon, String raj) {
		if (sheldon.equalsIgnoreCase(raj)) {
			return "De novo!";
		} else if (sheldon.equals("tesoura") && (raj.equals("papel") || raj.equals("lagarto"))) {
			return "Bazinga!";
		} else if (sheldon.equals("papel") && (raj.equals("pedra") || raj.equals("Spock"))) {
			return "Bazinga!";
		} else if (sheldon.equals("pedra") && (raj.equals("lagarto") || raj.equals("tesoura"))) {
			return "Bazinga!";
		} else if (sheldon.equals("lagarto") && (raj.equals("Spock") || raj.equals("papel"))) {
			return "Bazinga!";
		} else if (sheldon.equals("Spock") && (raj.equals("tesoura") || raj.equals("pedra"))) {
			return "Bazinga!";
		}
		return "Raj trapaceou!";
	}

}
