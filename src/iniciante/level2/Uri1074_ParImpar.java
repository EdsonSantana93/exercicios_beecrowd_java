package iniciante.level2;

import java.util.Scanner;

public class Uri1074_ParImpar {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int N = teclado.nextInt();
		int[] valores = new int[N];

		for (int i = 0; i < N; i++) {
			valores[i] = teclado.nextInt();
		}

		for (int numero : valores) {
			System.out.println(classificarNumero(numero));
		}

		teclado.close();

	}

	static String classificarNumero(int numero) {
		String mensagem = "";

		if (numero == 0)
			mensagem += "NULL";
		else if (numero % 2 == 0)
			mensagem += "EVEN ";
		else
			mensagem += "ODD ";

		if (numero > 0)
			mensagem += "POSITIVE";
		else if (numero < 0)
			mensagem += "NEGATIVE";
		return mensagem;

	}

}
