package iniciante.level1;

import java.util.Scanner;

public class Uri2152_PepeJaTireiAVela {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int quantidadeLog = teclado.nextInt();
		
		for (int totalLog = 1; totalLog <= quantidadeLog; totalLog ++) {
			int hora = teclado.nextInt();
			int minuto = teclado.nextInt();
			boolean tirouVela = teclado.nextInt() == 1 ? true : false;
			
			formatarlog(hora, minuto, tirouVela);
		}
		
		teclado.close();

	}

	private static void formatarlog(int hora, int minuto, boolean tirouVela) {
		
		if (tirouVela) {
			System.out.printf("%02d:%02d - A porta abriu!\n", hora, minuto);
		} else {
			System.out.printf("%02d:%02d - A porta fechou!\n", hora, minuto);
		}
	}

}
