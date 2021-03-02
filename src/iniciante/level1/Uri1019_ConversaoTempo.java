package iniciante.level1;

import java.util.Scanner;

public class Uri1019_ConversaoTempo {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int duracao = teclado.nextInt();
		int horas = duracao/3600;
		duracao -= (horas * 3600); // é o mesmo que duracao = duracao - (horas * 3600);
		int minutos = duracao/60;
		duracao -= (minutos * 60);
		int segundos = duracao;
		
		System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
		
		teclado.close();

	}

}
