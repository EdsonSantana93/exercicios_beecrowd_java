package iniciante.level1;

import java.util.Scanner;

public class Uri1157_DivisoresI {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = teclado.nextInt();
	    
        for (int divisor = 1; divisor <= numero; divisor++){
            if (numero%divisor == 0){
                 System.out.println(divisor);
            }
        }

        teclado.close();
	}

}
