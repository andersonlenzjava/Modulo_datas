package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class APINovasData {
	
	public static void main(String[] args) throws ParseException {
		
		//implementadas apartir do java 8, mais fácil de utilizar 
		
		//métodos estáticos não precisa instânciar
		LocalDate dataAtual = LocalDate.now();
		
		System.out.println("Data Atual : " + dataAtual);
		System.out.println("Data Atual : " + dataAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora atual é : " + horaAtual);
		
		System.out.println("Hora atual é : " + horaAtual.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
		
		//apertando ponto é possivel ver vários métodos que tem acessivel, ver a literatura
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual: " + dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")));
		//exemplo de formatação no novo sistema, aperter e ir vendo na literatura como fica, tem vários métodos
		
	}

}
