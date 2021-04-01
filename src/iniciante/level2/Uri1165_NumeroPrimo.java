package iniciante.level2;

import java.util.Scanner;

public class Uri1165_NumeroPrimo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int primo = 0;
		int N = teclado.nextInt();
		
		for (int vezes = 0; vezes < N; vezes++) {
			int X = teclado.nextInt();
			
			for (int c = 1; c <= X; c++) {
				if (X % c == 0) {
					primo++;
				}	
			}
			
			if (primo == 2) {
				System.out.println(X + " eh primo");
			}else {
				System.out.println(X + " nao eh primo");
			}
			primo = 0;
		}
		
		teclado.close();

	}

}
