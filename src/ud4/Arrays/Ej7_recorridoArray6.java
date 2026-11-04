package ud4.Arrays;

import java.util.Scanner;

public class Ej7_recorridoArray6 {

	public static void main(String[] args) {
		// Recorre un array de 6 enteros y muestra tanto el índice como el valor
		// guardado en cada posición.

		Scanner entrada = new Scanner(System.in);
		int numeros[] = new int[6];

		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Dime el num: ");
			numeros[i] = entrada.nextInt();
		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i] + " en la posición: " + i);
		}

		entrada.close();

	}

}
