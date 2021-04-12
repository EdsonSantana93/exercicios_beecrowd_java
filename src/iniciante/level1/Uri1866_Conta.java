package iniciante.level1;

import java.util.Scanner;

public class Uri1866_Conta {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer casoTeste = teclado.nextInt();
		Integer termo;
		
		for (int i = 1; i <= casoTeste; i ++) {
			termo = teclado.nextInt();
			System.out.println(termo % 2 == 0 ? 0 : 1);
		}
		
		teclado.close();
	}
}
