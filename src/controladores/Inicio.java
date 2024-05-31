package controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import dtos.AlumnoDto;
import servicios.FicheroImplementacion;
import servicios.FicheroInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static List<AlumnoDto>ListaAlumno = new ArrayList<AlumnoDto>();
	
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean cerrarMenu=false;
				
		MenuInterfaz mi = new MenuImplementacion();
		FicheroInterfaz fi = new FicheroImplementacion(); 
		
		do {
			
		opcion = mi.mostrarMenuSeleccion(sc);	
			
		switch(opcion) {
		
		
		case 0:
			System.out.println("Se cierra la aplicacion");
			cerrarMenu=true;
			break;
		case 1:
			System.out.println("Alta");
			mi.alta();
			break;
		case 2:
			System.out.println("Baja");
			mi.baja();
			break;
			
		}
		
	}while(!cerrarMenu);

}
}