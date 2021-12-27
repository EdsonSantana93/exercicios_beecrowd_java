package iniciante.level2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bee2523_AMensagemDeWill {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			String ordemLetras = teclado.nextLine();
			String mensagemWill = "";
			int qtdeLetras;
			int posicao;
			
			List<Character> letras = new ArrayList<>();
			
			for (int index = 1; index <= 26; index ++) {
				letras.add(ordemLetras.charAt(index - 1));
			}
			
			qtdeLetras = teclado.nextInt();
			
			for (int index = 1; index <= qtdeLetras; index ++ ) {
				posicao = teclado.nextInt();
				mensagemWill = mensagemWill.concat(letras.get(posicao - 1).toString());
			}
			
			teclado.nextLine();
			letras.clear();
			System.out.println(mensagemWill);
		}
		
		
		
		teclado.close();
	}

}
