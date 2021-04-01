package iniciante.level1;

import java.util.Scanner;

public class Uri1149_SomandoInteirosConsecutivos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer inicio = teclado.nextInt();
		Integer vezesSomado = 0;
		Integer soma = 0;
		
		while (vezesSomado <= 0) {
			vezesSomado = teclado.nextInt();
		}
		
		for (int i = 0; i < vezesSomado; i ++) {
			soma += inicio + i;
		}
		
		System.out.println(soma);
		teclado.close();

	}

}
