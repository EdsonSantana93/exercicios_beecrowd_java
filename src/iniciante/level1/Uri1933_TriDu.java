package iniciante.level1;

import java.util.Scanner;

public class Uri1933_TriDu {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer dupla1 = teclado.nextInt();
		Integer dupla2 = teclado.nextInt();
		
		System.out.println(dupla1 > dupla2 ? dupla1 : dupla2);
		
		teclado.close();
	}
}
