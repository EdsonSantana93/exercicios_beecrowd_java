package iniciante.level2;

import java.util.Scanner;

public class Uri1564_VaiTerCopa {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer reclamacao = 0;
		
		while(teclado.hasNext()) {
			reclamacao = teclado.nextInt();
			System.out.println(reclamacao == 0 ? "vai ter copa!" : "vai ter duas!");
		}
		
		
		teclado.close();

	}

}
