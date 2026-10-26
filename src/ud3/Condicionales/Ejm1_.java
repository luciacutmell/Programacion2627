package ud3.Condicionales;

import java.util.Scanner;

public class Ejm1_ {

	public static void main(String[] args) {
		// dado un num que el usuario pasara por teclado, nos diga cuantas cifras tiene.  El prog se ejecutará en bucle  hasta que el usuario pase 0
		
		Scanner entrada= new Scanner(System.in);
		
		long num, cont=0;
		

		System.out.println("Dame un número");
		num=entrada.nextLong();

		while(num!=0) {
			num=num/10;
			cont++;
	
			} System.out.println("Tiene está cantidad de cifras: "+cont);
		
		
		
		} 
		
		
//			}
		

		
//		if(num!=0) {
//			for(int i=0;i<num;i++) {
//			}
//		}else {
//			System.out.println("Fin del programa");
//		}

		
		
		
	

}