package aula05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataHora {
	
	public static void main(String[] args) {
		
				
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		LocalDateTime datahora = LocalDateTime.now();	
		
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm:ss");
		String databr = data.format(dataformatada);
		String horabr = hora.format(horaformatada);
		
		
		
		//System.out.println("Data: "+databr + " às " + horabr);
		System.out.println("Data: "+ data + " Hora: "+ hora);
		/*
		 * 
		System.out.println("\n------------------------------\n");
		System.out.println("Data hora: "+ datahora);*/
		
		
	}

}
