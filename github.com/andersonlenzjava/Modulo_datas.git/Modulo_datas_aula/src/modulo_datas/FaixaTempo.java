package modulo_datas;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

//m�todos estaticos nao precisam instanciar 
public class FaixaTempo {

	public static void main(String[] args) throws ParseException {

		//pode ser meses, dias, anos, horas 
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("2020-04-01"), LocalDate.now());

		System.out.println(" Diferen�a de dias entre as duas datas: " + dias);

	}

}
