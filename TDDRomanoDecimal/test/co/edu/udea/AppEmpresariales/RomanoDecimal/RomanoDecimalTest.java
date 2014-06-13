package co.edu.udea.AppEmpresariales.RomanoDecimal;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RomanoDecimalTest {

	private RomanoDecimal rd;
	private int numeroConvertido;
	
	@Before
	public void setUp() throws Exception {
		rd = new RomanoDecimal();
		
	}

	/*convertir I en 1*/
	@Test
	public void convertirI() {
		numeroConvertido = rd.convertirRomanoDecimal("I");
		Assert.assertEquals(1, numeroConvertido);
	}
	/*convertir II en 2*/
	@Test
	public void convertirII() {
		numeroConvertido = rd.convertirRomanoDecimal("II");
		Assert.assertEquals(2, numeroConvertido);
	}
	/*convertir IV en 4*/
	@Test
	public void convertirIV() {
		numeroConvertido = rd.convertirRomanoDecimal("IV");
		Assert.assertEquals(4, numeroConvertido);
	}
	/*convertir V en 5*/
	@Test
	public void convertirV() {
		numeroConvertido = rd.convertirRomanoDecimal("V");
		Assert.assertEquals(5, numeroConvertido);
	}
	/*convertir VII en 7*/
	@Test
	public void convertirVI() {
		numeroConvertido = rd.convertirRomanoDecimal("VII");
		Assert.assertEquals(7, numeroConvertido);
	}
	/*convertir XIII en 13*/
	@Test
	public void convertirXIII() {
		numeroConvertido = rd.convertirRomanoDecimal("XIII");
		Assert.assertEquals(13, numeroConvertido);
	}
	/*convertir XXXXIV en 34*/
	@Test
	public void convertirXXXIV() {
		numeroConvertido = rd.convertirRomanoDecimal("XXXIV");
		Assert.assertEquals(34, numeroConvertido);
	}
	/*convertir XL en 40*/
	@Test
	public void convertirXL() {
		numeroConvertido = rd.convertirRomanoDecimal("XL");
		Assert.assertEquals(40, numeroConvertido);
	}
	/*convertir XLVI en 46*/
	@Test
	public void convertirXLVI() {
		numeroConvertido = rd.convertirRomanoDecimal("XLVI");
		Assert.assertEquals(46, numeroConvertido);
	}
	/*convertir L en 50*/
	@Test
	public void convertirL() {
		numeroConvertido = rd.convertirRomanoDecimal("L");
		Assert.assertEquals(50, numeroConvertido);
	}
	/*convertir LXXXIX en 89*/
	@Test
	public void convertirLXXXIX() {
		numeroConvertido = rd.convertirRomanoDecimal("LXXXIX");
		Assert.assertEquals(89, numeroConvertido);
	}
	/*convertir XC en 90*/
	@Test
	public void convertirXC() {
		numeroConvertido = rd.convertirRomanoDecimal("XC");
		Assert.assertEquals(90, numeroConvertido);
	}
	/*convertir XCVIII en 98*/
	@Test
	public void convertirXCVIII() {
		numeroConvertido = rd.convertirRomanoDecimal("XCVIII");
		Assert.assertEquals(98, numeroConvertido);
	}
	/*convertir C en 100*/
	@Test
	public void convertirC() {
		numeroConvertido = rd.convertirRomanoDecimal("C");
		Assert.assertEquals(100, numeroConvertido);
	}
	/*convertir CCCX en 310*/
	@Test
	public void convertirCCCX() {
		numeroConvertido = rd.convertirRomanoDecimal("CCCX");
		Assert.assertEquals(310, numeroConvertido);
	}
	/*convertir CD en 400*/
	@Test
	public void convertirCD() {
		numeroConvertido = rd.convertirRomanoDecimal("CD");
		Assert.assertEquals(400, numeroConvertido);
	}
	/*convertir CDLXVII en 467*/
	@Test
	public void convertirCDLXVII() {
		numeroConvertido = rd.convertirRomanoDecimal("CDLXVII");
		Assert.assertEquals(467, numeroConvertido);
	}
	/*convertir D en 500*/
	@Test
	public void convertirD() {
		numeroConvertido = rd.convertirRomanoDecimal("D");
		Assert.assertEquals(500, numeroConvertido);
	}
	/*convertir CM en 900*/
	@Test
	public void convertirCM() {
		numeroConvertido = rd.convertirRomanoDecimal("CM");
		Assert.assertEquals(900, numeroConvertido);
	}/*convertir DCCCXCVIII en 898*/
	@Test
	public void convertirDCCCXCVIII() {
		numeroConvertido = rd.convertirRomanoDecimal("DCCCXCVIII");
		Assert.assertEquals(898, numeroConvertido);
	}
	/*convertir M en 1000*/
	@Test
	public void convertirM() {
		numeroConvertido = rd.convertirRomanoDecimal("M");
		Assert.assertEquals(1000, numeroConvertido);
	}
	/*convertir MMMCMXXXVIII en 3938*/
	@Test
	public void convertirMMMCMXXXVIII() {
		numeroConvertido = rd.convertirRomanoDecimal("MMMCMXXXVIII");
		Assert.assertEquals(3938, numeroConvertido);
	}
}
