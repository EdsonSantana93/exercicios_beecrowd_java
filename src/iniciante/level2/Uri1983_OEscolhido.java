package iniciante.level2;

import java.util.Scanner;

public class Uri1983_OEscolhido {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int casosTeste = teclado.nextInt();
		double maiorNota = 0, nota;
		int escolhido = 0, aluno;
		
		for (int i = 1; i <= casosTeste; i ++) {
			aluno = teclado.nextInt();
			nota = teclado.nextDouble();
			if (nota > maiorNota) {
				maiorNota = nota;
				if (maiorNota >= 8)
					escolhido = aluno;
			}
		}
		
		System.out.println(escolhido != 0? escolhido : "Minimum note not reached");
		
		teclado.close();

	}

}
