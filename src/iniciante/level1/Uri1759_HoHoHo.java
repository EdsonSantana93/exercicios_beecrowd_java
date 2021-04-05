package iniciante.level1;

import java.util.Scanner;

public class Uri1759_HoHoHo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer vezes = teclado.nextInt();
		
		for (int i = 1; i <= vezes; i++) {
			if(i != vezes) {
				System.out.print("Ho ");
			} else {
				System.out.println("Ho!");
			}
		}
		
		teclado.close();
	}

}
