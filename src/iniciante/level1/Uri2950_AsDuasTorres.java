package iniciante.level1;

import java.util.Scanner;

public class Uri2950_AsDuasTorres {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final Integer distanciaDosPalantins= teclado.nextInt();
		final Integer diametroPalantirSauron = teclado.nextInt();
		final Integer diametroPalantirSaruman = teclado.nextInt();
		final Double totalDiametro = (double) (diametroPalantirSauron + diametroPalantirSaruman);
		
		
		final Double ICM = (double) distanciaDosPalantins / totalDiametro;
		System.out.printf("%.2f\n", ICM);
		
		teclado.close();
	}

}
