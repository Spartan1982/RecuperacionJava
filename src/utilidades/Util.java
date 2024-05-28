package utilidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Util {

	
	public static String nombreFichero() {
		
		LocalDate fechaActual = LocalDate.now();
		DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("ddMMyy");
		String nombreCompletoFichero = "log-".concat(fechaActual.format(formatoFecha)).concat(".txt");
		return nombreCompletoFichero;
	}
	
	
}
