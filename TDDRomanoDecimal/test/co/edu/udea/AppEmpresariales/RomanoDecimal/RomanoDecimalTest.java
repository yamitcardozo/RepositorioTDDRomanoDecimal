/*De forma individual entregar la URL del repositorio para un nuevo algoritmo, 
usando TDD, en el cual conviertan de número romano a decimal.*/

package co.edu.udea.AppEmpresariales.RomanoDecimal;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanoDecimalTest {

	private RomanoDecimal rd;
	
	@Before
	public void setUp() throws Exception {
		rd = new RomanoDecimal();
	}

	/*convertir I en 1*/
	@Test
	public void convertirI() {
		
		int numeroConvertido = rd.convertirRomanoDecimal("I");
		Assert.assertEquals(1, numeroConvertido);
	}
	/*convertir II en 2*/
	@Test
	public void convertirII() {
		int numeroConvertido = rd.convertirRomanoDecimal("II");
		Assert.assertEquals(2, numeroConvertido);
	}
	/*convertir IV en 4*/
	@Test
	public void convertirIV() {
		int numeroConvertido = rd.convertirRomanoDecimal("IV");
		Assert.assertEquals(4, numeroConvertido);
	}
	/*convertir V en 5*/
	@Test
	public void convertirV() {
		int numeroConvertido = rd.convertirRomanoDecimal("V");
		Assert.assertEquals(5, numeroConvertido);
	}
	/*convertir VII en 7*/
	@Test
	public void convertirVI() {
		int numeroConvertido = rd.convertirRomanoDecimal("VII");
		Assert.assertEquals(7, numeroConvertido);
	}
}
