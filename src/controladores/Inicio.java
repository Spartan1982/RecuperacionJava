package controladores;

import java.util.Scanner;

import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

public class Inicio {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int opcion;
		boolean cerrarMenu=false;
		MenuInterfaz mi = new MenuImplementacion();
		
		do {
			
		opcion = mi.mostrarMenuSeleccion(sc);	
			
		switch(opcion) {
		
		
		case 0:
			System.out.println("Se cierra la aplicacion");
			cerrarMenu=true;
			break;
		case 1:
			System.out.println("Alta");
			break;
			
		}
		
	}while(!cerrarMenu);

}
}