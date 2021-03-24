package iniciante.level2;

public class Uri1156_SequenciaSII {

	public static void main(String[] args) {
		Double S = 1.0;
		Double N = 2.0;
		
		for (int i = 3; i <= 39; i += 2) {
			S += (i/N);
			N *= 2;
		}
		
				
		System.out.printf("%.2f\n", S);

	}

}
