package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje14_diaSemana {

	public static void main(String[] args) {
//		 Realiza un programa que pida el día de la semana (del 1 al 7) 
//		 y escriba el día correspondiente. Si introducimos otro número nos da un error. 

		Scanner entrada= new Scanner(System.in);
		
		int opcion;
		
		System.out.println("Introduce un número del 1-7 y te diré a que día pertenece");
		opcion=entrada.nextInt();
				
		switch(opcion) {
		case 1: 
			System.out.println("Elegiste el 1 equivale a Lunes");
			break;
			
		case 2:
			System.out.println("Elegiste la opción 2 equivale a Martes");
			break;
			
		case 3:
			System.out.println("Elegiste la opción 3 equivale a Miércoles");
			break;
			
		case 4:
			System.out.println("Elegiste la opción 4 equivale a Jueves");
			break;
			
		case 5:
			System.out.println("Elegiste la opción 5 equivale a Viernes");
			break;	
		
		case 6:
			System.out.println("Elegiste la opción 6 equivale a Sábado");
			break;
		
		case 7:
			System.out.println("Elegiste la opción 7 equivale a Domingo");
			break;
		
		default:
			System.out.println("Has introducido un número erróneo");
		}
		
		
		entrada.close();
	}

}
