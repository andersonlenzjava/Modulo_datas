package modulo_datas;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class CompareDatas {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");// inst�nica o novo modelo

		Date dateVencimentoBoleto = simpleDateFormat.parse("10/07/2022");// passa o valor para a inst�nica

		Date dataAtualHoje = simpleDateFormat.parse("10/07/2022");
		// libera os m�todos do objeto
		if (dateVencimentoBoleto.after(dataAtualHoje)) {// posterior ou depois da data atual(s� se for after vai funcioar

			System.out.println(" Boleto n�o vencido ");
		} else {
			System.out.println(" Boleto vencido - URGENTE ");
		}

		if (dateVencimentoBoleto.before(dataAtualHoje)) {// se a data 1 � menor que a data 2

			System.out.println(" Boleto vencido - URGENTE ");
		} else {
			System.out.println(" Boleto n�o vencido ");
		}
		
		if (dataAtualHoje.equals(dateVencimentoBoleto)) {
			System.out.println("Boleto vence hoje !!!!!!");
		}
	}

}
