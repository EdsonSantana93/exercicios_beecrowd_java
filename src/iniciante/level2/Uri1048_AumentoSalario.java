package iniciante.level2;

import java.util.Scanner;

public class Uri1048_AumentoSalario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double salario = teclado.nextDouble();
		int percentual = 0;
		double aumento;
		double novoSalario;
		
		if (salario >= 0 && salario <= 400) {
			percentual = 15;
		} else if (salario >= 400.01 && salario <= 800.00){
			percentual = 12;
		} else if (salario >= 800.01 && salario <= 1200.00) {
			percentual = 10;
		} else if (salario >= 1200.01 && salario <= 2000.00) {
			percentual = 7;
		} else if (salario > 2000.00) {
			percentual = 4;
		}
		
		aumento = salario * percentual / 100;
		novoSalario = salario + aumento;
		
		System.out.printf("Novo salario: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", aumento);
		System.out.printf("Em percentual: %d %%\n", percentual);
		teclado.close();

	}

}
