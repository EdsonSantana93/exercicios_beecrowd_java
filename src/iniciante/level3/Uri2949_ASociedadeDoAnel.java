package iniciante.level3;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * 
 * @author Edson Santana
 * @version 0.1
 *
 *	O código Abaixo é a solução realizada no primeiro momento do exercício,
 * 	o código passa em todos os casos de teste do Uri,
 *  portanto quando submetido não é aceito.
 *  Desta forma foi criado o códico comentado que passa na submissão.
 */
public class Uri2949_ASociedadeDoAnel {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Map<String, String> alistados = new HashMap<>();
		
		Integer pessoasAlistadas = teclado.nextInt();
		
		for (int i = 1; i <= pessoasAlistadas; i++) {
			alistados.put(teclado.next(), teclado.next());
		}
		
		System.out.printf("%d Hobbit(s)\n", calcularEspecie(alistados.values(), "X"));
		System.out.printf("%d Humano(s)\n", calcularEspecie(alistados.values(), "H"));
		System.out.printf("%d Elfo(s)\n", calcularEspecie(alistados.values(), "E"));
		System.out.printf("%d Anao(s)\n", calcularEspecie(alistados.values(), "A"));
		System.out.printf("%d Mago(s)\n", calcularEspecie(alistados.values(), "M"));
		teclado.close();
	}

	private static Integer calcularEspecie(Collection<String> alistados, String especie) {
		return (int) alistados.stream()
				.filter(alistado -> alistado.equals(especie.toUpperCase())).count();
	}
	
//	Scanner teclado = new Scanner(System.in);
//
//	Integer pessoasAlistadas = teclado.nextInt();
//	Integer hobbit = 0;
//	Integer humano = 0;
//	Integer elfo = 0;
//	Integer anao = 0;
//	Integer mago = 0;
//	
//	teclado.nextLine();
//	for (int i = 1; i <= pessoasAlistadas; i++) {
//		String[] alistado = teclado.nextLine().split(" ");
//		String tipo = alistado[1];
//		if (tipo.equals("X"))
//			hobbit++;
//		else if (tipo.equals("H"))
//			humano++;
//		else if (tipo.equals("E"))
//			elfo++;
//		else if(tipo.equals("A"))
//			anao++;
//		else
//			mago++;
//	}
//
//	System.out.printf("%d Hobbit(s)\n", hobbit);
//	System.out.printf("%d Humano(s)\n", humano);
//	System.out.printf("%d Elfo(s)\n", elfo);
//	System.out.printf("%d Anao(s)\n", anao);
//	System.out.printf("%d Mago(s)\n", mago);
//	teclado.close();
//}

}
