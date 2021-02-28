package iniciante.level1;

public class Uri2747_Saida1 {

	public static void main(String[] args) {
		System.out.println(desenharBase());
		for (int i = 1; i <=5; i++)
			System.out.println(desenharLateral());
		System.out.println(desenharBase());
		

	}
	
	public static String desenharBase() {
		String base = "-";
		return base.repeat(39);
	}
	
	public static String desenharLateral() {
		String lateralLimite = "|";
		String lateralEspaco = " ";
		String lateral = "";
		
		lateral = lateralLimite.concat(lateralEspaco.repeat(37)).concat(lateralLimite);		
		return lateral;
	}
}
