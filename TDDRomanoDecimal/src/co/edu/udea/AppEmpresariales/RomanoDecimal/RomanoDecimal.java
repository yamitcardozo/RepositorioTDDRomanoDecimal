package co.edu.udea.AppEmpresariales.RomanoDecimal;

public class RomanoDecimal {
	
	public int convertirRomanoDecimal(String Romano){
		
		int cantidadElementos;
		int numeroDecimal = 0;
		String concatenar;
		String caracter;
		
		while(true){
			
		if(Romano.equalsIgnoreCase("I")){
			numeroDecimal = numeroDecimal+1;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("IV")){
			numeroDecimal = numeroDecimal+4;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("V")){
			numeroDecimal = numeroDecimal+5;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("IX")){
			numeroDecimal = numeroDecimal+9;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("X")){
			numeroDecimal = numeroDecimal+10;
			return numeroDecimal;
		}
		else if(Romano.equalsIgnoreCase("XL")){
			numeroDecimal = numeroDecimal+40;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("L")){
			numeroDecimal = numeroDecimal+50;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("XC")){
			numeroDecimal = numeroDecimal+90;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("C")){
			numeroDecimal = numeroDecimal+100;
			return numeroDecimal;
		}
		
		cantidadElementos = Romano.length();
		concatenar="";
		caracter="";
		for(int i=0;i<cantidadElementos;i++){
			if(i==0 || i==1){
			caracter = caracter+Romano.charAt(i);
			continue;
			}
			concatenar = concatenar+Romano.charAt(i);
		}
		
		if(caracter.equalsIgnoreCase("XL")){
			numeroDecimal = numeroDecimal+40;
			Romano = concatenar;
			continue;
		}else if(caracter.equalsIgnoreCase("XC")){
			numeroDecimal = numeroDecimal+90;
			Romano = concatenar;
			continue;
		}
		
		cantidadElementos = Romano.length();
		concatenar="";
		caracter="";
		for(int i=0;i<cantidadElementos;i++){
			if(i==0){
			caracter = caracter+Romano.charAt(i);
			continue;
			}
			concatenar = concatenar+Romano.charAt(i);
		}
		Romano = caracter;
		
		if(Romano.equalsIgnoreCase("I")){
			numeroDecimal = numeroDecimal+1;
		}else if(Romano.equalsIgnoreCase("V")){
			numeroDecimal = numeroDecimal+5;
		}else if(Romano.equalsIgnoreCase("X")){
			numeroDecimal = numeroDecimal+10;
		}else if(Romano.equalsIgnoreCase("L")){
			numeroDecimal = numeroDecimal+50;
		}
		Romano = concatenar;
		}
		
	}
}
