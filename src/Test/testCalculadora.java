package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import pkg.Calcuradora;

class testCalculadora {

	@Test
	void testSuma() {
		assertEquals(5, Calcuradora.suma(2,3));
	}
	@Test
	void testResta() {
		assertEquals(5, Calcuradora.resta(2,3));

	}
	@Test
	void testMultiplica() {
		assertEquals(5, Calcuradora.multiplica(2,3));

	}
	@Test
	void testDivide() {
		assertEquals(5, Calcuradora.divide(2,3));

	}

}
