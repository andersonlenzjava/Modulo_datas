package modulo_datas;

import java.util.Date;

public class DatasEmJava {
	
	//usando a API datas
	
	public static void main(String[] args) {
		
		Date date = new Date();//Instanciação do objeto da classe que recebe os dados 
		//métodos desta classe (ler a documentação de cada método para saber o que faz)
		System.out.println(" Data em milisegundos: " + date.getTime());//quando vc aperta o espaço aparece o tipo de váriavel que retorna
		ff
		System.out.println(" Dia do mês: " + date.getDate());
		
		System.out.println(" Dia da semana: " + date.getDay());
		
		System.out.println(" Hora do dia:  " + date.getHours());
		
		System.out.println(" Minuto da hora:  " + date.getMinutes());
		
		System.out.println(" Segundos:  " + date.getSeconds());
		
		System.out.println(" Ano:  " + (1900 + date.getYear()));//ano base 1900
	}

}
