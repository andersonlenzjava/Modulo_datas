package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesAnoSemana {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual é : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana : " + localDate.getDayOfWeek());

		System.out.println("Dia da semana em n° : " + localDate.getDayOfWeek().ordinal());
		
		System.out.println("Dia do mês : " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano : " + localDate.getDayOfYear());
		
		System.out.println("Número do mês : " + localDate.getMonthValue());
		
		System.out.println("Nome do mês : " + localDate.getMonth());
		
		System.out.println("Ano : " + localDate.getYear());
	}

}
