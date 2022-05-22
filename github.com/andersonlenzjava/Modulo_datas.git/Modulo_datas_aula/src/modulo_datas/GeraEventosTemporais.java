package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GeraEventosTemporais {

	public static void main(String[] args) throws ParseException {
		
		//cria um formato e passa um valor para a variavel 
		Date dateInicial =	new SimpleDateFormat("dd/MM/yyyy").parse("08/04/2021");//data inicial 
		
		//cria um objeto calendar
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dateInicial);//atribui a data inicial ao calendar

		//rotina para chamar os m�todos de adicionar mes e imprimir a nova data de boleto
		for (int parcela = 1; parcela <= 12; parcela ++) {
			calendar.add(Calendar.MONTH, 1);//adiciona um m�s a data atribuida
			
			System.out.println("Parcela n�mero: " + parcela + " Vencimento � em : "
			+ new SimpleDateFormat("dd/MM/yyy").format(calendar.getTime()));
		}
	}
}
