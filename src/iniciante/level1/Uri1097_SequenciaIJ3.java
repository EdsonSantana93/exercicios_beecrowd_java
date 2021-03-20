package iniciante.level1;

public class Uri1097_SequenciaIJ3 {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i += 2) {
			int soma = 6;
			for (int j = 1; j <= 3; j++) {
				System.out.printf("I=%d J=%d\n", i, i + soma);
				soma--;
			}
		}

	}

}
