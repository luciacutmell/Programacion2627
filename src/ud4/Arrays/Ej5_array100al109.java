package ud4.Arrays;

public class Ej5_array100al109 {

	public static void main(String[] args) {
		// Crea un array de 10 enteros y rellénalo con los números del 100 al 109.

		int numeros[] = new int[10];

		// inicializamos array valores
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = i + 100;
		}

		// mostramos los valors
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}

	}

}
