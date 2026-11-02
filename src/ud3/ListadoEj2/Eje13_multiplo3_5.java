package ud3.ListadoEj2;

import java.util.Scanner;

public class Eje13_multiplo3_5 {

	public static void main(String[] args) {

//		Escribe un programa que muestre por consola los números de 1 a 100 
//		(ambos incluidos y con un salto de línea entre cada impresión), 
//		sustituyendo los siguientes:
//			 Múltiplos de 3 por la palabra "fizz". 
//			 Múltiplos de 5 por la palabra "buzz". 
//			 Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz". 

		Scanner entrada = new Scanner(System.in);
		int numero;

		for (int i = 0; i < 10; i++) {
			System.out.println(numero = (int) (1 + Math.random() * (100 - 1 + 1)));
			if (numero % 3 == 0) {
				System.out.println("fizz");
			} else if (numero % 5 == 0) {
				System.out.println("buzz");
			} else if (numero % 3 == 0 && numero % 5 == 0) {
				System.out.println("fizzbuzz");
			} else {
				System.out.println("No es multiplo ni de 3 ni de 5");
			}
		}

		entrada.close();
	}
}
