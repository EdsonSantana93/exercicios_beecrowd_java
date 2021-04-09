package iniciante.level7;

import java.util.Scanner;

public class Uri1837_Prefacio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		Integer numero1 = teclado.nextInt();
		Integer numero2 = teclado.nextInt();
		Integer quociente = numero1 / numero2;
		Integer resto = 0;
		boolean mudou = false;
		
		if (numero1 < 0 && numero1 % numero2 != 0) {
			if (numero2 < 0) {
				numero2 /= -1;
				mudou = true;
			}
			quociente = numero1 / numero2 - 1;
			resto = numero1 - (quociente * numero2);
			if (mudou) {
				quociente /= -1;
			}
		} else {
			quociente = numero1 / numero2;
			resto = numero1 % numero2;
		}
		
		System.out.print(quociente);
		System.out.println(" " + resto);
		
		teclado.close();

	}

}
