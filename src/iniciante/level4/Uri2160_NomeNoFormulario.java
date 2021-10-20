package iniciante.level4;

import java.util.Scanner;

public class Uri2160_NomeNoFormulario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String texto = teclado.nextLine();
		
		System.out.println(texto.length() <= 80 ? "YES" : "NO");
		
		teclado.close();

	}

}
