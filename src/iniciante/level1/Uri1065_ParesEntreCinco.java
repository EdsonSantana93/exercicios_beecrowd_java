package iniciante.level1;

import java.util.Scanner;

public class Uri1065_ParesEntreCinco {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		int pares = 0;
		
		for(int i = 1; i <= 5; i++) {
			numero = teclado.nextInt(); 
			pares += (numero % 2 == 0) ? 1 : 0;
		}
		
		System.out.println(pares + " valores pares");	
		teclado.close();
	}

}
