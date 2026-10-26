package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej3_longitud {

	public static void main(String[] args) {
//		Escribe un programa que toma como dato de entrada un número que corresponde a la longitud de un radio 
//		y nos escribe la longitud de la circunferencia, el área del círculo y el volumen de la esfera que 
//		corresponden con dicho radio. 

		Scanner entrada = new Scanner(System.in);

		double radio, circunferencia = 1, area_circulo, volumen_esf;

		System.out.println("Dame un número que corresponde a la longitud de la radio");
		radio = entrada.nextDouble();

		circunferencia = radio * (Math.PI * 2);
		area_circulo = (radio * radio) * Math.PI;
		volumen_esf = 4 / 3 * (Math.PI * (radio * radio * radio));

		System.out.println("La circunferencia vale: " + circunferencia);
		System.out.println("El area del círculo es: " + area_circulo);
		System.out.println("El volumen de la esfera es: " + volumen_esf);

		
		entrada.close();
	}

}
