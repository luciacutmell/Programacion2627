package ud2;

import java.util.Scanner;

// Un número primo es aquel mayor que 1 que solo es divisible exactamente por 1 y por sí mismo.
// Escribe un algoritmo en lenguaje natural que determine si un número entero positivo 
// introducido por el usuario es Primo o Compuesto.

public class Ej3_numPrimo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num, num1 = 0 ;

		System.out.println("Indicame un número");
		num = entrada.nextInt();

		// num1 != num
		if (num1 != num) {

			if (num % num1 == 0) {
				System.out.println("Es un número compuesto");
			} else {
				System.out.println("Es un número primo");

			}
		}
	}
}
