package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej1_areaCuadrado {
//	Escribe un programa que calcule y muestre el área de un cuadrado cuyo valor del lado se 
//	pedirá al usuario por teclado. 
	
	public static void main(String[] args) {
		
		int perimetro=0, area=0;
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("¿Cuánto mide tu cuadrado? ");
		perimetro=entrada.nextInt();
		area=perimetro*perimetro;
		System.out.println("El valor del área del cuadrado es: "+area);
		
		
		
		
		
		entrada.close();
	}
}
