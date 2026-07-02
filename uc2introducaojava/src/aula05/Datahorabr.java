package aula05;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Datahorabr {
	
	
	LocalDate data= LocalDate.now();
	LocalTime hora = LocalTime.now();
	
	public String Mostrardata() {
		
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String databr = data.format(dataformatada);
		return databr;

	}
	

}
