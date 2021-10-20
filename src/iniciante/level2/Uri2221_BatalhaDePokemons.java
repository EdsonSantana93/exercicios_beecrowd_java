package iniciante.level2;

import java.util.Scanner;

public class Uri2221_BatalhaDePokemons {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosDeTeste = teclado.nextInt();
		
		for (int caso = 1; caso <= casosDeTeste; caso++) {
			int bonus = teclado.nextInt();
			teclado.nextLine();
			String[] pokemonDatiel = teclado.nextLine().split(" ");
			String[] pokemonGuarte = teclado.nextLine().split(" ");
			
			int valorGolpeDatiel = calcularValorGolpe(bonus, pokemonDatiel);
			int valorGolpeGuarte = calcularValorGolpe(bonus, pokemonGuarte);
			
			System.out.println(verificarGanhador(valorGolpeDatiel, valorGolpeGuarte));
		}
		
		teclado.close();

	}

	private static String verificarGanhador(int valorGolpeDatiel, int valorGolpeGuarte) {
		if (valorGolpeDatiel > valorGolpeGuarte) 
			return "Datiel";
		if (valorGolpeDatiel < valorGolpeGuarte) 
			return "Guarte";
		return "Empate";
	}

	private static int calcularValorGolpe(int bonus, String[] pokemon) {
		int ataque = Integer.parseInt(pokemon[0]);
		int defesa = Integer.parseInt(pokemon[1]);
		int level = Integer.parseInt(pokemon[2]);
		
		int valorGolpe = (ataque + defesa) / 2;
		
		valorGolpe = level % 2 == 0 ? valorGolpe + bonus : valorGolpe;
		return valorGolpe;
	}

}
