package iniciante.level2;

import java.util.Scanner;

public class Uri1008_Salario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int id, horasTrabalhadas;
		double valorHora, salario;

		id = teclado.nextInt();
		horasTrabalhadas = teclado.nextInt();
		valorHora = teclado.nextDouble();
		salario = valorHora * horasTrabalhadas;

		System.out.println("NUMBER = " + id);
		System.out.printf("SALARY = U$ " + "%.2f\n", salario);

		teclado.close();
	}

}
