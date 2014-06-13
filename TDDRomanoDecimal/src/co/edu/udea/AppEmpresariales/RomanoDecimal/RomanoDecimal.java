/*De forma individual entregar la URL del repositorio para un nuevo algoritmo, 
usando TDD, en el cual conviertan de número romano a decimal.*/

package co.edu.udea.AppEmpresariales.RomanoDecimal;

public class RomanoDecimal {
	
	/*metodo transformacion numero romano a decimal desde el 1 hasta el 3999*/
	public int convertirRomanoDecimal(String Romano){
		
		int cantidadElementos;
		int numeroDecimal = 0;
		String concatenar;
		String caracter;
		
		while(true){
			//verificamos numeros romanos base
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
		}else if(Romano.equalsIgnoreCase("CD")){
			numeroDecimal = numeroDecimal+400;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("D")){
			numeroDecimal = numeroDecimal+500;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("CM")){
			numeroDecimal = numeroDecimal+900;
			return numeroDecimal;
		}else if(Romano.equalsIgnoreCase("M")){
			numeroDecimal = numeroDecimal+1000;
			return numeroDecimal;
		}
		
		// verificar numero romano dos digitos
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
		}else if(caracter.equalsIgnoreCase("CD")){
			numeroDecimal = numeroDecimal+400;
			Romano = concatenar;
			continue;
		}else if(caracter.equalsIgnoreCase("CM")){
			numeroDecimal = numeroDecimal+900;
			Romano = concatenar;
			continue;
		}
		
		//verificar numeros romanos un digito
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
		}else if(Romano.equalsIgnoreCase("C")){
			numeroDecimal = numeroDecimal+100;
		}else if(Romano.equalsIgnoreCase("D")){
			numeroDecimal = numeroDecimal+500;
		}else if(Romano.equalsIgnoreCase("M")){
			numeroDecimal = numeroDecimal+1000;
		}
		Romano = concatenar;
		}
		
	}
}
