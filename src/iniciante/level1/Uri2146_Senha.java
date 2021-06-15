package iniciante.level1;

import java.util.Scanner;

public class Uri2146_Senha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			int lembrete = teclado.nextInt();
			
			System.out.println(lembrete - 1);
		}
		
		teclado.close();

	}

}
