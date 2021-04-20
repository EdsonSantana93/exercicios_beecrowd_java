package iniciante.level2;

import java.util.Scanner;

public class Uri1961_PulaSapo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer pulo = teclado.nextInt();
		Integer quantCanos = teclado.nextInt();
		Integer alturaCanoAtual = 0;
		Integer alturaCanoAnterior = 0;
		
		for (int cano = 1; cano <= quantCanos; cano ++) {
			alturaCanoAnterior = alturaCanoAtual;
			alturaCanoAtual = teclado.nextInt();
			
			if (Math.abs(alturaCanoAnterior - alturaCanoAtual) > pulo && cano != 1) {
				System.out.println("GAME OVER");
				break;
			}
			if (cano == quantCanos) {
				System.out.println("YOU WIN");
			}
		}
		
		
		teclado.close();

	}

}
