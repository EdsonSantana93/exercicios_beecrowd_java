package iniciante.level2;

import java.util.Scanner;

public class Uri1145_SequenciaLogica2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer quantidadeLinha = input.nextInt();
		Integer total = input.nextInt();
		
		for (int i = 1; i <= total; i ++) {
			if (i % quantidadeLinha == 0) {
				System.out.println(i);
			} else {
				System.out.print(i + " ");
			}
		}
		
		input.close();

	}

}
