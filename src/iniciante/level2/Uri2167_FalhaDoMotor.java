package iniciante.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2167_FalhaDoMotor {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosTeste = teclado.nextInt();
		int velocidadeAnterior = 0;
		int pontoReducao = 0;
		List<Integer> velocidades = new ArrayList<>();
		
		for (int caso = 1; caso <= casosTeste; caso++) {
			velocidades.add(teclado.nextInt());
		}
		
		for (int velocidade : velocidades) {
			if (velocidade < velocidadeAnterior) {
				pontoReducao = velocidades.indexOf(velocidade) + 1;
				break;
			}
			velocidadeAnterior = velocidade;
		}
		
		System.out.println(pontoReducao);
		
		teclado.close();

	}

}
