package modulo_datas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CompareDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");// instânica o novo modelo

		Date dateVencimentoBoleto = simpleDateFormat.parse("10/07/2022");// passa o valor para a instânica

		Date dataAtualHoje = simpleDateFormat.parse("10/07/2022");
		// libera os métodos do objeto
		if (dateVencimentoBoleto.after(dataAtualHoje)) {// posterior ou depois da data atual(só se for after vai funcioar

			System.out.println(" Boleto não vencido ");
		} else {
			System.out.println(" Boleto vencido - URGENTE ");
		}

		if (dateVencimentoBoleto.before(dataAtualHoje)) {// se a data 1 é menor que a data 2

			System.out.println(" Boleto vencido - URGENTE ");
		} else {
			System.out.println(" Boleto não vencido ");
		}
		
		if (dataAtualHoje.equals(dateVencimentoBoleto)) {
			System.out.println("Boleto vence hoje !!!!!!");
		}
	}

}
