package iniciante.level4;

import java.util.Scanner;

public class Uri1045_TiposDeTriangulos {

	public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
		double temp;
		double A = teclado.nextFloat();
		double B = teclado.nextFloat();
		double C = teclado.nextFloat();
		
		for(int c = 0; c < 2; c++) {
			if (A < B) {
				temp = A;
				A = B;
				B = temp;
			}
			
			if (B < C) {
				temp = B;
				B = C;
				C = temp;
			}
		}
		
		classificarTriangulo(A, B, C);
				
		
		teclado.close();

	}

	private static void classificarTriangulo(double a, double b, double c) {
		if(a >= b + c) {
			System.out.println("NAO FORMA TRIANGULO");
		}else {
			if(a*a == b*b + c*c) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if(a*a > b*b + c*c) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if(a*a < b*b + c*c) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if(a == b && b == c){
				System.out.println("TRIANGULO EQUILATERO");
			}
			if(a == b && a != c  || b == c && b != a || c == a && c != b) {
				System.out.println("TRIANGULO ISOSCELES");
			}						
		}
		
	}
	
	

}
