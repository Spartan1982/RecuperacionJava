package servicios;

import java.io.FileWriter;
import java.io.IOException;

public class FicheroImplementacion implements FicheroInterfaz {

	
	@Override
	public void escribirFicheroLog(String texto) {

		
	

	
        String ficheroRuta = "C:\\Users\\Jaime\\eclipse-workspace\\Logs\\";
		String nombreFichero = "archivo.txt";
        try {
            // Crear un objeto FileWriter
            FileWriter escritor = new FileWriter(nombreFichero);

            // Escribir en el archivo
            escritor.write("¡Hola, mundo!\n");
            escritor.write("Este es un ejemplo de escritura en un archivo utilizando Java.");

            // Cerrar el FileWriter
            escritor.close();
           
            System.out.println("Se ha escrito en el archivo exitosamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al escribir en el archivo: " + e.getMessage());
            e.printStackTrace();
        }
        
	}   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	
	public void leerFichero(){
		
		
		
	}
	
	
	
}
