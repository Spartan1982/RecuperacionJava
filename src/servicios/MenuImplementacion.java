package servicios;

import java.util.Scanner;

public class MenuImplementacion  implements MenuInterfaz{

	@Override
	public int mostrarMenuSeleccion(Scanner sc) {
		
		int opcion;
		
		System.out.println("Cerrar menu");
		System.out.println("Alta");
		
		System.out.println("Elija una opcion");
		
		opcion = sc.nextInt();
		return opcion;
		
		
	}

	@Override
	public void alta() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void baja() {
		// TODO Auto-generated method stub
		
	}

	
	
}
