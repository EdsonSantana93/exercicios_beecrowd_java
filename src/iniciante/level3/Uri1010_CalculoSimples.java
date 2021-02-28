package iniciante.level3;

import java.math.BigDecimal;
import java.util.Scanner;

public class Uri1010_CalculoSimples {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		@SuppressWarnings("unused")
		Integer peca1 = teclado.nextInt();
		Integer quantidadePeca1 = teclado.nextInt();
		BigDecimal valorUnitarioPeca1 = teclado.nextBigDecimal();
		
		@SuppressWarnings("unused")
		Integer peca2 = teclado.nextInt();
		Integer quantidadePeca2 = teclado.nextInt();
		BigDecimal valorUnitarioPeca2 = teclado.nextBigDecimal();
		
		BigDecimal totalPeca1 = calcularTotalPecas(quantidadePeca1, valorUnitarioPeca1);
		BigDecimal totalPeca2 = calcularTotalPecas(quantidadePeca2, valorUnitarioPeca2);
		
		BigDecimal totalCompra = totalPeca1.add(totalPeca2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalCompra);
		
		teclado.close();
	}

	private static BigDecimal calcularTotalPecas(Integer quantidadePeca, BigDecimal valorUnitarioPeca) {
		BigDecimal total = valorUnitarioPeca.multiply(new BigDecimal(quantidadePeca));
		return total;
	}
}
