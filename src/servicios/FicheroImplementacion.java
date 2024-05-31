package servicios;

import java.io.FileWriter;

public class FicheroImplementacion implements FicheroInterfaz {

	@Override
	public void escribirFicheroLog(String texto) {

		String ficheroRuta = "C:\\Users\\Jaime\\eclipse-workspace\\Logs\\";
		String nombreFichero = 
		
		FileWriter escritor = new FileWriter(ficheroRuta);
		
	}

	public void leerFichero(){
		
		
		
	}
	
	
	
}
