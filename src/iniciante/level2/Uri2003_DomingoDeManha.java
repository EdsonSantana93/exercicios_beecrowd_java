package iniciante.level2;

import java.time.LocalTime;
import java.util.Scanner;

public class Uri2003_DomingoDeManha {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		while (teclado.hasNext()) {
			String horario = teclado.nextLine();
			horario = horario.length() == 4 ? "0" + horario : horario;

			LocalTime horaSaida = LocalTime.parse(horario);
			LocalTime horaChegada = horaSaida.plusHours(1);
			LocalTime horaMaximaAtraso = horaChegada.getHour() >= 8 ? horaChegada.minusHours(8)
					: LocalTime.parse("00:00");

			Integer atrasoEmMinutos = (horaMaximaAtraso.getHour() * 60) + horaMaximaAtraso.getMinute();
			System.out.println("Atraso maximo: " + atrasoEmMinutos);
		}

		teclado.close();

	}

}
