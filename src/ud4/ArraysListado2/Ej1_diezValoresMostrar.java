package ud4.ArraysListado2;

import java.util.Scanner;

public class Ej1_diezValoresMostrar {

	public static void main(String[] args) {
		// Crea un programa que pida diez números reales por teclado, los almacene en
		// un array, y luego muestre todos sus valores

		Scanner entrada = new Scanner(System.in);

		int valores[] = new int[10];

		for(int i=0; i<valores.length;i++) {
			System.out.print("indicame el valor: ");
			valores[i]=entrada.nextInt();
		}
		
		for(int i=0; i<valores.length;i++) {
			System.out.println("en la posición "+i+" esta el valor: "+valores[i]);
		}
		
		
		entrada.close();
	}

}
