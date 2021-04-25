package iniciante.level2;

import java.util.Scanner;

public class Uri1962_HaMuitoMuitoTempoAtras {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosTeste = teclado.nextInt();
		int ano;
		int tempoAcontecido;
		
		for(int caso = 1; caso <= casosTeste; caso ++) {
			ano = teclado.nextInt();
			tempoAcontecido = ano < 2015 ? 2015 - ano : 2014 - ano;
			tempoAcontecido = ano == 2015 ? -1 : tempoAcontecido;
			
			System.out.println(tempoAcontecido > 0 ? tempoAcontecido + " D.C." : Math.abs(tempoAcontecido) + " A.C." );
		}
		
		
		teclado.close();
	}

}
