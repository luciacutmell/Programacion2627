package ud4.ArraysListado3;

import java.util.Scanner;

public class Ej7_capicua {

	public static void main(String[] args) {

// Pide 10 enteros y comprueba si el array es capicúa comparando los elementos

// de los extremos hacia el centro. Un array es capicúa cuando se lee igual

// delante a detrás que de detrás a delante

		Scanner entrada = new Scanner(System.in);

		int num[] = new int[10];

		for (int i = 0; i < num.length; i++) {

			System.out.println("ingresa un num: ");

			num[i] = entrada.nextInt();

		}

		for (int i = 0; i < num.length; i++) {

			System.out.print(" " + num[i] + " ");

		}

		if (num[0] == num[num.length - 1] && num[1] == num[num.length - 2]) {

			System.out.println("Es capicua");

		} else {

			System.out.println("No es capicua");

		}

		entrada.close();

	}

}