package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje10_potencia {
	public static void main(String[] args) {

//	10.Realiza un programa que calcule la potencia de un número, dado este y su
//	exponente. Pueden ocurrir tres casos:
//	 El exponente sea positivo: imprime resultado en pantalla.
//	 El exponente sea 0, el resultado es 1.
//	 El exponente sea negativo, el resultado es 1/potencia con el exponente
//	positivo.

		Scanner entrada = new Scanner(System.in);

		double base, exponente, potencia = 1;

		System.out.println("-- Calculando la potencia de un número --");
		System.out.println();
		System.out.println("Indica la base");
		base = entrada.nextDouble();
		System.out.println("Indica el exponente");
		exponente = entrada.nextDouble();

		// EXPONENTE ES 0
		if (exponente == 0) {

			
		// EXPONENTE NEGATIVO
		} else if (exponente < 0) {
			exponente = exponente * (-1);
			for (int i = 0; i < exponente; i++) {
				potencia = potencia * base;
			}
			potencia=1/potencia;


		// EXPONENTE POSITIVO
		} else {
			for (int i = 0; i < exponente; i++) {
				potencia = potencia * base;
			}
		}
		System.out.println("El resultade de la potencia es: " + potencia);
		entrada.close();
	}

}
