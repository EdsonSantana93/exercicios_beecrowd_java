package iniciante.level2;

import java.util.Scanner;

public class Uri1159_SomaDeParesConsecutivos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer numero = input.nextInt();
		
		while (numero != 0) {
			Integer totalPar = 0;
			Integer soma = 0;
			while (totalPar < 5) {
				if (numero %  2 == 0) {
					soma += numero;
					totalPar ++;
				}
				numero ++;
			}
			System.out.println(soma);
			numero = input.nextInt();
		}
		
		input.close();

	}

}
