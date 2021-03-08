package iniciante.level3;

import java.util.Scanner;

public class Uri1061_TempoDeUmEvento {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String leituraDiaInicio[] = teclado.nextLine().split(" ");
		String leituraHoraInicio[] = teclado.nextLine().split(" : ");

		Integer diaInicio = Integer.valueOf(leituraDiaInicio[1]);
		Integer horaInicio = Integer.valueOf(leituraHoraInicio[0]);
		Integer minutoInicio = Integer.valueOf(leituraHoraInicio[1]);
		Integer segundoInicio = Integer.valueOf(leituraHoraInicio[2]);

		String leituraDiaFim[] = teclado.nextLine().split(" ");
		String leituraHoraFim[] = teclado.nextLine().split(" : ");

		Integer diaFim = Integer.valueOf(leituraDiaFim[1]);
		Integer horaFim = Integer.valueOf(leituraHoraFim[0]);
		Integer minutoFim = Integer.valueOf(leituraHoraFim[1]);
		Integer segundoFim = Integer.valueOf(leituraHoraFim[2]);

		System.out.println(
				calcularDias(horaFim, horaInicio, diaFim, diaInicio, minutoFim, minutoInicio, segundoFim, segundoInicio)
						+ " dia(s)");
		System.out.println(
				calcularHoras(horaFim, horaInicio, minutoFim, minutoInicio, segundoFim, segundoInicio) + " hora(s)");
		System.out.println(calcularMinutos(minutoFim, minutoInicio, segundoFim, segundoInicio) + " minuto(s)");
		System.out.println(calcularSegundos(segundoFim, segundoInicio) + " segundo(s)");

		teclado.close();
	}

	private static Integer calcularSegundos(Integer segundoFim, Integer segundoInicio) {
		return segundoFim >= segundoInicio ? segundoFim - segundoInicio : 60 - (segundoInicio - segundoFim);
	}

	private static Integer calcularMinutos(Integer minutoFim, Integer minutoInicio, Integer segundoFim,
			Integer segundoInicio) {

		if (minutoFim >= minutoInicio && segundoFim >= segundoInicio) {
			return minutoFim - minutoInicio;
		} else if (minutoFim > minutoInicio && segundoFim < segundoInicio) {
			//return 60 - ((minutoInicio - minutoFim) + (segundoInicio - segundoFim));
			return minutoFim - (minutoInicio + 1);
		} if (minutoFim < minutoInicio && segundoFim >= segundoInicio) {
			return 60 - (minutoInicio - minutoFim);
		}
		return 60 - (minutoInicio - minutoFim) - 1;
	}

	private static Integer calcularHoras(Integer horaFim, Integer horaInicio, Integer minutoFim, Integer minutoInicio,
			Integer segundoFim, Integer segundoInicio) {

		if (horaFim >= horaInicio && minutoFim >= minutoInicio && segundoFim >= segundoInicio) {
			return horaFim - horaInicio;
		} else if (horaFim > horaInicio && (segundoFim < segundoInicio || minutoFim < minutoInicio)) {
			return (horaFim - horaInicio) - 1;
		} else if (horaFim == horaInicio && (segundoFim < segundoInicio && (minutoFim - 1) >= minutoInicio)) {
			return horaFim - horaInicio;
		} else if (horaFim == horaInicio && (segundoFim < segundoInicio || minutoFim < minutoInicio)){
			return 24 - 1;
		} else if (horaFim < horaInicio && (minutoFim >= minutoInicio)) {
			return 24 - (horaInicio - horaFim);
		} else if (horaFim < horaInicio && (minutoFim < minutoInicio)) {
			return 24 - (horaInicio - horaFim) - 1;
		}
		return 24 - (horaInicio - horaFim);
	}

	private static Integer calcularDias(Integer horaFim, Integer horaInicio, Integer diaFim, Integer diaInicio,
			Integer minutoFim, Integer minutoInicio, Integer segundoFim, Integer segundoInicio) {

		if (horaFim > horaInicio) {
			return diaFim - diaInicio;
		} else if(horaFim == horaInicio && (minutoFim == minutoInicio && segundoFim == segundoInicio)) {
			return diaFim - diaInicio;
		} else if (horaFim == horaInicio && (minutoFim >= minutoInicio && segundoFim >= (segundoInicio - 1))) {
			return diaFim - diaInicio;
		} 
		return (diaFim - diaInicio) - 1;
	}

}
