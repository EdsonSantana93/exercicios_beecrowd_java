package iniciante.level1;

import java.util.Scanner;

public class Uri1132_MultiplosDe13 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Integer numero1 = input.nextInt();
		Integer numero2 = input.nextInt();
		Integer soma = 0;
		
		if (numero1 > numero2) {
			Integer aux = numero1;
			numero1 = numero2;
			numero2 = aux;
		}
		
		for (int i = numero1; i <= numero2; i ++) {
			if (i % 13 != 0)
				soma += i;
		}

		System.out.println(soma);
		
		input.close();
	}

}
