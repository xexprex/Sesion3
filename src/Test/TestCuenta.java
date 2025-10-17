package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class TestCuenta {

	private static Cuenta cuenta1;
	private static Cuenta cuenta2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		cuenta1 = new Cuenta(0,"12345");
		cuenta2 = new Cuenta(0,"67890");
	}
	
	@BeforeEach
	void setUp() throws Exception{
		cuenta1.setSaldo(50.0);
		cuenta2.setSaldo(0.0);
	}
	
	
	//Sesión 3. Práctica TDD, JUnit y Git
	/*
	@Test
	void Reintegro200Cuenta1() {
		cuenta1.retirar(200.0);
		assertEquals(-150, cuenta1.getSaldo());
	}
	
	@Test
	void Reintegro350Cuenta2() {
		cuenta2.retirar(350.0);
		assertEquals(-350, cuenta2.getSaldo());
	}
	
	@Test
	void Ingreso100Cuenta1() {
		cuenta1.ingresar(100.0);
		assertEquals(-50, cuenta1.getSaldo());
	}
	
	@Test
	void Reintegro200Cuenta2() {
		cuenta2.retirar(200.0);
		assertEquals(-350, cuenta2.getSaldo());
	}
	
	@Test
	void Reintegro150Cuenta2() {
		cuenta2.retirar(150.0);
		assertEquals(-500, cuenta2.getSaldo());
	}
	
	@Test
	void Reintegro200Cuenta12() {
		cuenta1.retirar(200.0);
		assertEquals(-250, cuenta1.getSaldo());
	}
	
	@Test
	void Ingreso50Cuenta2() {
		cuenta1.ingresar(50.0);
		assertEquals(-450, cuenta2.getSaldo());
	}
	
	@Test
	void Reintegro100Cuenta2() {
		cuenta1.ingresar(100.0);
		assertEquals(-450, cuenta2.getSaldo());
	}
	*/
	
	@Test
	void tests() {
		cuenta1.retirar(200.0);
		assertEquals(-150, cuenta1.getSaldo());
	

		cuenta2.retirar(350.0);
		assertEquals(-350, cuenta2.getSaldo());
	
	
	
		cuenta1.ingresar(100.0);
		assertEquals(-50, cuenta1.getSaldo());
	
	

		cuenta2.retirar(200.0);
		assertEquals(-350, cuenta2.getSaldo());
	
	
		cuenta2.retirar(150.0);
		assertEquals(-500, cuenta2.getSaldo());
	
	

		cuenta1.retirar(200.0);
		assertEquals(-250, cuenta1.getSaldo());
	
	
		cuenta2.ingresar(50.0);
		assertEquals(-450, cuenta2.getSaldo());
	

		cuenta2.retirar(100.0);
		assertEquals(-450, cuenta2.getSaldo());
	}
}
