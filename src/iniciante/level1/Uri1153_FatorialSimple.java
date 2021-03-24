package iniciante.level1;

import java.util.Scanner;

public class Uri1153_FatorialSimple {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Integer numero = input.nextInt();
		Integer total = numero;
		
		for (int i = 1; i < numero; i ++) {
			total *= numero - i;
		}
		
		System.out.println(total);
		
		input.close();
	}

}
