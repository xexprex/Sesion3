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
	
	//Version 4 Pruebas
	
	//Descripcion
    
	
	
	//Inicializacion
    @Test
    void testCuenta1() {
        cuenta.setNumero("12345");
        cuenta.setTitular("Pepe");
        cuenta.setSaldo(100.0);

        assertEquals("12345", cuenta.getNumero());
        assertEquals("Pepe", cuenta.getTitular());
        assertEquals(100.0, cuenta.getSaldo());
    }
	
    @Test
    void testCuenta2() {
        cuenta.setNumero("67890");
        cuenta.setTitular("Juan");
        cuenta.setSaldo(0.0);

        assertEquals("67890", cuenta.getNumero());
        assertEquals("Juan", cuenta.getTitular());
        assertEquals(0.0, cuenta.getSaldo());
    }
	

}
