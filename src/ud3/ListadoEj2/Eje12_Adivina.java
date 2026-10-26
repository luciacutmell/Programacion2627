package ud3.ListadoEj2;

import java.util.Scanner;

public class Eje12_Adivina {

	public static void main(String[] args) {
//		12.Realiza un programa donde el usuario "piensa" un número del 1 al 100 y el
//		ordenador intenta adivinarlo. Es decir, el ordenador irá proponiendo números una
//		y otra vez hasta adivinarlo (el usuario deberá indicarle al ordenador si es mayor,
//		menor o igual al número que ha pensado).

		Scanner entrada = new Scanner(System.in);

		int num, pensado;
		boolean respuesta = false;

		System.out.println("Piensa en un número del 1 al 100");
		System.out.println();
		System.out.println("Si adiviné el número pones SI de no ser así pones NO");
		System.out.println();
		
		
		num = (int) (1 + Math.random() * (100 - 1 + 1));
		System.out.println(num);
		
		while(respuesta!=true) {
			System.out.println("¿Adiviné el número? -- TRUE/FALSE");
			respuesta = entrada.nextBoolean();
			num = (int) (1 + Math.random() * (100 - 1 + 1));
		}
		System.out.println("ACERTAMOS");
		System.out.println("Indicame que número pensaste");
		pensado=entrada.nextInt();
		
		if(num<pensado) {
			System.out.println("Menor");
		}else if(num>pensado) {
			System.out.println("Mayor");
		}else {
			System.out.println("Ambos son iguales");
		}
		
	 entrada.close();
	

//		for (int i = 0; i < 3; i++) {
//			num = (int) (1 + Math.random() * (100 - 1 + 1));
//			System.out.println(num);
//			System.out.println("¿Adiviné el número? -- TRUE/FALSE");
//			respuesta = entrada.nextBoolean();
//
//			if (respuesta == true) {
//				i = 2;
//				System.out.println("Terminamos el programa");
//
//			} else if (respuesta == false) {
//				i = i - 1;
//			} else {
//				System.out.println("Has puesto un dato incorrecto, vuelvelo a poner");
//				respuesta = entrada.nextBoolean();
//			}
//
//		}

		
		
		
	}

}
