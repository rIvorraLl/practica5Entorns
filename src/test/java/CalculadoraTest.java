package testsMetodos;

import static org.junit.Assert.*;

import org.junit.Test;

import practica5.Calculadora;

public class CalculadoraTest {

	@Test
	public void testCalculadora() throws Throwable {
		Calculadora test = new Calculadora();
		float a = 6;
		float b = 3;
		float resultadoSuma = test.sumar(a, b);
		assertEquals(9, resultadoSuma, 0);
		float resultadoResta = test.restar(a, b);
		assertEquals(3, resultadoResta, 0);
		float resultadoMultiplicacion = test.multiplicar(a, b);
		assertEquals(18, resultadoMultiplicacion, 0);
		float resultadoDivision = test.dividir(a, b);
		assertEquals(2, resultadoDivision, 0);
	}
}
