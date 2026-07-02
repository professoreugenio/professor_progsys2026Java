package aula05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;

public class DataHora {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime datahora = LocalDateTime.now();
		
		System.out.println("Data: "+ data + " Hora: "+ hora);
		System.out.println("\n------------------------------\n");
		System.out.println("Data hora: "+ datahora);
		
		
	}

}
