package iniciante.level2;

import java.util.Scanner;

public class Uri1914_DeQuemEAVez {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosTeste = teclado.nextInt();
		teclado.nextLine();
		String jogadores[] = new String[4];
		
		for (int i = 1; i <= casosTeste; i ++) {
			for(int j = 0; j <= 3; j ++) {
				jogadores[j] = teclado.next();
			}
			int jogador1 = teclado.nextInt();
			int jogador2 = teclado.nextInt();
			teclado.nextLine();
			
			int soma = jogador1 + jogador2;
			
			String resultado = soma % 2 == 0 ? "PAR" : "IMPAR";
			
			String vencedor = jogadores[1].equals(resultado) ? jogadores[0] : jogadores[2];
			
			System.out.println(vencedor);
			
		}
		
		teclado.close();

	}

}
