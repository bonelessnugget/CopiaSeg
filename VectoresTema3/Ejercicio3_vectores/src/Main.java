/**
 * Lee un vector de 10 componentes enteros; calcula el mayor, el menor, y los lugares donde se encuentran.
 * @author yszee
 *
*/
import java.util.Arrays;

public class Main {
	

	public static void main(String[] args) {
		int[] victor = new int[] {1,3,2,5,7,31,48,23};
		int valorMax = victor[0];
		int valorMin = victor[0];
		int posMax;
		for (int i = 0; i < victor.length; i++) {
			if (victor[i]  > valorMax)
				valorMax = victor[i];
		}
		posMax=Arrays.asList(victor).indexOf(valorMax);
		for (int i = 0; i< victor.length; i++) {
			if (victor[i] < valorMin)
				valorMin = victor[i];
			
		}
		
		System.out.println(valorMin + " " + valorMax +" " + posMax);

	}

}
