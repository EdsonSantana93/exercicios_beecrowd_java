package iniciante.level1;

import java.util.Scanner;

public class Uri1173_PreenchimentoDeVetorI {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer numero = teclado.nextInt();
		
		Integer[] vetorDobro = new Integer[10];
		
		for (int i = 0; i <= 9; i ++) {
			if (i == 0) {
				vetorDobro[i] = numero;
			} else {
				vetorDobro[i] = vetorDobro[i - 1] * 2;
			}
			
			System.out.printf("N[%d] = %d\n", i, vetorDobro[i]);
		}
		
		
		teclado.close();

	}

}
