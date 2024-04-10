package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



public class CounterTestCase {
	
	private Counter counter;
	
@BeforeEach
	public void setUp() throws Exception {
		counter = new Counter();

		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}

	@Test
	public void testEvenNumbers() {
		int amount = counter.cantDeImpares();
		assertEquals(amount, 9);
	}
	
	public void testOddNumbers() {
		int amount = counter.cantDePares();
		assertEquals(amount, 1); 
	}
	
	public void testMultiplos() {
		int amount = counter.cantDeMultiplosDe(2);
		assertEquals(amount, 1);
		
	}
	
	public void testNumeroConMayorCantidadDePares() {
		counter.addNumber(123);
		counter.addNumber(222);
		counter.addNumber(6);
		counter.addNumber(10);
		int amount = counter.numConMayorCantDeParesDe();
		assertEquals(amount, 222);
	}
	
	public void testMayorMultiploEntre(){
		int amount1 = counter.mayorMultiploEntre_y_(9, 3);
		int amount2 = counter.mayorMultiploEntre_y_(8, 0);
		assertEquals(amount1, 999);
		assertEquals(amount2, 0);
	}
}
