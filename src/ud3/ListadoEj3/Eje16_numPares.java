package ud3.ListadoEj3;

import java.util.Scanner;

public class Eje16_numPares {

	public static void main(String[] args) {
		// Introducir un número entero por teclado.
		// El programa debe calcular y mostrar por pantalla todos los números pares
		// entre el 1 y el número introducido por teclado.
		// Debe comprobar que el número introducido es mayor que 1,
		// en caso contrario debe solicitar el nº indefinidamente.

//		introduce un numero
//		1
//		el número debe ser > 1
//		0
//		el número debe ser > 1
//		8
//		Los números pares entre 1 y 8 son:
//			2
//			4
//			6
//			8

		Scanner entrada = new Scanner(System.in);
		int num = 2;

		while (num > 1) {
			System.out.println("Indicame un número: ");
			num = entrada.nextInt();

			

				for (int i = 2; i <= num; i = i + 2) {
					System.out.println(i);
				}


		}
		entrada.close();
	}

}
