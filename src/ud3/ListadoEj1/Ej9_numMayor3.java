package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej9_numMayor3 {
//	Crea un algoritmo que permita leer 3 números diferentes entre sí, y determinar
//	cuál es el mayor de los tres.
	
	public static void main(String[] args) {
		
		int num1,num2,num3, numMayor;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Indica el primer número");
		num1=entrada.nextInt();
		
		System.out.println("Indica el segundo número");
		num2=entrada.nextInt();
		
		System.out.println("Indica el tercer número");
		num3=entrada.nextInt();
		
		if(num1!=num2 && num1!=num3 && num2!=num3) {
			
		
		if(num1>num2 && num1>3) {
			numMayor=num1;
			//System.out.println("El número 1 es el mayor de los 3 porque es el: "+num1);
		} else if(num2>num1 && num2>num3) {
			numMayor=num2;
			//System.out.println("El número 2 es el mayor de los 3 porque es el: "+num2);
		} else  {
			numMayor=num3;
			//System.out.println("El número 3 es el mayor de los 3 porque es el: "+num3);

		}
		
		System.out.println("El número mayor es "+numMayor);
		
		}else {
			System.out.println("Los números tienen que ser distintos");
		}
	
	entrada.close();
	}
	
}
