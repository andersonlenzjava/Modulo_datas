package modulo_datas;

import java.util.Date;

public class DatasEmJava {
	
	//usando a API datas
	
	public static void main(String[] args) {
		
		Date date = new Date();//Instancia��o do objeto da classe que recebe os dados 
		//m�todos desta classe (ler a documenta��o de cada m�todo para saber o que faz)
		System.out.println(" Data em milisegundos: " + date.getTime());//quando vc aperta o espa�o aparece o tipo de v�riavel que retorna
		ff
		System.out.println(" Dia do m�s: " + date.getDate());
		
		System.out.println(" Dia da semana: " + date.getDay());
		
		System.out.println(" Hora do dia:  " + date.getHours());
		
		System.out.println(" Minuto da hora:  " + date.getMinutes());
		
		System.out.println(" Segundos:  " + date.getSeconds());
		
		System.out.println(" Ano:  " + (1900 + date.getYear()));//ano base 1900
	}

}
