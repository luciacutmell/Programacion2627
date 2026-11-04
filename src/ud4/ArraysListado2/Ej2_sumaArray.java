package ud4.ArraysListado2;

import java.util.Scanner;

public class Ej2_sumaArray {

	public static void main(String[] args) {
		// Crea un programa que pida diez números reales por teclado, los almacene en
		//un array, y luego muestre la suma de todos los valores.

		Scanner entrada = new Scanner(System.in);

		int valores[] = new int[10];
		int resultado = 0;
		
		for(int i=0; i<valores.length;i++) {
			System.out.print("indicame el valor: ");
			valores[i]=entrada.nextInt();
		}
		
		for(int i=0; i<valores.length;i++) {
			resultado=resultado+valores[i];
		}
		
		System.out.println(resultado);
		
		entrada.close();
		
	}

}
