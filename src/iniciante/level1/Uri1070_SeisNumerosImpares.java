package iniciante.level1;

import java.util.Scanner;

public class Uri1070_SeisNumerosImpares {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
		int quantidadeImpares = 0;
		
		for (int i = numero; quantidadeImpares < 6; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
				quantidadeImpares++;
			}
		}
		
		teclado.close();
	}

}
