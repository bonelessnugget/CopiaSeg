import java.util.Scanner;
public class Ejercicio1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce un numero:");
		int num = teclado.nextInt();
		
		for (int i = 0; i<num; i++) {
			for (int espacio = 1; espacio > i; espacio-=num) {
				System.out.println("");
			}
			for (int j = num; j>i; j--) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}
}
