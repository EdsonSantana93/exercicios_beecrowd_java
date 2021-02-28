package iniciante.level3;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Uri2670_MaquinaCafe {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		Integer primeiroAndar = teclado.nextInt();
		Integer segundoAndar = teclado.nextInt();
		Integer terceiroAndar = teclado.nextInt();

		System.out.println(calcularMenorTempoGasto(primeiroAndar, segundoAndar, terceiroAndar));

		teclado.close();
	}

	private static Integer calcularMenorTempoGasto(Integer primeiroAndar, Integer segundoAndar, Integer terceiroAndar) {
		Integer t1 = segundoAndar * 2 + terceiroAndar * 4;
		Integer t2 = primeiroAndar * 2 + terceiroAndar * 2;
		Integer t3 = primeiroAndar * 4 + segundoAndar * 2;

		Integer menor = verificarMenor(t1, t2, t3);
		return menor;
	}

	private static Integer verificarMenor(Integer t1, Integer t2, Integer t3) {
		List<Integer> planejamento = Arrays.asList(t1, t2, t3);

		return planejamento.stream().min(Integer::compare).get();
	}
}
