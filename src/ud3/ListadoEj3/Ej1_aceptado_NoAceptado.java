package ud3.ListadoEj3;

import java.util.Scanner;

public class Ej1_aceptado_NoAceptado {

	public static void main(String[] args) {
//		Crea un programa que pida dos números ‘nota’ y ‘edad’ y un carácter ‘género’. 
//		Si la nota es mayor o igual a 5 y la edad es mayor o igual a 18 mostrará "ACEPTADA" 
//		si el género es  "F" o "ACEPTADO" si el género es "M", 
//		si no se cumplen estas condiciones, se mostrará "NO ACEPTADO/A". 

		Scanner entrada=new Scanner(System.in);
		int nota, edad;
		String genero;
		
		System.out.println("Dame la nota:");
		nota=entrada.nextInt();
		
		System.out.println("Dame la edad:");
		edad=entrada.nextInt();
		
		System.out.println("Dime el género, solo puede ser F o M");
		genero=entrada.next();
		
		if(nota>=5 && edad>=18) {
			if(genero=="F") {
				System.out.println("Estás ACEPTADO");
			}else {
				System.out.println("Estás ACEPTADA");
			}
		}else {
			if(genero=="F") {
				System.out.println("NO Estás ACEPTADO");
			}else {
				System.out.println("NO Estás ACEPTADA");
			}
		}
		
		
		
		
		
		
	
		
		
		entrada.close();
	}

}
