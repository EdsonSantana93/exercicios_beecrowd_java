package iniciante.level1;

import java.util.Scanner;

public class Uri1017_GastoCombustivel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		final Integer horasGastas = teclado.nextInt();
		final Integer velocidadeMedia = teclado.nextInt();
		final Integer distanciaPercorrida = horasGastas * velocidadeMedia;
		final Double combustivelUtilizado = distanciaPercorrida / 12.0;
		
		System.out.printf("%.3f", combustivelUtilizado);
		teclado.close();
	}

}
