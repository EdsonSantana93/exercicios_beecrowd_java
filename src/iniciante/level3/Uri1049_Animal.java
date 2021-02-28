package iniciante.level3;

import java.util.Scanner;

public class Uri1049_Animal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String classificacao1 = teclado.nextLine();
		String classificacao2 = teclado.nextLine();
		String classificacao3 = teclado.nextLine();

		if (classificacao1.toLowerCase().equals("vertebrado")) {
			if (classificacao2.toLowerCase().equals("ave")) {
				if (classificacao3.toLowerCase().equals("carnivoro")) {
					System.out.println("aguia");
				} else {
					System.out.println("pomba");
				}
			} else {
				if (classificacao3.toLowerCase().equals("onivoro")) {
					System.out.println("homem");
				} else {
					System.out.println("vaca");
				}
			}
		} else {
			if (classificacao2.toLowerCase().equals("inseto")) {
				if (classificacao3.toLowerCase().equals("hematofago")) {
					System.out.println("pulga");
				} else {
					System.out.println("lagarta");
				}
			} else {
				if (classificacao3.toLowerCase().equals("hematofago")) {
					System.out.println("sanguessuga");
				} else {
					System.out.println("minhoca");
				}
			}
		}
		teclado.close();

	}

}
