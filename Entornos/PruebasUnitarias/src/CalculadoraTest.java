import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTest {
int resultado;
	@Test
	public void testSuma() {
		Calculadora suma = new Calculadora(20,30);
		resultado = suma.suma();
		assertEquals(30, resultado);
	}

	@Test
	public void testResta() {
		Calculadora resta = new Calculadora(20,30);
		resultado = resta.resta();
		assertEquals(30,resultado);
	}

	@Test
	public void testMultiplicaion() {
		Calculadora mult = new Calculadora(3,2);
		resultado = mult.multiplicaion();
		assertEquals(30,resultado);
	}

	@Test
	public void testDivision() {
		Calculadora div = new Calculadora(4,2);
		resultado = div.division();
		assertEquals(2,resultado);
	}
	
	@Test
	public void testSuma2() {
		Calculadora resta2 = new Calculadora(true);
		resultado = resta2.resta2();
		
	}

}
