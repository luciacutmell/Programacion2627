package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej5_edad {

	public static void main(String[] args) {
		// Escribe un programa que pide la edad por teclado y nos muestra el mensaje de “eres mayor de edad” 
		// o el mensaje de “eres menor de edad”. 

		int edad;
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Dime tu edad");
		edad=entrada.nextInt();
		
		if(edad>=18) {
			System.out.println("Eres mayor de edad");
		}else
			System.out.println("Eres menor de edad");
		
		
		entrada.close();
	}

}
