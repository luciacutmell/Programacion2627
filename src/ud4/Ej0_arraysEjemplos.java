package ud4;

import java.util.Scanner;

public class Ej0_arraysEjemplos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		
		int edades [] = new int [5]; // declaramos e inicializamos array
	
		//pedir por teclado para rellenar el array
		for(int i=0;i<edades.length;i++) {
			System.out.println("Dime tu edad");
			edades[i]=entrada.nextInt();
			
			
		}
		
		System.out.println("Ya terminaste de pasar edades");
	
	//mostramos las edades
	for(int i=0; i<edades.length;i++) {
		System.out.println(edades[i]);
	}
	
	
	entrada.close();
	}

}
