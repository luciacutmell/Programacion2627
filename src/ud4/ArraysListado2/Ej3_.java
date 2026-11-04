package ud4.ArraysListado2;

import java.util.Scanner;

public class Ej3_ {

	public static void main(String[] args) {
//		Crea un programa que pida diez números reales por teclado, los almacene en
//		un array, y luego lo recorra para averiguar el máximo y mínimo y mostrarlos por
//		pantalla.

		
		Scanner entrada = new Scanner(System.in);

		int valores[] = new int[3];
		int mayor, menor;
		

		for(int i=0; i<valores.length;i++) {
			System.out.print("indicame el valor: ");
			valores[i]=entrada.nextInt();	
		}
		
		for(int i=0; i<valores.length;i++) {
			System.out.println(valores[i]);
		}
		
		
		
		
		entrada.close();

	}

}
