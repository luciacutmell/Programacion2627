package ud4.ArraysListado3;

import java.util.Scanner;

public class Ej6_comp1yUltimo {

	public static void main(String[] args) {

		// Pide 10 enteros y comprueba si el primero y el último son iguales.

		boolean igual = true;

		int numeros[] = new int[10];

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {

			System.out.print("Indica el número:");

			numeros[i] = entrada.nextInt();

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.print(" " + numeros[i] + " ");

		}

		if (numeros[0] != numeros[numeros.length - 1]) {

			igual = false;

		} else {

			igual = true;

		}

		if (igual) {

			System.out.println("Son iguales");

		} else {

			System.out.println("No son iguales");

		}

// if(numeros[0] == numeros[9]) {

// System.out.println("Son iguales");

// }else {

// System.out.println("No son iguales");

// }

		entrada.close();

	}

}