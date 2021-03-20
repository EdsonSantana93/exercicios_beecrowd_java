package iniciante.level3;

import java.util.Scanner;

public class Uri1133_RestoDaDivisao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	
		Integer numero1 = teclado.nextInt();
		Integer numero2 = teclado.nextInt();
		
		if(numero1 > numero2) {
			int aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		
		for (int i = numero1 + 1; i < numero2; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
		
		teclado.close();
	}

}
