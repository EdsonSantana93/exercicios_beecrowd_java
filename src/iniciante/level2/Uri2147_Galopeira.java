package iniciante.level2;

import java.util.Scanner;

public class Uri2147_Galopeira {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosTeste = teclado.nextInt();
		teclado.nextLine();
		
		for (int caso = 1; caso <= casosTeste; caso ++) {
			String digitado = teclado.nextLine();
			double tempo = digitado.length() * 0.01;
			
			System.out.printf("%.2f\n", tempo);
		}
		
		
		teclado.close();

	}

}
