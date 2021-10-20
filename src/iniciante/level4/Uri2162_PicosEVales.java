package iniciante.level4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2162_PicosEVales {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		List<Integer> alturas = new ArrayList<>();
		int casosTeste = teclado.nextInt();
		String localAtual = "inicio";
		Integer anterior = 0;
		boolean atendeu = true;
		
		for (int caso = 1; caso <= casosTeste; caso++) {
			alturas.add(teclado.nextInt());
		}
		
		for (Integer altura : alturas) {
			if (localAtual.equals("inicio")) {
				localAtual = "segundo";
				anterior = altura;
			} else if (localAtual.equals("segundo")) {
				if (anterior == altura) {
					atendeu = false;
					break;
				}
				localAtual = anterior > altura ? "vale" : "pico";
				anterior = altura;
			} else {
				if (anterior == altura) {
					atendeu = false;
				}
				
				if (anterior > altura && localAtual.equals("vale")) {
					atendeu = false;
				}
				
				if (anterior < altura && localAtual.equals("pico")) {
					atendeu = false;
				}
				
				anterior = altura;
				localAtual = localAtual.equals("pico") ? "vale" : "pico";
			}
		}
		
		
		
		System.out.println(atendeu ? "1" : "0");
		
		teclado.close();

	}

}
