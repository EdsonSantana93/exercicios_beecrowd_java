package iniciante.level6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri2493_JogoOperador {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		while (teclado.hasNext()) {
			
			Integer quantidadeJogadores = teclado.nextInt();
			teclado.nextLine();
			List<Integer> primeiroNumero = new ArrayList<>();
			List<Integer> segundoNumero = new ArrayList<>();
			List<Integer> resultado = new ArrayList<>();
			List<String> nomesNaoPassaram = new ArrayList<>();
			
			for (int exp = 1; exp <= quantidadeJogadores; exp++) {
				String[] expressao = teclado.nextLine().replace("=", " ").split(" ");
				primeiroNumero.add(Integer.parseInt(expressao[0]));
				segundoNumero.add(Integer.parseInt(expressao[1]));
				resultado.add(Integer.parseInt(expressao[2]));
			}
			
			for (int jog = 0; jog < quantidadeJogadores; jog++) {
				String nome = teclado.next();
				Integer opcao = teclado.nextInt();
				String operador = teclado.nextLine();
				
				boolean acertouExpressao = verificarExpressao(primeiroNumero.get(opcao -1), segundoNumero.get(opcao-1),
						resultado.get(opcao-1), operador);
				
				if (!acertouExpressao)
					nomesNaoPassaram.add(nome);
			}
			
			verificarResultado(nomesNaoPassaram, quantidadeJogadores);
		}
		
		teclado.close();

	}

	
	private static void verificarResultado(List<String> nomesNaoPassaram, Integer quantidadeJogadores) {
		if (nomesNaoPassaram.size() == quantidadeJogadores) {
			System.out.println("None Shall Pass!");
		} else if (nomesNaoPassaram.size() == 0) {
			System.out.println("You Shall All Pass!");
		} else {
			String resposta = "";
			Collections.sort(nomesNaoPassaram);
			for(String nome: nomesNaoPassaram) {
				resposta += nome + " ";
			}
			System.out.println(resposta.trim());
		}
		
	}


	private static boolean verificarExpressao(Integer numero1, Integer numero2, Integer resultado, String operador) {
		
		switch (operador.toUpperCase().hashCode()) {
		case 1035:
			if(numero1 + numero2 == resultado)
				return true;
			break;
		case 1037:
			if(numero1 - numero2 == resultado)
				return true;
			break;
		case 1034:
			if(numero1 * numero2 == resultado)
				return true;
			break;
		case 1065:
			if (numero1 + numero2 != resultado && numero1 - numero2 != resultado && numero1 * numero2 != resultado)
				return true;
			break;
		default:
			return false;
		}
		return false;
	}

}
