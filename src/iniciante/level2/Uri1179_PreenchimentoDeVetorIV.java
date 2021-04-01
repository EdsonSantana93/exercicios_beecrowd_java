package iniciante.level2;

import java.util.Scanner;

public class Uri1179_PreenchimentoDeVetorIV {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer pares[] = new Integer[5];
		Integer impares[] = new Integer[5];
		Integer numero;
		
		int contadorPar = 0;
		int contadorImpar = 0;
		
		for (int i = 1; i <= 15; i ++) {
			numero = teclado.nextInt();
			
			if (numero % 2 == 0) {
				pares[contadorPar] = numero;
				contadorPar++;
			} else {
				impares[contadorImpar] = numero;
				contadorImpar++;
			}
			
			if (contadorImpar == 5) {
				for (int imp = 0; imp < 5; imp++) {
					System.out.printf("impar[%d] = %d\n", imp, impares[imp]);
					impares[imp] = null;
				}
				contadorImpar = 0;
			}
			
			if (contadorPar == 5) {
				for (int par = 0; par < 5; par++) {
					System.out.printf("par[%d] = %d\n", par, pares[par]);
					pares[par] = null;
				}
				contadorPar = 0;
			}
			
		}
		
		for (int imp = 0; imp <= 5; imp++) {
			if (impares[imp] != null) {
				System.out.printf("impar[%d] = %d\n", imp, impares[imp]);
			} else {
				break;
			}
		}
		
		for (int par = 0; par <= 5; par++) {
			if (pares[par] != null) {
				System.out.printf("par[%d] = %d\n", par, pares[par]);
			} else {
				break;
			}
		}
		
		
		teclado.close();

	}

}
