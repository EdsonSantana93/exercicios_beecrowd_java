package iniciante.level1;

import java.util.Scanner;

public class Uri1004_ProdutoSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n1, n2, PROD;
		n1 = teclado.nextInt();
		n2 = teclado.nextInt();
		PROD = n1*n2;
		
		System.out.println("PROD = " + PROD);
		
		teclado.close();

	}

}
