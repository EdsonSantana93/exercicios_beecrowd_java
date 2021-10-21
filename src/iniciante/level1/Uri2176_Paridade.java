package iniciante.level1;

import java.util.Scanner;

public class Uri2176_Paridade {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		String mensagemOriginal = teclado.nextLine();
		
		System.out.println(acrescentarBit(mensagemOriginal));
		
		teclado.close();

	}

	private static String acrescentarBit(String mensagemOriginal) {
		int quantidadeBit1 = 0;
		
		for (int index = 0; index < mensagemOriginal.length(); index++) {
			if (mensagemOriginal.charAt(index) == '1') {
				quantidadeBit1++;
			}
		}
		
		String mensagemCodificada = mensagemOriginal.concat(quantidadeBit1 % 2 != 0 ? "1":"0");
		
		return mensagemCodificada;
	}

}
