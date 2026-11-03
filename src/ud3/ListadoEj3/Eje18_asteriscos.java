package ud3.ListadoEj3;

import java.util.Scanner;

public class Eje18_asteriscos {

	public static void main(String[] args) {
//		Crea un programa que solicite la altura de una escalera N por teclado 
//		y muestre una escalera de asteriscos de este tipo: 
//			N=3
//			*
//			**
//			***
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Indicame un número");
		num=entrada.nextInt();
		
		for(int i=1; i<=num;i++) {
			System.out.println();
			for(int x=1;x<=i;x++) {
				System.out.print("*");
			}
		}
		
		
		entrada.close();
		
	}

}
