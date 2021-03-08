package iniciante.level6;

import java.math.BigDecimal;
import java.util.Scanner;

public class Uri1021_NotasMoedas {

	//erro no 11 no campo real
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		BigDecimal saldo = new BigDecimal(teclado.nextLine().replace(",", "."));
		Integer notaOuMoeda = 100;
		
		System.out.println("NOTAS:");
		
		do {
			int quant = saldo.intValue() / notaOuMoeda;
			System.out.printf("%d nota(s) de R$ %d.00\n", quant, notaOuMoeda);
			saldo = saldo.subtract(new BigDecimal(quant * notaOuMoeda));
			quant = 0;
			
			notaOuMoeda = atualizarNota(notaOuMoeda);
		} while (notaOuMoeda >= 2);
		
		System.out.println("MOEDAS:");
		
		saldo = saldo.multiply(new BigDecimal(100));
		notaOuMoeda = 100;
		do {
			int quant = saldo.intValue() / notaOuMoeda;
			if (notaOuMoeda == 100) {
				System.out.printf("%d moeda(s) de R$ 1.00\n", quant);
			} else if (notaOuMoeda > 5){
				System.out.printf("%d moeda(s) de R$ 0.%d\n", quant, notaOuMoeda);	
			} else {
				System.out.printf("%d moeda(s) de R$ 0.0%d\n", quant, notaOuMoeda);	
			}
			
			saldo = saldo.subtract(new BigDecimal(quant * notaOuMoeda));
			quant = 0;
			
			notaOuMoeda = atualizarMoedas(notaOuMoeda);
		} while (notaOuMoeda > 0);
		
		
		teclado.close();
	}
	
	private static Integer atualizarMoedas(Integer moeda) {
		switch (moeda) {
		case 100:
			return 50;
		case 50:
			return 25;
		case 25: 
			return 10;
		case 10:
			return 5;
		case 5:
			return 1;
		default:
			return 0;
		}
	}

	private static int atualizarNota(int nota) {
		switch (nota) {
		case 100:
			return 50;
		case 50:
			return 20;
		case 20: 
			return 10;
		case 10:
			return 5;
		case 5:
			return 2;
		default:
			return 1;
		}
	}

}
