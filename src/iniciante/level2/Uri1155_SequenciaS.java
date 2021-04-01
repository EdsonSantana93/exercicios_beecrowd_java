package iniciante.level2;

public class Uri1155_SequenciaS {

	public static void main(String[] args) {
		double S = 0;

		for (int rodada = 1; rodada <= 100; rodada++) {
			S += 1.0 / rodada;
		}

		System.out.printf("%.2f", S);
	}

}
