import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Introduce el email");
		Scanner teclado = new Scanner(System.in);
		String email = teclado.nextLine();
		String local = email.substring(0,email.indexOf("@"));
		String dominio = email.substring(email.indexOf("@",email.indexOf(email.length())));
		boolean correctoLocal = false;
		boolean correctoDominio = false;
		System.out.println(local);
		System.out.println(dominio);
		while (correctoLocal == false && correctoDominio == false) {
		if (local.startsWith(".") || local.endsWith(".")) {
			System.out.println("No es correcto");
			break;
		}else if(local.matches("..") == true) {
			System.out.println("NO es correcto");
		}
	}

}
}
