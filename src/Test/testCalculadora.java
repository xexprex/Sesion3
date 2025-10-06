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
		assertEquals(1, Calcuradora.resta(4,3));

	}
	@Test
	void testMultiplica() {
		assertEquals(6, Calcuradora.multiplica(2,3));

	}
	@Test
	void testDivide() {
		assertEquals(2, Calcuradora.divide(6,3));

	}

}
