package iniciante.level1;

import java.util.Scanner;

public class Uri1134_TipoDeCombustivel {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Integer opcao = null;
		Integer alcool = 0;
		Integer gasolina = 0;
		Integer diesel = 0;
		
		do {
			opcao = input.nextInt();
			if (opcao == 1) {
				alcool ++;
			} else if (opcao == 2) {
				gasolina ++;
			} else if (opcao == 3) {
				diesel ++;
			}
		} while (opcao != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		input.close();

	}

}
