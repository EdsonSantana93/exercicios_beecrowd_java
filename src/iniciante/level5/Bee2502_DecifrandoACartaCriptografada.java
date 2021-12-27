package iniciante.level5;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Bee2502_DecifrandoACartaCriptografada {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String alfabeto = "[a-zA-Z]";

		while (teclado.hasNext()) {
			int cifra = teclado.nextInt();
			int linhas = teclado.nextInt();
			teclado.nextLine();

			String fraseSecreta;
			String fraseDecifrada;
			String sequencia1 = teclado.nextLine();
			String sequencia2 = teclado.nextLine();
			Map<String, String> gabarito = new HashMap<>();

			for (int letra = 0; letra < sequencia1.length(); letra++) {
				String letra1 = String.valueOf(sequencia1.charAt(letra));
				String letra2 = String.valueOf(sequencia2.charAt(letra));

				if (Pattern.matches(alfabeto, letra1) && Pattern.matches(alfabeto, letra2)) {
					gabarito.put(letra1, letra2);
					gabarito.put(letra1.toLowerCase(), letra2.toLowerCase());
				} else {
					gabarito.put(letra1.toLowerCase(), letra2.toLowerCase());
				}
			}

			for (int linha = 1; linha <= linhas; linha++) {
				fraseSecreta = teclado.nextLine();
				fraseDecifrada = decifrarFrase(gabarito, fraseSecreta);
				System.out.println(fraseDecifrada);
			}
			System.out.println();
		}
	}

	private static String decifrarFrase(Map<String, String> gabarito, String fraseSecreta) {

		String palavraDecifrada = "";

		for (int index = 0; index < fraseSecreta.length(); index++) {
			String letra = String.valueOf(fraseSecreta.charAt(index));
			if (gabarito.containsKey(letra)) {
				palavraDecifrada += gabarito.get(letra);
			}

			else if (gabarito.containsValue(letra)) {
				palavraDecifrada += gabarito.entrySet().stream().filter(e -> e.getValue().equals(letra)).findFirst()
						.map(Map.Entry::getKey).get();
			}

			else {
				palavraDecifrada += letra;
			}

		}

		return palavraDecifrada;
	}

}
