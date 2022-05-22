package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalculoDatas {
	
	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance(); //pega data atual 
		
		//Simular uma data que vem do banco de dados 
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2021"));
		//setando a data do calendário, instânciando um novo modelo, e atribuindo um novo valor
		
		calendar.add(calendar.DAY_OF_MONTH, -5);//operações no dia do mês
		
		System.out.println("Somando o dia do mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		//tenho de setar o formato toda vez que vou manipular uma data 
		calendar.add(calendar.MONTH, 1);
		
		System.out.println("Somando o mês: " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		//aqui no caso nao tem a instânciação de uma variavel para receber o formato, dai a cada momento ele instancia uma nova variavel 
		calendar.add(calendar.YEAR, 1);
		
		System.out.println("Somando anos : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
