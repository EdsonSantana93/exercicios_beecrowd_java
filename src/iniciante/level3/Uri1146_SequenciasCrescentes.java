package iniciante.level3;

import java.util.Scanner;

public class Uri1146_SequenciasCrescentes {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Integer numero = input.nextInt();

		while (numero != 0) {
			String sequencia = "";
			for (int i = 1; i <= numero; i ++) {
				
				sequencia += i != numero ? i + " " : i;
			}
			
			System.out.println(sequencia);
			numero = input.nextInt();
		}
		
		input.close();

	}
}
