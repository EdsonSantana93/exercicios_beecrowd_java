package iniciante.level1;

import java.util.Scanner;

public class Uri1114_SenhaFixa {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Integer senha = null;		
		do {
			senha = teclado.nextInt();
			if (senha != 2002) {
				System.out.println("Senha Invalida");
			} else {
				System.out.println("Acesso Permitido");
			}
		} while(senha != 2002);
		
		teclado.close();
	}

}
