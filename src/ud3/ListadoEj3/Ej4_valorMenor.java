package ud3.ListadoEj3;

import java.util.Scanner;

public class Ej4_valorMenor {

	public static void main(String[] args) {
//		Crea un programa que determine el menor valor de 5 números introducidos por teclado.
//		Considera que el menor valor puede repetirse. 
//		Por ejemplo: Si los números introducidos fueran. 14, 19, 14, 16 y 15. 
//		El menor valor introducido es 14. 
		
		Scanner entrada = new Scanner(System.in);
		int valor1, valor2, valor3, valor4, valor5, menor;
		
		System.out.println("Introduce el valor1");
		valor1=entrada.nextInt();

		System.out.println("Introduce el valor2");
		valor2=entrada.nextInt();
		
		System.out.println("Introduce el valor3");
		valor3=entrada.nextInt();
		
		System.out.println("Introduce el valor4");
		valor4=entrada.nextInt();
		
		System.out.println("Introduce el valor5");
		valor5=entrada.nextInt();
		
		if(valor1<=valor2 && valor1<=valor3 && valor1<=valor4 && valor1<=valor5) {
			menor=valor1;
		}else if(valor2<=valor1 && valor2<=valor3 && valor2<=valor4 && valor2<=valor5) {
			menor=valor2;
		}else if(valor3<=valor1 && valor3<=valor2 && valor3<=valor4 && valor3<=valor5) {
			menor=valor3;
		}else if(valor4<=valor1 && valor4<=valor2 && valor4<=valor3 && valor4<=valor5) {
			menor=valor4;
		}else {
			menor=valor5;
		}
		
		System.out.println("El menor es: "+menor);
		
		entrada.close();
	}

}
