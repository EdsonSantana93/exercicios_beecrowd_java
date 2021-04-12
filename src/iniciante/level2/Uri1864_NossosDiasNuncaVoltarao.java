package iniciante.level2;

import java.util.Scanner;

public class Uri1864_NossosDiasNuncaVoltarao {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		String frasePrincipal = "LIFE IS NOT A PROBLEM TO BE SOLVED";
		Integer quantidadeLetras = teclado.nextInt();
		
		String citacao = frasePrincipal.substring(0, quantidadeLetras);
		
		System.out.println(citacao);
		
		teclado.close();

	}

}
