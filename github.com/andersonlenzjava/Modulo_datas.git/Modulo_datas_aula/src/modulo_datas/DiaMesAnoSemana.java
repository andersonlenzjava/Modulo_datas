package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesAnoSemana {
	
	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		System.out.println("Data atual � : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da semana : " + localDate.getDayOfWeek());

		System.out.println("Dia da semana em n� : " + localDate.getDayOfWeek().ordinal());
		
		System.out.println("Dia do m�s : " + localDate.getDayOfMonth());
		
		System.out.println("Dia do ano : " + localDate.getDayOfYear());
		
		System.out.println("N�mero do m�s : " + localDate.getMonthValue());
		
		System.out.println("Nome do m�s : " + localDate.getMonth());
		
		System.out.println("Ano : " + localDate.getYear());
	}

}
