package iniciante.level1;

import java.util.Scanner;

public class Uri2172_Evento {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int aumentoDeXP = 0;
		int xpOriginal = 0;
		
		do {
			aumentoDeXP = teclado.nextInt();
			xpOriginal = teclado.nextInt();
			
			if (aumentoDeXP != 0 && xpOriginal != 0) {
				System.out.println(aumentoDeXP * xpOriginal);				
			}
			
		} while(aumentoDeXP != 0 && xpOriginal != 0);
		
		teclado.close();

	}

}
