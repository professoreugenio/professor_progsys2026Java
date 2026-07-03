package config;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Datahorapadraobr {
	
	public String dataFormatada() {
		// 1º método da class datahoraformatada
		
		LocalDate data = LocalDate.now();
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String databr = data.format(dataformatada);
		
		return "Data: "+databr;
	}
	
	public String horaFormatada() {
		
		LocalTime hora = LocalTime.now();
		DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm:ss");
		String horabr  = hora.format(horaformatada);
		
		return "Hora: "+ horabr;
	}
	
	public String datahoraFormatada() {
		
		LocalDateTime datahora = LocalDateTime.now();
		DateTimeFormatter datahoraformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		String datahorabr = datahora.format(datahoraformatada);
		
		
		return "Data hora: " + datahorabr;
	}
	
	
	

}
