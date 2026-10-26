package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej2_resultadoOperaciones {

	public static void main(String[] args) {
		// Escribe un programa que lea dos números, calcule y muestre el valor de sus suma,
		//resta, producto y división.
		
		Scanner entrada=new Scanner(System.in);
		
		int num1, num2, suma, resta, multiplicacion;
		double division;
		
		System.out.println("Dame el número 1");
		num1=entrada.nextInt();
		System.out.println("Dame el número 2");
		num2=entrada.nextInt();
		
		suma=num1+num2;
		System.out.println("La suma de "+num1+" y "+num2+" es "+suma);
		resta=num1-num2;
		System.out.println("La resta de "+num1+" y "+num2+" es "+resta);
		multiplicacion=num1*num2;
		System.out.println("La multiplicación de "+num1+" y "+num2+" es "+multiplicacion);
		division=num1/num2;
		System.out.println("La división de "+num1+" y "+num2+" es "+division);
		
		
		entrada.close();
	}

}
