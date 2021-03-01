package iniciante.level1;

import java.util.Scanner;

public class Uri1015_DistanciaEntreDoisPontos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x1 = teclado.nextDouble();
		double y1 = teclado.nextDouble();
		double x2 = teclado.nextDouble();
		double y2 = teclado.nextDouble();
		double parcial = Math.pow((x2 - x1), 2) + Math.pow((y2 -y1), 2);		
		double distancia = Math.sqrt(parcial);
		teclado.close();
		System.out.printf("%.4f",distancia);

	}

}
