package ud3.ListadoEj3;

import java.util.Scanner;

public class Ej6_MenuCalculadora {

	public static void main(String[] args) {
//		Desarrolla un programa en Java que permita realizar diferentes operaciones
//		matemáticas mediante un menú interactivo.
//		El programa deberá mostrar el menú repetidamente hasta que el usuario
//		seleccione la opción 0, momento en el que finalizará su ejecución.
//		El menú deberá contener las siguientes opciones:
//		========= CALCULADORA =========
//		1. Sumar
//		2. Restar
//		3. Multiplicar
//		4. Dividir
//		5. Calcular potencia
//		0. Salir
//		===============================
//		Elige una opción:
//		Opción 1. Sumar
//		Solicitar dos números al usuario, calcular su suma y mostrar el resultado por pantalla.
//		Opción 2. Restar
//		Solicitar dos números al usuario, comprobar cuál es el mayor, para así hacer la
//		resta correctamente.
//		Opción 3. Multiplicar
//		Solicitar dos números al usuario, calcular su producto y mostrar el resultado.
//		Opción 4. Dividir
//		Solicitar dos números al usuario y dividir el primero entre el segundo. Antes de
//		realizar la operación, se deberá comprobar que el divisor no sea cero. Si lo es, se
//		mostrará un mensaje de error y no se realizará la división.
//		Opción 5. Calcular potencia
//		Solicitar al usuario una base y un exponente entero. El programa deberá calcular
//		la potencia sin utilizar el método Math.pow().
//		Para ello, deberá cumplir las siguientes condiciones:
//		 Si el exponente es positivo, multiplicar la base por sí misma tantas veces
//		como indique el exponente.
//		 Si el exponente es cero, el resultado será 1, excepto cuando la base también sea cero. En ese caso, se mostrará un mensaje indicando que la operación no está definida.
//		 Si el exponente es negativo, calcular primero la potencia con el exponente
//		positivo y después dividir 1 entre el resultado obtenido.
//		 Si la base es cero y el exponente es negativo, mostrar un mensaje de error,
//		ya que no se puede dividir entre cero.
//		Opción 0. Salir
//		Mostrar un mensaje de despedida y finalizar el programa. El menú no deberá volver a mostrarse después de seleccionar esta opción.
		Scanner entrada=new Scanner(System.in);
		
		int opcion = 0, num1, num2, mayor, menor; 
		double resultado;
		
		switch (opcion) {
//		Opción 1. Sumar
//		Solicitar dos números al usuario, calcular su suma y mostrar el resultado por pantalla.
		case 1:
			System.out.println("Sumar");
			num1=entrada.nextInt();
			num2=entrada.nextInt();
			resultado=num1+num2;
			System.out.println("El resultado de la suma es "+resultado);
			break;
//			Opción 2. Restar
//			Solicitar dos números al usuario, comprobar cuál es el mayor, para así hacer la			
		case 2:
			System.out.println("Restar");
			num1=entrada.nextInt();
			num2=entrada.nextInt();
			if(num1<num2) {
				mayor=num2;
				menor=num1;
			}else {
				mayor=num1;
				menor=num2;
			}
			resultado=mayor-menor;
			System.out.println("El resultado de la resta es "+resultado);
			break;
//			Opción 3. Multiplicar
//			Solicitar dos números al usuario, calcular su producto y mostrar el resultado.			
		case 3:
			System.out.println("Multiplicar");
			num1=entrada.nextInt();
			num2=entrada.nextInt();
			resultado=num1*num2;
			System.out.println("El resultado de la multiplicación es: "+resultado);
			break;
//			Opción 4. Dividir
//			Solicitar dos números al usuario y dividir el primero entre el segundo. Antes de
//			realizar la operación, se deberá comprobar que el divisor no sea cero. Si lo es, se
//			mostrará un mensaje de error y no se realizará la división.			
		case 4:
			System.out.println("División");
			System.out.println("Indicame el dividendo");
			num1=entrada.nextInt();
			System.out.println("Indicame el divisor");
			num2=entrada.nextInt();
			
			if(num2==0) {
				System.out.println("Error: el divisor no puede ser 0");
			}else {
				resultado=num1/num2;
				System.out.println("El resultado de la división es: "+resultado);
			}
			break;
//			Opción 5. Calcular potencia
//			Solicitar al usuario una base y un exponente entero. 
//			Para ello, deberá cumplir las siguientes condiciones:
//			 Si el exponente es positivo, multiplicar la base por sí misma tantas veces
//			como indique el exponente.
//			 Si el exponente es cero, el resultado será 1, excepto cuando la base también sea cero. En ese caso, se mostrará un mensaje indicando que la operación no está definida.
//			 Si el exponente es negativo, calcular primero la potencia con el exponente
//			positivo y después dividir 1 entre el resultado obtenido.
//			 Si la base es cero y el exponente es negativo, mostrar un mensaje de error,
//			ya que no se puede dividir entre cero.			
		case 5:
			System.out.println("Potencia");
			System.out.println("Indicame la base");
			num1=entrada.nextInt();
			System.out.println("Indicame el exponente");
			num2=entrada.nextInt();
			//exponente 0
			if(num2==0) {
				resultado=1;
				System.out.println("El resultado de la potencia es: "+resultado);
			//exponente positivo
			}else if(num2>0) {
			for(int i=0;i<num2;i++) {
				
				
			}
			//exponente negativo	
			}else {
				
			}
			
			
			
		}
		
		
		
		entrada.close();
	}

}
