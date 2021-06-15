package iniciante.level1;

import java.util.Scanner;

public class Uri2061_AsAbasDePericles {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Integer abasAbertas = teclado.nextInt();
		Integer acoes = teclado.nextInt();
		
		teclado.nextLine();
		for (int acao = 1; acao <= acoes; acao ++) {
			String acaoTomada = teclado.nextLine();
			if (acaoTomada.equals("fechou")) {
				abasAbertas ++;
			} else {
				abasAbertas --;
			}
		}
		
		System.out.println(abasAbertas);
		
		teclado.close();
	}

}
