package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperadorTestCase {

	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		multioperador = new Multioperador();

			multioperador.addNumber(1);
			multioperador.addNumber(3);
			multioperador.addNumber(5);
			multioperador.addNumber(1);
			multioperador.addNumber(4);
		}

	@Test
	public void testSuma() {
		int amount = multioperador.suma();
		assertEquals(amount, 14);
	}
	
	public void testResta() {
		int amount = multioperador.resta();
		assertEquals(amount, -12);
	}
	
	public void testMultiplicacion() {
		int amount = multioperador.multiplicacion();
		assertEquals(amount, 60);
	}

}

	