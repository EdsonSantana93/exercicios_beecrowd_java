package iniciante.level4;

import java.util.Scanner;

public class Uri1847_BemVindosEBemVindasAoInverno {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer dia1 = teclado.nextInt();
		Integer dia2 = teclado.nextInt();
		Integer dia3 = teclado.nextInt();
		
		if (dia1 > dia2 && dia3 >= dia2) {
			System.out.println(":)");
		} else if (dia1 < dia2 && dia2 >= dia3) {
			System.out.println(":(");
		} else if (dia1 < dia2 && (dia3 - dia2) < (dia2 - dia1)) {
			System.out.println(":(");
		} else if (dia1 < dia2 && dia2 < dia3 && (dia3 - dia2) >= (dia2 - dia1) ) {
			System.out.println(":)");
		} else if (dia1 > dia2 && dia2 > dia3 && (dia2 - dia3) < (dia1 - dia2)) {
			System.out.println(":)");
		} else if (dia1 > dia2 && dia2 > dia3 && (dia2 - dia3) >= (dia1 - dia2)) {
			System.out.println(":(");
		} else if (dia1 == dia2 && dia2 < dia3) {
			System.out.println(":)");
		} else {
			System.out.println(":(");
		}
		
		teclado.close();

	}

}
