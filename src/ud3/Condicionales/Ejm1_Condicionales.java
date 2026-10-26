package ud3.Condicionales;

import java.util.Scanner;

public class Ejm1_Condicionales {

	public static void main(String[] args) {

//		Scanner entrada=new Scanner(System.in);
		
//		EJ WHILE
//		int n=10;
//		
//		while(n<14) {
//			System.out.println("El valor de n es "+n);
//			n++;
//		}
//		System.out.println("El valor final de n es "+n);
//		

		
		
//		EJ DO WHILE		
//		int n=0;
//		
//		do {
//			System.out.println("Introduce un número positivo");
//			n=entrada.nextInt();
//		} while(n<0);
//			System.out.println("El valor de n es "+n);
		
		
		
//		EJ FOR		
//		int i=0;
//		for(i=1;i<=10;i++) {
//			System.out.println("El valor de i es : "+i);
//		}
//		System.out.println("El FINAL del valor de i es: "+i);
//		
		
// 	MOSTRAR  NUMEROS PARES ENTRE 0 Y 10 
		
		int i=0;
		
		//FOR
		
//		for(i=0;i<=10;i=i+2) {
//			System.out.println(i);
//		}
		
		//WHILE
		while(i<11) {
			System.out.println(i);
			i=i+2;
		}
	
		
		//DO WHILE
		do {
			System.out.println(i);
			 i=i+2;
				
		} while(i<11);
		
		
//		entrada.close();
	}

}
