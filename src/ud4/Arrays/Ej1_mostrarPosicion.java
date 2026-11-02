package ud4.Arrays;

import java.util.Scanner;

public class Ej1_mostrarPosicion {

	public static void main(String[] args) {
		// Crea un array de 5 números enteros y muestra el valor de cada posición. 

		Scanner entrada=new Scanner(System.in);
		int numeros [] = new int [5];
		
		for(int i=0;i<numeros.length;i++) {
			System.out.print("Dime el num: ");
			numeros[i]=entrada.nextInt();
			}
		
		for(int i=0; i<numeros.length;i++) {
			System.out.println(numeros[i]+ " en la posición: "+i);
		}
		
		entrada.close();
	}

}
