package modulo_datas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CompareDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");// instânica o novo modelo

		Date dateVencimentoBoleto = simpleDateFormat.parse("10/07/2022");// passa o valor para a instânica

		Date dataAtualHoje = simpleDateFormat.parse("22/05/2022");
		// libera os métodos do objeto
		if (dateVencimentoBoleto.after(dataAtualHoje)) {// posterior ou depois da data atual

			System.out.println(" Boleto não vencido ");
		} else {
			System.out.println(" Boleto vencido - URGENTE ");
		}

	}

}
