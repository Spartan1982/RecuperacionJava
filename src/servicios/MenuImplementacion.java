package servicios;

import java.util.Scanner;

public class MenuImplementacion  implements MenuInterfaz{

	@Override
	public int mostrarMenuSeleccion(Scanner sc) {
		
		int opcion;
		
		System.out.println("1.Cerrar menu");
		System.out.println("2.Alta");
		System.out.println("Elija una opcion");
		
		opcion = sc.nextInt();
		return opcion;
		
		
	}

	@Override
	public void alta() {
		
		
	}

	@Override
	public void baja() {
		
		
	}
	

	
	
}
