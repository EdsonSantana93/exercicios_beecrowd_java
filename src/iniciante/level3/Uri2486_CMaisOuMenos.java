package iniciante.level3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri2486_CMaisOuMenos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Map<String, Integer> listaVitamina = recuperarTabelaDeVitaminas();
		
 		int quantidadeAlimentos = teclado.nextInt();
		int quantidadeConsumida;
		String alimentoConsumido;
		int totalVitaminaC;
		
		while (quantidadeAlimentos != 0) {
			totalVitaminaC = 0;
			
			for(int ind = 1; ind <= quantidadeAlimentos; ind ++ ) {
				quantidadeConsumida = teclado.nextInt();
				alimentoConsumido = teclado.nextLine().strip();
				
				totalVitaminaC += calcularVitaminaC(quantidadeConsumida, listaVitamina.get(alimentoConsumido));
			}
			
			calcularConsumoVitamina(totalVitaminaC);
			quantidadeAlimentos = teclado.nextInt();
		}
		
		
		teclado.close();

	}
	
	private static void calcularConsumoVitamina(int totalVitaminaC) {
		int minimoDiario = 110;
		int maximoDiario = 130;
		
		if (totalVitaminaC < minimoDiario) {
			int mais = minimoDiario - totalVitaminaC;
			System.out.printf("Mais %d mg\n", mais);
		} else if (totalVitaminaC > maximoDiario) {
			int menos = totalVitaminaC - maximoDiario;
			System.out.printf("Menos %d mg\n", menos);
		} else {
			System.out.printf("%d mg\n", totalVitaminaC);
		}
		
	}

	private static int calcularVitaminaC(int quantidadeConsumida, Integer totalVitamina) {
		return quantidadeConsumida * totalVitamina;
	}

	public static Map<String, Integer> recuperarTabelaDeVitaminas(){
		Map<String, Integer> tabelaVitaminas = new HashMap<>();
		
		tabelaVitaminas.put("suco de laranja", 120);
		tabelaVitaminas.put("morango fresco", 85);
		tabelaVitaminas.put("mamao", 85);
		tabelaVitaminas.put("goiaba vermelha", 70);
		tabelaVitaminas.put("manga", 56);
		tabelaVitaminas.put("laranja", 50);
		tabelaVitaminas.put("brocolis", 34);
		
		return tabelaVitaminas;
	}

}
