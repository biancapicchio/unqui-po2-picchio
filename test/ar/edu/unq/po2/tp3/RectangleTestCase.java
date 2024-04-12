package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTestCase {
	private Rectangle rectangle;
	
	@BeforeEach
	public void setUp() throws Exception {
		//area: 80
		//perimetro: 36
		Point esqInfIzq = new Point (1, 1);
		rectangle = new Rectangle(esqInfIzq, 10, 8);
	}
		
	@Test
	public void testArea() {
		int amount = rectangle.area();
		assertEquals(amount, 80);
	}
	
	@Test
	public void testPerimetro() {
		int amount = rectangle.perimetro();
		assertEquals(amount, 36);
		
	}
	
	@Test
	public void testConstructor() {
		Point esqInfIzq = rectangle.getEsquinaInferiorIzquierda();
		assertEquals(esqInfIzq.getX(), 1);
		assertEquals(esqInfIzq.getY(), 1);
		assertEquals(rectangle.getBase(), 10);
		assertEquals(rectangle.getAltura(), 8);
	}

}
