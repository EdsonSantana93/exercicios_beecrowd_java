package iniciante.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1924_VitoriaEAIndecisao {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<String> opcoesCarreira = new ArrayList<>();
		Integer casosTeste = teclado.nextInt();
		
		for (int i = 1; i <= casosTeste; i ++) {
			opcoesCarreira.add(teclado.nextLine());
		}
		
		System.out.println("Ciencia da Computacao");
		
		
		teclado.close();

	}

}
