package ud3.ListadoEj2;

import java.util.Scanner;

public class Ej5_decenasUnidades {

	public static void main(String[] args) {
//		Crea un algoritmo que permita leer un número de dos cifras 
//		y que se muestre el número de unidades y de decenas que lo componen
		
		Scanner entrada = new Scanner (System.in);
		int num, decenas, unidades;
		
		System.out.println("Dime un número");
		num=entrada.nextInt();
		
		decenas=num/10;
		unidades=num%10;
		
		System.out.println("Tiene "+decenas+" decenas y tiene "+unidades+" unidades");
		
		
		
		
		entrada.close();
	}

}
