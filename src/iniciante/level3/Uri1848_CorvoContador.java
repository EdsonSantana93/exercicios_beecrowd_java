package iniciante.level3;

import java.util.Scanner;

public class Uri1848_CorvoContador {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		Integer numero = 0;
		String acaoCorvo;

		while (teclado.hasNext()) {
			acaoCorvo = teclado.nextLine();
			if (!acaoCorvo.equals("caw caw")) {
				numero += calcularPiscada(acaoCorvo);
			} else {
				System.out.println(numero);
				numero = 0;
			}
		}

		teclado.close();

	}

	private static Integer calcularPiscada(String acaoCorvo) {
		Integer valor = 0;
		if(acaoCorvo.charAt(0) == '*')
			valor += 4;
		if(acaoCorvo.charAt(1) == '*')
			valor += 2;
		if(acaoCorvo.charAt(2) == '*')
			valor ++;
		
		return valor;
	}

}
