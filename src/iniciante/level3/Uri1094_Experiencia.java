package iniciante.level3;

import java.util.Scanner;

public class Uri1094_Experiencia {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer coelho = 0;
		Integer rato = 0;
		Integer sapo = 0;
		Integer cobaia = 0;
		Integer teste = teclado.nextInt();
		teclado.nextLine();
		
		for (int i = 1; i <= teste; i++) {
			String[] tipoCobaia = teclado.nextLine().split(" ");
			
			Integer quantidade = Integer.valueOf(tipoCobaia[0]); 
			
			if (tipoCobaia[1].toUpperCase().equals("C")) {
				coelho += quantidade;
			} else if (tipoCobaia[1].toUpperCase().equals("S")) {
				sapo += quantidade;
			} else {
				rato += quantidade;
			}
			
			cobaia += quantidade;
		}
		
		System.out.printf("Total: %d cobaias\n", cobaia);
		System.out.printf("Total de coelhos: %d\n", coelho);
		System.out.printf("Total de ratos: %d\n", rato);
		System.out.printf("Total de sapos: %d\n", sapo);
		
		System.out.printf("Percentual de coelhos: %.2f %s", calcularPorcentagem(cobaia, coelho), "%\n");
		System.out.printf("Percentual de ratos: %.2f %s", calcularPorcentagem(cobaia, rato), "%\n");
		System.out.printf("Percentual de sapos: %.2f %s", calcularPorcentagem(cobaia, sapo), "%\n");
		
		
		teclado.close();
	}

	private static Double calcularPorcentagem(Integer cobaia, Integer coelho) {		
		return (coelho * 100.0) / cobaia;
	}

}
