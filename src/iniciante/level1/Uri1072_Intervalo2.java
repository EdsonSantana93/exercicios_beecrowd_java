package iniciante.level1;

import java.util.Scanner;

public class Uri1072_Intervalo2 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int valor;
		int in = 0;
		int out = 0; 
		for(int i = 1; i <= N; i++) {
			valor = teclado.nextInt();
			in += valor >= 10 && valor <= 20? 1: 0;
			out += !(valor >= 10 && valor <= 20) ? 1 : 0;
		}
		
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
		
		teclado.close();

	}

}
