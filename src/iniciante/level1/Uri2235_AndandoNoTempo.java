package iniciante.level1;

import java.util.Scanner;

public class Uri2235_AndandoNoTempo {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		int c = teclado.nextInt();
		
		
		if ((a - b == 0) || (a-c == 0) || (b-c == 0)) {
			System.out.println('S');
		} else if ((a + b - c == 0) || (b - a + c == 0)) {
			System.out.println('S');			
		} else if ((a - b - c == 0) || (b - a - c == 0) || (c - a - b == 0)) {
			System.out.println('S');						
		} else {
			System.out.println('N');						
		}
		

//		String[] fichas = teclado.nextLine().split(" ");
//		List<Integer> anos = new ArrayList<>();
//
//		for (String ficha : fichas) {
//			anos.add(Integer.parseInt(ficha));
//		}
//
//		char posivelVoltarAnoInicial = 'N';
//
//		if (anos.get(0) == anos.get(1) || anos.get(0) == anos.get(2)) {
//			posivelVoltarAnoInicial = 'S';
//		}
//
//		if (anos.get(1) == anos.get(2)) {
//			posivelVoltarAnoInicial = 'S';
//		}
//
//		if ((anos.get(0) + anos.get(1)) == anos.get(2)) {
//			posivelVoltarAnoInicial = 'S';
//		}
//
//		if ((anos.get(0) + anos.get(2)) == anos.get(1)) {
//			posivelVoltarAnoInicial = 'S';
//		}
//
//		if ((anos.get(1) + anos.get(2)) == anos.get(0)) {
//			posivelVoltarAnoInicial = 'S';
//		}
//
//		System.out.println(posivelVoltarAnoInicial);

		teclado.close();
	}

}
