package iniciante.level2;

import java.util.Scanner;

public class Bee2510_Batman {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casos = teclado.nextInt();
		teclado.nextLine();
		
		for (int caso = 1; caso <= casos; caso ++) {
			String vilao = teclado.nextLine();
			System.out.println("Y");
		}
		
		teclado.close();

	}

}
