/**
 * Ejercicio 1
Escribe un programa que pida los datos de una serie de empleados que no son jefes, tantos
como el usuario indique. Tambi�n hay que pedir los datos de una serie de jefes que son, al
mismo tiempo, empleados, tantos como el usuario indique. Una vez insertados todos los
datos, hay que visualizarlos.
De los empleados nos interesa: nombre y sueldo.
De los jefes nos interesa: nombre, sueldo, t�tulo y nombre del departamento del que es jefe.
 * @author yszee
 *
 */
public class Main{

	public static void main(String[] args) {
		//TODO Loop de cosas
		int numEmpleados;
		boolean funcionando = false;
		
		Empleado[] empleado = new Empleado[3];
		empleado[0] = new Empleado();
		do {
		System.out.println("Introduce cu�ntos empleados quieres introducir: ");
		empleado[0].setTodo("Paco", "765176");
		System.out.println(empleado[0].imprimirTodo());
		empleado[1] = new Jefe();
		((Jefe) empleado[1]).setTodoJefe("Soric", "2lei", "puerco", "Alcatraz");
		System.out.println(((Jefe)empleado[1]).imprimirTodoJefe());
		}while(funcionando = true);
		
		
		
		
	}

}