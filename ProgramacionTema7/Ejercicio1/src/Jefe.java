/**
 * Escribe un programa que pida los datos de una serie de empleados que no son jefes, tantos
como el usuario indique. También hay que pedir los datos de una serie de jefes que son, al
mismo tiempo, empleados, tantos como el usuario indique. Una vez insertados todos los
datos, hay que visualizarlos.
De los empleados nos interesa: nombre y sueldo.
De los jefes nos interesa: nombre, sueldo, título y nombre del departamento del que es jefe.
 * @author yszee
 *
 */

public class Jefe extends Empleado{
	private String titulo;
	private String nombreDep;
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public void setNombreDep(String nombreDep) {
		this.nombreDep = nombreDep;
	}
	
	public void setTodoJefe(String nombre, String sueldo, String titulo, String nombreDep) {
		super.setTodo(nombre, sueldo);
		this.titulo = titulo;
		this.nombreDep = nombreDep;
	}
	
	public String imprimirTodoJefe() {
		return super.imprimirTodo() + "Titulo/t" + titulo + "/tNombre Dep/t" + nombreDep;
	}
	
	public String imprimirTodo() {
		return super.imprimirTodo() + imprimirTodoJefe();
	}
}