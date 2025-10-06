package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class TestCuenta {

	private static Cuenta cuenta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		cuenta = new Cuenta(0.0);
	}
	
	@BeforeEach
	void setUp() throws Exception{
		cuenta.setSaldo(0.0);
	}
	
	
	@Test
	void testIngresar() {
		cuenta.ingresar(200.0);
		assertEquals(200, cuenta.getSaldo());
	}
	
	@Test
	void testRetirar() {
		cuenta.retirar(200.0);
		assertEquals(-200, cuenta.getSaldo());
	}
	
	
	

}
