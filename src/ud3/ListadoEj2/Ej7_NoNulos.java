package ud3.ListadoEj2;

import java.util.Scanner;

public class Ej7_NoNulos {

	public static void main(String[] args) {
		// Realiza un programa que lea 10 números no nulos y luego muestre un mensaje
		// indicando cuántos son positivos y cuantos negativos.

		int num, positivo = 0, negativo = 0;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {
			System.out.println("Indica el valor");
			num = entrada.nextInt();

			if (num < 0) {
				negativo++;
			} else if (num > 0) {
				positivo++;
			} else {
				i = i-1;
			}
		}
		System.out.println("Positivos: "+positivo+" y Negativos: "+negativo);
entrada.close();
	}
}