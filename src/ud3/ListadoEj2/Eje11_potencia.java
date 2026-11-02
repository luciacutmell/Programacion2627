package ud3.ListadoEj2;

import java.util.Scanner;

public class Eje11_potencia {

	public static void main(String[] args) {
		
//		Realiza un programa que calcule el valor A elevado a B (A^B) 
//		sin hacer uso del operador de potencia (^), 
//		siendo A y B valores introducidos por teclado, 
//		y luego muestre el resultado por pantalla. 
		
		Scanner entrada = new Scanner(System.in);
		int base, potencia, resultado=1;
		
		System.out.println("Indicame el número de la base");
		base=entrada.nextInt();
		
		System.out.println("Indicame el número de la potencia");
		potencia=entrada.nextInt();
		
		for(int i=0;i<potencia;i++) {
			resultado=resultado*base;
		}
		System.out.println("El resultado es: "+resultado);
		
		
		entrada.close();
	}
}
