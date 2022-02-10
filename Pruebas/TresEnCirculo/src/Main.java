import java.awt.*;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Main{
	
	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();
		Pantalla pantalla = new Pantalla();
		Pantalla.main(args);
		tablero.inicializarTablero();
		
	}

}
