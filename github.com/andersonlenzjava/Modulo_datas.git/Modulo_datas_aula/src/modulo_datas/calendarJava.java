package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
//calendar é melhor de usar 
public class calendarJava {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();
		
		Date date = new Date();
		
		System.out.println(" Calendar em milisegundos: " + calendar.getTimeInMillis());
		
		System.out.println("Calendar: Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
		
		System.out.println("Calendar: Dia da semana: " + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
		//-1 por causa do tipo de retorno 
		System.out.println("Calendar: Hora do dia:  " + calendar.get(Calendar.HOUR_OF_DAY));
		
		System.out.println("Calendar: Minuto da hora:  " + calendar.get(Calendar.MINUTE));
		
		System.out.println("Calendar: Segundos:  " + calendar.get(Calendar.SECOND));
		
		System.out.println("Calendar: Ano:  " + calendar.get(Calendar.YEAR));
		
		//---------------------------Simple Date Format--------------------------------//
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
		System.out.println("Data atual em formato padrão e String: " + simpleDateFormat.format(calendar.getTime()));
	
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(calendar.getTime()));
		
		
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("1992-09-03 12:30.33"));//retorna uma data no formato ultimo
	
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//sem a hora minuto e segundo
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("1992-09-03"));
	
	}

}
