package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {

private Point point;
	
	@BeforeEach
	public void setUp() throws Exception {
		point = new Point(2,3);
	}

	@Test
	public void testSumarCon() {
		Point otroPunto = new Point(3,2);
		point.sumarCon(otroPunto);
		assertEquals(5, point.getX());
		assertEquals(5, point.getY());
	}
	
	public void testMoverA() {
		point.moverA(6, 8);
		assertEquals(6, point.getX());
		assertEquals(8, point.getY());
	}
	
	public void testCreatePoint() {
		Point unPunto = new Point();
		assertEquals(0, unPunto.getX());
		assertEquals(0, unPunto.getY());
	}
	
	public void testCreatePointAt() {
		Point unPunto = new Point(2, 1);
		assertEquals(2, unPunto.getX());
		assertEquals(1, unPunto.getY());
	}
}
