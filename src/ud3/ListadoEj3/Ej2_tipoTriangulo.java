package ud3.ListadoEj3;

import java.util.Scanner;

public class Ej2_tipoTriangulo {

	public static void main(String[] args) {
//		Crea un programa que lea 3 datos de entrada A, B y C. 
//		Estos datos corresponden a las dimensiones de los lados de un triángulo.
//		El programa debe determinar qué tipo de triangulo es, 
//		teniendo en cuenta los siguiente: 
//			 Si se cumple Pitágoras entonces es triángulo rectángulo. 
//			 Si sólo dos lados del triángulo son iguales entonces es isósceles. 
//			 Si los 3 lados son iguales entonces es equilátero. 
//			 Si no se cumple ninguna de las condiciones anteriores, es escaleno. 
		Scanner entrada = new Scanner(System.in);
		int a,b,c;
		
		System.out.println("Indicame 1er lado del triangulo");
		a=entrada.nextInt();
		
		System.out.println("Indicame 2do lado del triangulo");
		b=entrada.nextInt();
		
		System.out.println("Indicame 3er lado del triangulo");
		c=entrada.nextInt();
		
		if(a==b && b==c && a==c) {
			System.out.println("Es un triánguno equilátero");
		
		}else if(a*(a)+b*(b)==c*(c)) {
			System.out.println("Es un triángulo rectángulo");
		
		}else if(a==b && c!=b) {
			System.out.println("Es un triángulo isósceles");
		}else if(a!=b && c==b) {
			System.out.println("Es un triángulo isósceles");
		}else {
			System.out.println("Es un triángulo escaleno");
		}
		
		entrada.close();
	}

}
