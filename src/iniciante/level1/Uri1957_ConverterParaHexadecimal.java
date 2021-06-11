package iniciante.level1;

import java.util.Scanner;

public class Uri1957_ConverterParaHexadecimal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer numero = teclado.nextInt();
		
		String hex = Integer.toHexString(numero);
		
		System.out.println(hex.toUpperCase());
		
		teclado.close();

	}

}
