package aula05;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Datahorahoje {
	
	public static void main(String[] args) {
		
		LocalDate data = LocalDate.now();
		LocalTime hora = LocalTime.now();
		DateTimeFormatter dataformatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter horaformatada = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		String databr = data.format(dataformatada);
		String horabr = hora.format(horaformatada);
		
		System.out.println("hoje é: "+databr+ " hora: "+ horabr);
		
	}

}
