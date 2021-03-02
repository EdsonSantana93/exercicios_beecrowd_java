package iniciante.level2;

import java.util.Scanner;

public class Uri1020_IdadesEmDias {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int dia = teclado.nextInt();
		int anos = dia/365;
		dia = dia % 365;
		int mes = dia / 30;
		dia = dia % 30;
		
		System.out.println(anos + " ano(s)");
		System.out.println(mes + " mes(es)");
		System.out.println(dia + " dia(s)");
		
		teclado.close();

	}

}
