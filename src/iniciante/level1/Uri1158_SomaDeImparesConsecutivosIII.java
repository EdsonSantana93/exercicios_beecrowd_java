package iniciante.level1;

import java.util.Scanner;

public class Uri1158_SomaDeImparesConsecutivosIII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer casosTeste = input.nextInt();
		
		
		for (int i = 1; i <= casosTeste; i++) {
			Integer numero = input.nextInt();
			Integer quantidadeImpares = input.nextInt();
			Integer totalImpares = 0;
			Integer soma = 0;
			
			while (totalImpares < quantidadeImpares) {
				if (numero % 2 != 0) {
					soma += numero;
					totalImpares ++;
				}
				
				numero ++;
			}
			
			System.out.println(soma);
		}
		
		
		input.close();

	}

}
