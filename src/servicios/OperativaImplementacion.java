package servicios;

import java.util.Scanner;

import controladores.Inicio;
import dtos.AlumnoDto;

public class OperativaImplementacion implements OperativaInterfaz {

	
	public void alta() {
		
		Scanner sc = new Scanner(System.in);
		AlumnoDto alumn = new AlumnoDto();
		
		System.out.println("Introduzca el nombre");
		String nombre = sc.nextLine();
		
		System.out.println("Introduzca el apellidos1");
		String apellidos1 = sc.nextLine();
		
		System.out.println("Introduzca el apellidos2");
		String apellidos2 = sc.nextLine();
		
		System.out.println("Introduzca el email");
		String email = sc.nextLine();
		
		System.out.println("Introduzca el direccion");
		String direccion = sc.nextLine();
			
		System.out.println("Introduzca el telefono");
		String telefono = sc.nextLine();
		
		System.out.println("Introduzca el dni");
		String dni = sc.nextLine();
		
		
	}
	
	private long generarId() {
		
		int tamanioLista = Inicio.ListaAlumno.size();
		long nuevoId;
		
		if (tamanioLista>0) {
			
			nuevoId = Inicio.ListaAlumno.get(tamanioLista-1).getIdalumno()+1;
		}else {
			nuevoId = 1;
		}
		return nuevoId;
	}
}
