package ud4.Arrays;

public class Eje10_arraysDerechReves {

	public static void main(String[] args) {
		// Dado un array ya inicializado, muestra sus elementos en orden normal
		// y después en orden inverso.

		int numeros[] = new int[] { 2, 4, 5 };

		// muestro el array
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

		System.out.println();

		// muestro el array al reves
		for (int i = numeros.length - 1; i >= 0; i--) {
			System.out.println(numeros[i]);
		}
	}

}
