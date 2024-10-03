package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {

	Empleado empleado = new Empleado();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Before All");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("After All");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("After Each");
	}

	@Test
	void testCalculoNominaBrutaV1600E() { //vendedor, >=1500 en ventas y 10 Horas extra
		
		float expected = 2500f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1600, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaV1600() { //vendedor, >=1500 en ventas y No Horas extra
		
		float expected = 2200f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1600, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaV1100E() { //vendedor, >=1000 en ventas y 10 Horas extra
		
		float expected = 2400f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1100, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaV1100() { //vendedor, >=1000 en ventas y no Horas extra
		
		float expected = 2100f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 1100, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaV500E() { //vendedor, <1000 en ventas y 10 Horas extra
		
		float expected = 2300f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 500, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaV500() { //vendedor, <1000 en ventas y no Horas extra
		
		float expected = 2000f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Vendedor, 500, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaE1600E() { //encargado, >=1500 en ventas y 10 Horas extra
		
		float expected = 3000f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1600, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaE1600() { //encargado, >=1500 en ventas y No Horas extra
		
		float expected = 2700f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1600, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaE1100E() { //encargado, >=1000 en ventas y 10 Horas extra
		
		float expected = 2900f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1100, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaE1100() { //encargado, >=1000 en ventas y no Horas extra
		
		float expected = 2600f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 1100, 0);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaE500E() { //encargado, <1000 en ventas y 10 Horas extra
		
		float expected = 2800f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 500, 10);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaBrutaE500() { //encargado, <1000 en ventas y no Horas extra
		
		float expected = 2500f;
		float actual = Empleado.calculoNominaBruta(TipoEmpleado.Encargado, 500, 0);
		assertEquals(expected, actual);
	}

	@Test
	void testCalculoNominaNeta2600() { //>=2500

		float expected = 2132f;
		float actual = Empleado.calculoNominaNeta(2600);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta2100() { //>=2100

		float expected = 1785f;
		float actual = Empleado.calculoNominaNeta(2100);
		assertEquals(expected, actual);
	}
	
	@Test
	void testCalculoNominaNeta1500() { //<2100

		float expected = 1500f;
		float actual = Empleado.calculoNominaNeta(1500);
		assertEquals(expected, actual);
	}
}
