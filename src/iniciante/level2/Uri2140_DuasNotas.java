package iniciante.level2;

import java.util.Scanner;

public class Uri2140_DuasNotas {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		while (true){
			String situacao = "impossible";
			
			double valorCompra = teclado.nextDouble();
			double valorPago = teclado.nextDouble();
			double valorTroco = valorPago - valorCompra;
			
			if (valorCompra == 0 && valorPago == 0) {
				break;
			}
			
			if (valorTroco >= 4) {
				situacao = calcularQuantidadeNotas(valorTroco) == 2 ? "possible" : situacao;
			}
			
			System.out.println(situacao);			
		}
		
		teclado.close();

	}

	private static double calcularQuantidadeNotas(double valorTroco) {
		int nota = 0;
		while (valorTroco > 0) {
			if (valorTroco >= 100) {
				valorTroco -= 100;
				nota++;
			} else if (valorTroco >= 50){
				valorTroco -= 50;
				nota++;
			} else if (valorTroco >= 20) {
				valorTroco -= 20;
				nota++;
			} else if (valorTroco >= 10) {
				valorTroco -= 10;
				nota++;
			} else if (valorTroco >= 5) {
				valorTroco -= 5;
				nota++;
			} else if (valorTroco >= 2) {
				valorTroco -= 2;
				nota++;
			} else {
				continue; 
			}
		}
		return nota;
	}

}
