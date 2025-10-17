package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class TestCuenta {

	private static Cuenta cuenta;
	private static Cuenta cuenta1;
	private static Cuenta cuenta2;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		cuenta = new Cuenta(0.0);
		cuenta1 = new Cuenta(0.0);
		cuenta2 = new Cuenta(0.0);
	}
	
	@BeforeEach
	void setUp() throws Exception{
		cuenta.setSaldo(0.0);
		cuenta1.setSaldo(0.0);
		cuenta1.setSaldo(0.0);
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
        cuenta1.setNumero("12345");
        cuenta1.setTitular("Pepe");
        cuenta1.setSaldo(50.0);

        assertEquals("12345", cuenta1.getNumero());
        assertEquals("Pepe", cuenta1.getTitular());
        assertEquals(50.0, cuenta1.getSaldo());
    }
	
    @Test
    void testCuenta2() {
        cuenta2.setNumero("67890");
        cuenta2.setTitular("Juan");
        cuenta2.setSaldo(0.0);

        assertEquals("67890", cuenta2.getNumero());
        assertEquals("Juan", cuenta2.getTitular());
        assertEquals(0.0, cuenta2.getSaldo());
    }
	
    //Instrucciones para cuenta 1
    
    @Test
    void testRetirarCuenta1() {
        cuenta1.retirar(200.0);
        assertEquals(-200.0, cuenta1.getSaldo());
    }
    
    @Test
    void testIngresarCuenta1() {
        cuenta1.ingresar(100.0);
        assertEquals(100.0, cuenta1.getSaldo());
    }

    @Test
    void testRetirar2Cuenta1() {
        cuenta1.retirar(200.0);
        assertEquals(-200.0, cuenta1.getSaldo());
    }

}
