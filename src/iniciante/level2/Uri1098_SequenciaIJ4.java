package iniciante.level2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Uri1098_SequenciaIJ4 {

	public static void main(String[] args) {

		BigDecimal resto;

		for (BigDecimal i = new BigDecimal(0); i.compareTo(new BigDecimal(2.1)) != 1; i = i.add(new BigDecimal(0.2))) {
			
			resto = i.setScale(1, RoundingMode.FLOOR).subtract(new BigDecimal(i.intValue()));
			
			var novoI = resto.doubleValue() == 0 ? i.intValue() : i.setScale(1, RoundingMode.FLOOR);

			for (BigDecimal j = new BigDecimal(1); j.compareTo(new BigDecimal(3)) != 1; j = j.add(new BigDecimal(1))) {
				
				BigDecimal total = j.add(new BigDecimal(novoI.doubleValue()));
				resto = total.setScale(1, RoundingMode.FLOOR).subtract(new BigDecimal(total.intValue()).setScale(1, RoundingMode.FLOOR));
				
				var novoJ = resto.doubleValue() == 0 ? total.intValue() : total.setScale(1, RoundingMode.HALF_EVEN);
				
				System.out.println("I=" + novoI + " J=" + novoJ);
			}
		}

	}
}
