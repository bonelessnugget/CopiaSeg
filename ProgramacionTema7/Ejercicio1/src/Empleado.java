/*
 * Escribe un programa que pida los datos de una serie de empleados que no son jefes, tantos
como el usuario indique. Tambi?n hay que pedir los datos de una serie de jefes que son, al
mismo tiempo, empleados, tantos como el usuario indique. Una vez insertados todos los
datos, hay que visualizarlos.
De los empleados nos interesa: nombre y sueldo.
De los jefes nos interesa: nombre, sueldo, t?tulo y nombre del departamento del que es jefe.
 */
public class Empleado{
	private String nombre;
	private String sueldo;
	
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getSueldo() {
		return sueldo;
	}
	
	public void setTodo(String nombre, String sueldo) {
		this.nombre = nombre;
		this.sueldo = sueldo;
	}
	
	public String imprimirTodo() {
		return "\tNombre" + nombre + "\n\tSueldo" + sueldo;
	} 
}