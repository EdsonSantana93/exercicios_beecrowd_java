package iniciante.level1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1154_Idades {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Integer idade = input.nextInt();
		
		List<Integer> idades = new ArrayList<>();
			
		while(idade > 0) {
			idades.add(idade);
			idade = input.nextInt();
		}
		
		Double media = idades.stream().mapToDouble(idad -> idad).average().getAsDouble();
		
		System.out.printf("%.2f", media);
		
		input.close();

	}

}
