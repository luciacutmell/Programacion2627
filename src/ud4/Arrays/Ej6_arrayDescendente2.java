package ud4.Arrays;

public class Ej6_arrayDescendente2 {

	public static void main(String[] args) {
		//Crea un array de 10 enteros y rellénalo con los números del 10 al 1, en orden descendente. 

		
		int numeros[] = new int[10];

		// inicializamos array valores
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = numeros.length-i;
			
		}


		// mostramos array valores
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);

		}

	}

}
