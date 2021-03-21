package iniciante.level1;

import java.util.Scanner;

public class Uri1131_Grenais {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Integer resposta = null;
		Integer inter = null;
		Integer gremio = null;
		Integer vitoriaInter = 0;
		Integer vitoriaGremio = 0;
		Integer empate = 0;
		
		do {
			inter = teclado.nextInt();
			gremio = teclado.nextInt();
						
			vitoriaInter += inter > gremio ? 1 : 0;
			vitoriaGremio += gremio > inter ? 1 : 0;
			empate += gremio == inter ? 1 : 0;
			System.out.println("Novo grenal (1-sim 2-nao)");
			resposta = teclado.nextInt();
		} while (resposta != 2);
		
		Integer totalJogos = vitoriaInter + vitoriaGremio + empate;
		
		System.out.println(totalJogos + " grenais");
		System.out.println("Inter: " + vitoriaInter);
		System.out.println("Gremio: " + vitoriaGremio);
		System.out.println("Empates: " + empate);
		
		quemVenceuMais(vitoriaInter, vitoriaGremio);
		teclado.close();
	}

	private static void quemVenceuMais(Integer vitoriaInter, Integer vitoriaGremio) {
		System.out.println(vitoriaInter > vitoriaGremio ? "Inter venceu mais" : "Gremio venceu mais");
		
	}
}
