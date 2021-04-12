package iniciante.level1;

import java.util.Scanner;

public class Uri1865_Mjolnir {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer casoTeste = teclado.nextInt();
		String nome;
		Integer forca;
		
		for (int i = 1; i <= casoTeste; i ++) {
			nome = teclado.next();
			forca = teclado.nextInt();
			System.out.println(nome.equals("Thor") ? "Y" : "N");
		}
		
		teclado.close();

	}

}
