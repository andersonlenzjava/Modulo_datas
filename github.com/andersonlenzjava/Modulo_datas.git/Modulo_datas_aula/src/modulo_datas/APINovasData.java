package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class APINovasData {
	
	public static void main(String[] args) throws ParseException {
		
		//implementadas apartir do java 8, mais f�cil de utilizar 
		
		//m�todos est�ticos n�o precisa inst�nciar
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual : " + dataAtual);
		System.out.println("Data Atual : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual � : " + horaAtual);
		
		System.out.println("Hora atual � : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		//apertando ponto � possivel ver v�rios m�todos que tem acessivel, ver a literatura
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		//exemplo de formata��o no novo sistema, aperter e ir vendo na literatura como fica, tem v�rios m�todos
		
	}

}
