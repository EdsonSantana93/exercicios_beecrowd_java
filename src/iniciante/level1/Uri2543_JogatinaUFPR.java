package iniciante.level1;

import java.util.Scanner;

public class Uri2543_JogatinaUFPR {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			int casosTeste = teclado.nextInt();
			int matricula = teclado.nextInt();
			int contCS = 0;
			
			for (int caso = 1; caso <= casosTeste; caso++) {
				int identificacao = teclado.nextInt();
				int jogo = teclado.nextInt();
				
				contCS += (jogo == 0 && matricula == identificacao) ? 1 : 0;
			}
			
			System.out.println(contCS);
		}
		
		teclado.close();

	}

}
