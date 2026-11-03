package ud3.ListadoEj3;

import java.util.Scanner;

public class Eje19_piramideNum {

	public static void main(String[] args) {
		//Crea un programa que pinte una escalera de números, 
		//siendo cada línea un número: 
//		N=3
//		1
//		22
//		333

		
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("Indicame un número");
		num=entrada.nextInt();
		
		for(int i=1; i<=num;i++) {
			System.out.println();
			for(int x=1;x<=i;x++) {
				System.out.print(i);
			}
		}
		
		
		entrada.close();
	}

}
