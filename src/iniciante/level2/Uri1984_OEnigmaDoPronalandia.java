package iniciante.level2;

import java.util.Scanner;

public class Uri1984_OEnigmaDoPronalandia {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String numero = teclado.next();
		
		String novoNumero = ""; 
		
		for (int ind = numero.length() -1; ind >= 0; ind --) {
			novoNumero += String.valueOf(numero.charAt(ind));
		}
		
		System.out.println(novoNumero);
		
		teclado.close();

	}

}
