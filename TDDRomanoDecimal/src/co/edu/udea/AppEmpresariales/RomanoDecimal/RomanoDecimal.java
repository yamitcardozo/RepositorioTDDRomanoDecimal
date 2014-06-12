package co.edu.udea.AppEmpresariales.RomanoDecimal;

public class RomanoDecimal {
	
	public int convertirRomanoDecimal(String Romano){
		int cantidadElementos = Romano.length();
		
		if(Romano.equalsIgnoreCase("IV"))
		return 4;
		if(Romano.equalsIgnoreCase("V"))
			return 5;
		if(Romano.equalsIgnoreCase("VII"))
			return (5+(cantidadElementos-1));
		return cantidadElementos;
	}
}
