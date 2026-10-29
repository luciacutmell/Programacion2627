package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje16_dadoCaras {

	public static void main(String[] args) {
//		 Realiza un programa que pida por teclado el resultado (dato entero) 
//		 obtenido al lanzar un dado de seis caras y muestre por pantalla el
//		 número en letras (dato cadena) 
//		 de la cara opuesta al resultado obtenido. 
//		 En las caras opuestas de un dado de seis caras están los números:
//	     1-6, 2-5 y 3-4. Si el número del dado introducido es menor que 1 o mayor que 6, 
//	     se mostrará el mensaje: “ERROR: número incorrecto”. 
	
	Scanner entrada=new Scanner(System.in);
	
	int resultado;
	String numero;
	
	System.out.println("Pasame por teclado el número que te salió al lanzar un dado");
	resultado=entrada.nextInt();
	
	switch(resultado) {
	case 1: 
		System.out.println("seis");
		break;
		
	case 2:
		System.out.println("cinco");
		break;
		
	case 3:
		System.out.println("cuatro");
		break;
		
	case 4:
		System.out.println("tres");
		break;
		
	case 5:
		System.out.println("dos");
		break;	
	
	case 6:
		System.out.println("uno");
		break;
	
	default:
		System.out.println("Error");
		
	}
	
	
	
	
	
	
	entrada.close();
	}

}
