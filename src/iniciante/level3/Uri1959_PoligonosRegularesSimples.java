package iniciante.level3;

import java.util.Scanner;

public class Uri1959_PoligonosRegularesSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Long N = teclado.nextLong();
		Long L = teclado.nextLong();
		Long P = Long.valueOf(N * L);
		
		System.out.println(P);
		
		teclado.close();

	}

}
