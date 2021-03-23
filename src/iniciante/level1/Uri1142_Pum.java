package iniciante.level1;

import java.util.Scanner;

public class Uri1142_Pum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer linhas = input.nextInt();
		
		for (int i = 1; i <= linhas * 4; i ++) {
			if (i % 4 == 0) {
				System.out.println("PUM");
			} else {
				System.out.print( i + " ");
			}
		}
		
		
		input.close();

	}

}
