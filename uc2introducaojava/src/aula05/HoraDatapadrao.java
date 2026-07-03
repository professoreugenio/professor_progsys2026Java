package aula05;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class HoraDatapadrao {
	
	public String dataFormatada(){

		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter horaformata = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String databr = data.format(dataformatada);
		String horabr = hora.format(horaformata);
		
		return databr + "-" + horabr;
		
	}
	
	

}
