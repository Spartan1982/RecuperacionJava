package dtos;

public class AlumnoDto {

	long idalumno;
	public long getIdalumno() {
		return idalumno;
	}
	public void setIdalumno(long idalumno) {
		this.idalumno = idalumno;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getFechaNac() {
		return FechaNac;
	}
	public void setFechaNac(String fechaNac) {
		FechaNac = fechaNac;
	}
	
	String nombre;
	String apellido1;
	String apellido2;
	String email;
	String dni;
	String direccion;
	String FechaNac;
	
	int telefono;
	
	
}
