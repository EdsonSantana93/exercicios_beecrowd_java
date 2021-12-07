package iniciante.level3;

import java.math.BigInteger;
import java.util.Scanner;

public class Uri2334_Patinhos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		BigInteger patinhos = teclado.nextBigInteger();
		
		while (patinhos.longValue() != -1) {
			patinhos = patinhos.longValue() != 0 ? patinhos.subtract(BigInteger.valueOf(1)) : BigInteger.valueOf(0);
			System.out.println(patinhos);
			patinhos = teclado.nextBigInteger();
		}
		
		teclado.close();

	}

}
