package iniciante.level2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Uri2139_NatalDePedrinho {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNext()) {
			
			int mes = teclado.nextInt();
			int dia = teclado.nextInt();
			LocalDate natal = LocalDate.parse("2016-12-25");
			LocalDate dateNow = LocalDate.of(2016, mes, dia);

			if (dateNow.isEqual(natal)) {
				System.out.println("E natal!");
			} else if (dateNow.equals(natal.minusDays(1))) {
				System.out.println("E vespera de natal!");
			} else if (dateNow.isBefore(natal)) {
				long diasDiferenca = ChronoUnit.DAYS.between(dateNow, natal);
				System.out.printf("Faltam %d dias para o natal!\n", diasDiferenca);
			} else {
				System.out.println("Ja passou!");
			}
		}
		

		teclado.close();

	}

}
