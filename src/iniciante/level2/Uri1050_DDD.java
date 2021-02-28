package iniciante.level2;

import java.util.Scanner;

public class Uri1050_DDD {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int ddd = teclado.nextInt();
		System.out.println(BuscarDDD(ddd));

		teclado.close();
	}
	
	
	static String BuscarDDD(int ddd) {
		switch (ddd) {
		case 61:
			return "Brasilia";
		case 71:
			return "Salvador";
		case 11:
			return "Sao Paulo";
		case 21:
			return "Rio de Janeiro";
		case 32:
			return "Juiz de Fora";
		case 19:
			return "Campinas";
		case 27:
			return "Vitoria";
		case 31:
			return "Belo Horizonte";
		default:
			return "DDD nao cadastrado";
		}
	}
}
