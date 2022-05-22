package modulo_datas;

import java.time.Duration;
import java.time.Instant;

public class InstantJTM {
	
	public static void main(String[] args) throws InterruptedException {
		
		//calculo do tempo de processos, para avaliar os tempos do processos 
		Instant inicio = Instant.now();
		
		Thread.sleep(2000);
		
		Instant ifinal = Instant.now();
		
		Duration duracao = Duration.between(inicio, ifinal);
		
		System.out.println(" Dura��o em nano segundos : " + duracao.toNanos());
		
		System.out.println(" Dura��o em minutos : " + duracao.toMinutes());
		
		System.out.println(" Dura��o em horas : " + duracao.toHoursPart());
		
		System.out.println(" Dura��o em milisegundos : " + duracao.toMillis());
		
		System.out.println(" Dura��o em dias : " + duracao.toDays());
	}

}
