package iniciante.level2;

import java.util.Scanner;

public class Uri2057_FusoHorario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer saida = teclado.nextInt();
		Integer tempoViagem = teclado.nextInt();
		Integer fusoHorario = teclado.nextInt();
		Integer chegada = saida + (tempoViagem + fusoHorario);
		
		if (chegada >= 24) {
			chegada -= 24;
		} else if (saida == 0 && chegada < 0) {
			chegada = 24 + chegada;
		} 
		
		System.out.println(chegada);
		
		teclado.close();

	}

}
