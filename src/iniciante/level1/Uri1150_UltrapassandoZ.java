package iniciante.level1;

import java.util.Scanner;

public class Uri1150_UltrapassandoZ {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		final Integer X = input.nextInt();
		Integer Y = 0;
		Integer soma = 0;
		Integer vezes = 0;
		
		do {
			Y = input.nextInt();
		} while(Y <= X);
		
		for(int i = X; soma <= Y; i ++) {
			soma += i;
			vezes ++;
		}
		
		System.out.println(vezes);
		input.close();

	}

}
