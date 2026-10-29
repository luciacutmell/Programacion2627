package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje15_mesDelAnio {

	public static void main(String[] args) {
//		Realiza un programa que pida un número entero entre uno y doce e imprima el número de días 
//		que tiene el mes correspondiente. 

		Scanner entrada= new Scanner(System.in);
		
		int opcion;
		
		System.out.println("Introduce un número del 1-12 y te diré a que mes pertenece");
		opcion=entrada.nextInt();
				
		switch(opcion) {
		case 1: 
			System.out.println("Elegiste el 1 equivale a Enero");
			break;
			
		case 2:
			System.out.println("Elegiste la opción 2 equivale a Febrero");
			break;
			
		case 3:
			System.out.println("Elegiste la opción 3 equivale a Marzo");
			break;
			
		case 4:
			System.out.println("Elegiste la opción 4 equivale a Abril");
			break;
			
		case 5:
			System.out.println("Elegiste la opción 5 equivale a Mayo");
			break;	
		
		case 6:
			System.out.println("Elegiste la opción 6 equivale a Junio");
			break;
		
		case 7:
			System.out.println("Elegiste la opción 7 equivale a Julio");
			break;
			
		case 8:
			System.out.println("Elegiste la opción 8 equivale a Agosto");
			break;
		
		case 9:
			System.out.println("Elegiste la opción 9 equivale a Septiembre");
			break;
		
		case 10:
			System.out.println("Elegiste la opción 10 equivale a Octubre");
			break;
		
		case 11:
			System.out.println("Elegiste la opción 11 equivale a Noviembre");
			break;
		
		case 12:
			System.out.println("Elegiste la opción 12 equivale a Diciembre");
			break;
		
		default:
			System.out.println("Has introducido un número erróneo");
		}
		
		
		entrada.close();
		
	}

}
