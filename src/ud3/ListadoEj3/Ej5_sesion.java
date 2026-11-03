package ud3.ListadoEj3;

import java.util.Scanner;

public class Ej5_sesion {

	public static void main(String[] args) {
//		Crea un programa en Java que muestre en pantalla un menú con las siguientes opciones:
//			--- MENÚ PRINCIPAL --- 
//			1. Iniciar sesión 
//			2. Registrarse 
//			3. Recuperar contraseña 
//			4. Salir El programa debe: 
//				 Pedir al usuario que introduzca un número correspondiente a una opción 
//				del menú. 
//				 Usa un switch para mostrar un mensaje en función de la opción 
//				elegida: i. Si elige 1, mostrar: "Has elegido Iniciar sesión".
//				ii. iii. Si elige 2, mostrar: "Has elegido Registrarse". 
//				Si elige 3, mostrar: "Has elegido Recuperar contraseña". 
//				iv. Si elige 4, mostrar: "Saliendo del programa...". 
//				v. Si introduce un número que no está entre 1 y 4, 
//				mostrar: "Opción no válida". 

		Scanner entrada=new Scanner(System.in);
		int opcion=4;
		
		
		
		System.out.println("--- MENÚ PRINCIPAL ---");
		System.out.println("1. Iniciar sesión");
		System.out.println("2. Registrarse");
		System.out.println("3. Recuperar contraseña");
		System.out.println("4. Salir");
		
		System.out.print("Escoge la opción: ");
		opcion=entrada.nextInt();
		
		
		switch(opcion) {
		case 1:
			System.out.println("Has elegido iniciar sesión");
		break;
		
		case 2:
			System.out.println("Has elegido registrarte");
		break;
		
		case 3:
			System.out.println("Has elegido Recuperar contraseña");
		break;
		
		case 4:
			System.out.println("Saliendo del programa");
		break;
		
		default:
			System.out.println("Opción no válida");
		}
		
		
		entrada.close();
	}

}
