package iniciante.level1;

import java.util.Scanner;

public class Uri1589_BobConduite {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer casoTeste = teclado.nextInt();
		Integer raio1;
		Integer raio2;
		
		for (int i = 1; i <= casoTeste; i++) {
			raio1 = teclado.nextInt();
			raio2 = teclado.nextInt();
			
			System.out.println(raio1 + raio2);
		}
		
		teclado.close();

	}

}
