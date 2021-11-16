package iniciante.level1;

import java.util.Scanner;

public class Uri2483 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int vezesA = teclado.nextInt();
		
		String felizNatal = "Feliz nat".concat("a".repeat(vezesA)).concat("l!");
		
		System.out.println(felizNatal);
		
		teclado.close();

	}

}
