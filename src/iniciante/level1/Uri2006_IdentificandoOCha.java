package iniciante.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2006_IdentificandoOCha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int cha = teclado.nextInt();
		
		List<Integer> respostaCha = new ArrayList<>();
		
		for (int i = 1; i <= 5; i++) {
			respostaCha.add(teclado.nextInt());
		}
		
		System.out.println(respostaCha.stream().filter(t -> t.intValue() == cha).count());
		teclado.close();

	}

}
