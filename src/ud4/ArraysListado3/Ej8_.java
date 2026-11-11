package ud4.ArraysListado3;

import java.util.Scanner;

public class Ej8_ {

	public static void main(String[] args) {

// Crea un array aleatorio de 20 enteros entre 1 y 10 y muestra qué valores
// distintos aparecen y cuántas veces aparece cada uno.

		Scanner entrada = new Scanner(System.in);

		int numeros[] = new int[10];

		int num1, cont1 = 0;

		for (int i = 0; i < numeros.length; i++) {

			numeros[i] = (int) (1 + Math.random() * (10 - 1 + 1));

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.print(" " + numeros[i] + " ");

		}

		for (int i = 0; i < numeros.length; i++) {

			for (int j = 0; i < numeros.length; i++) {

			}

		}

// if (numeros[0] == numeros[1]) {

// num1 = numeros[0];

// cont1++;

		entrada.close();

	}

}
