package ud3.ListadoEj2;

import java.util.Scanner;

public class Eje10 {

	public static void main(String[] args) {
		
//		Realiza un programa que sume independientemente los pares y los impares
//		de los números comprendidos entre 100 y 200, 
//		y luego muestra por pantalla ambas sumas. 
		Scanner entrada=new Scanner(System.in);
		
		int pares=0, impares=0, resultado,num;
		
		
		for(int i=0; i<4;i++) {
			System.out.println("Indicame un número");
			num=entrada.nextInt();
			
			if(num%10==0){
				num=pares;
				resultado=num+pares;
				resultado=pares;
			}else {
				num=impares;
				resultado=num+impares;
				resultado=impares;
			}
			
			
		} 
		System.out.println("La suma de pares es: "+pares);
		System.out.println("La suma de impares es: "+impares);
		
		
		
		entrada.close();
	}
}
