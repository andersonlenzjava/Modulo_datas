package modulo_datas;

import java.time.LocalDate;
import java.time.Period;

public class peridosDates {
	
	public static void main(String[] args) {
		
		//mais uma api para trabalhar com datas 
		
		//LocalDate dataAntiga = LocalDate.of(2020, 2, 8);
		LocalDate dataAntiga = LocalDate.parse("2019-10-05");//método mais usual de passar a data para comparar 
		
	//	LocalDate dataNova = LocalDate.of(2021, 4, 7);
		LocalDate dataNova = LocalDate.parse("2022-05-05");
		
		System.out.println("Data antiga é maior que a data nova : " + dataAntiga.isAfter(dataNova));

		System.out.println("Data antiga é anterior a data nova : " + dataAntiga.isBefore(dataNova));

		System.out.println("Data antiga é igual a data nova : " + dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias : " + periodo.getDays());
		
		System.out.println("Quantos meses : " + periodo.getMonths());
		
		System.out.println("Quantos anos : " + periodo.getYears());
		
		System.out.println("Periodo entre as duas datas é : " + periodo.getYears() + " Anos " 
		+ periodo.getMonths() + " Meses e " + periodo.getDays() + " dias." );
		
		System.out.println("Qual o total de meses : " + periodo.toTotalMonths());
		
	}

}
