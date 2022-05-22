package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {
	
	//usando a API datas
	
	public static void main(String[] args) throws ParseException {
		
		Date date = new Date();//Instancia��o do objeto da classe que recebe os dados 
		//m�todos desta classe (ler a documenta��o de cada m�todo para saber o que faz)
		System.out.println(" Data em milisegundos: " + date.getTime());//quando vc aperta o espa�o aparece o tipo de v�riavel que retorna
		
		System.out.println(" Dia do m�s: " + date.getDate());
		
		System.out.println(" Dia da semana: " + date.getDay());
		
		System.out.println(" Hora do dia:  " + date.getHours());
		
		System.out.println(" Minuto da hora:  " + date.getMinutes());
		
		System.out.println(" Segundos:  " + date.getSeconds());
		
		System.out.println(" Ano:  " + (1900 + date.getYear()));//ano base 1900
		
		//---------------------------Simple Date Format--------------------------------//
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");//dia m�s e ano, crio o formato com a String e o opcional da hora 
		System.out.println("Data atual em formato padr�o e String: " + simpleDateFormat.format(date));//recebe o objeto um objeto do tipo date, e retorna STRING
	
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");//para banco de dados, usa o mesmo objeto de antes
		System.out.println("Data em formato para banco de dados: " + simpleDateFormat.format(date));
		
		
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("1992-09-03 12:30.33"));//retorna uma data no formato ultimo
		//foi adicionado uma exce��o parseexeption 
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");//sem a hora minuto e segundo
		System.out.println("Objeto Date: "+ simpleDateFormat.parse("1992-09-03"));
		//h� varios tipos de datas que vem precisa saber lidar com todos 
	}

}
