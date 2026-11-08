package practica13nov;

import java.util.Scanner;

public class LaboratorioMatematico {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// VARIABLES 
		int opcion, num, mitad, p_gemelo = 0, cont = 0, conteo2 = 0, contadorParejas = 0, op = 0, num_pensado;

		boolean es_Primo = true, tieneGemelo = true, esPrimoAbajo = true, esPrimoArriba = true, pEsPrimo = true,
				p2EsPrimo = true, menor = true, mayor = true, igual = true;

		
		
		
		System.out.println("========= LABORATORIO MATEMÁTICO =========");
		System.out.println("1. Rombo de asteriscos");
		System.out.println("2. Primos gemelos");
		System.out.println("3. Secuencia de Collatz");
		System.out.println("4. Números amigos");
		System.out.println("5. Decimal a binario ");
		System.out.println("6. Adivino tu número");
		System.out.println("0. Salir");
		System.out.println();
		System.out.println("Indica la opción:");
		opcion = entrada.nextInt();

		switch (opcion) {

//		1. Rombo de asteriscos 
//		El usuario pasará por teclado un número impar entre 1 y 15 
//		y se deberá dibujar un rombo con esa altura. 
		case 1:
			System.out.println("Escogiste Rombo de asteriscos");
			System.out.println("Ingresa un número impar entre el 1 y el 15");
			num = entrada.nextInt();

			if (num > 0 && num <= 15 && num % 2 != 0) {
				System.out.println("Se hará un rombo de una altura de: " + num + " Asteriscos");
				mitad = (num / 2) + 1;

				// Arriba hasta el centro
				for (int i = 1; i <= mitad; i++) {
					for (int j = 1; j <= (mitad - i); j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= (2 * i - 1); j++) {
						System.out.print("*");
					}
					System.out.println();
				}
				// Desde el centro hacia abajo
				for (int i = mitad - 1; i >= 1; i--) {
					for (int j = 1; j <= (mitad - i); j++) {
						System.out.print(" ");
					}
					for (int j = 1; j <= (2 * i - 1); j++) {
						System.out.print("*");
					}
					System.out.println();
				}
			} else {
				System.out.println("Has introducido un valor erróneo");
			}
			break;

//		2. Primos gemelos En matemáticas, 
//		los primos gemelos son pares de números primos que se diferencian exactamente en 2. 
//		Algunos ejemplos son:
//		(3, 5)      (5, 7)       (41, 43)       (59, 61)     
//		(11, 13)      (17, 19)       (29, 31)       
//		Para resolver este algoritmo, pide un número N ≥ 2 
//		y muestra todas las parejas de primos gemelos (p, p+2)
//		con p+2 ≤ N, y cuántas hay. Pista: no hace falta recorrer los números dos veces. 		
		case 2:
			System.out.println("Escogiste Primos Gemelos");
			System.out.println("Ingresa un número mayor o igual a 2:");
			num = entrada.nextInt();

			// si es menor que 2 indicar que es erróneo
			if (num < 2) {
				System.out.println("El número debe ser mayor o igual a 2.");
			} else {
				// Determinar si el número ingresado es primo
				es_Primo = true;
				if (num <= 1) {
					es_Primo = false;
				} else {
					for (int i = 2; i < num; i++) {
						if (num % i == 0) {
							es_Primo = false;
						}
					}
				}

				if (es_Primo = true) {
					System.out.println("El número " + num + " SÍ es primo.");
				} else {
					System.out.println("El número " + num + " NO es primo.");
				}
				// Comprueba si tiene primo gemelo
				if (es_Primo) {
					tieneGemelo = false;
					// Verificar vecino inferior (num - 2)
					if (num - 2 >= 2) {
						esPrimoAbajo = true;
						for (int i = 2; i < (num - 2); i++) {
							if ((num - 2) % i == 0) {
								esPrimoAbajo = false;
							}
						}
						if (esPrimoAbajo = true) {
							System.out.println("Tiene un primo gemelo abajo: " + (num - 2));
							tieneGemelo = true;
						}
					}
					// Verificar vecino superior (num + 2)
					esPrimoArriba = true;
					for (int i = 2; i < (num + 2); i++) {
						if ((num + 2) % i == 0) {
							esPrimoArriba = false;
						}
					}
					if (esPrimoArriba = true) {
						System.out.println("Tiene un primo gemelo arriba: " + (num + 2));
						tieneGemelo = true;
					}

					if (tieneGemelo = false) {
						System.out.println("Es primo, pero no es primo Gemelo");
					}
				}
				// Muestra todas las parejas de primos gemelos anteriores hasta N
				System.out.println("Parejas de primos gemelos desde 2 hasta " + num);
				contadorParejas = 0;

				for (int p = 2; p + 2 <= num; p++) {
					// Comprobar si p es primo
					pEsPrimo = true;
					for (int i = 2; i < p; i++) {
						if (p % i == 0) {
							pEsPrimo = false;
						}
					}
					p2EsPrimo = true;
					for (int i = 2; i < (p + 2); i++) {
						if ((p + 2) % i == 0) {
							p2EsPrimo = false;
						}
					}
					// Si ambos son primos, es una pareja gemela
					if (pEsPrimo && p2EsPrimo) {
						System.out.println("(" + p + "," + (p + 2) + ")");
						contadorParejas++;
					}
				}
				System.out.println("Total de parejas encontradas hasta " + num + ": " + contadorParejas);
			}
			break;
//			3. Secuencia de Collatz La secuencia de Collatz (o problema 3n + 1) 
//			se construye a partir de un número entero positivo n aplicando repetidamente esta regla:
//				 Si n es par, se divide entre 2: n → n / 2 
//				 Si n es impar, se multiplica por 3 y se suma 1: n → 3n + 1 
//				Se repite hasta llegar a 1 (a partir de ahí se entra en el ciclo 1 → 4 → 2 → 1).
//				La conjetura de Collatz afirma que, empieces por el número que empieces, 
//				siempre acabarás llegando a 1. 
//				Ejemplo con n = 6: 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 
//				Ejemplo con n = 7: 7 → 22 → 11 → 34 → 17 → 52 → 26 → 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 
//				Para resolver dicho algoritmo, pide un número n > 0. 
//				Aplicas las reglas de par o impar indicadas anteriormente hasta llegar a 1. 
//				Muestra la secuencia, el número de pasos y el valor máximo alcanzado. 
//				Ampliación (+0.5): dado N, indica qué número entre 1 y N genera la secuencia más larga.
		case 3:
			System.out.println("Escogiste Secuencia de Collatz");
			System.out.println("Indicame un número");
			num = entrada.nextInt();
			if (num <= 0) {
				System.out.println("Has puesto un número erróneo tiene que ser un valor positivo y mayor que 0");
				num = entrada.nextInt();
			}
			while (num != 1) {
				if (num > 0 && num % 2 == 0) {
					num = num / 2;
					cont++;
				} else {
					num = (num * 3) + 1;
					cont++;
				}
				System.out.print(" " + num + " ");

			}
			System.out.println();
			System.out.println("Se realizó una secuencia de " + cont + " números");

			break;

//			4. Números amigos Los números amigos son una pareja de números enteros positivos
//			(a, b), distintos entre sí, tales que la suma de los divisores propios de cada uno
//			es igual al otro número. 
//			Los divisores propios de un número son todos sus divisores positivos 
//			excluyendo el propio número (el 1 sí cuenta).
//			Ejemplo clásico: (220, 284) los números 220 y 284 son números amigos. 
//			 Divisores propios de 220: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 → suma = 284 
//			 Divisores propios de 284: 1, 2, 4, 71, 142 → suma = 220 
//			Otras parejas conocidas: (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368). 
//			Para resolver este algoritmo, pide un límite N y muestra todas las parejas (a, b)
//			con a < b y a < N. 			
		case 4:

			break;

//			5. Decimal a binario Dado un entero que pasará el usuario por teclado, 
//			debemos mostrar su representación binaria correctamente ordenada. 
//			Por ejemplo, 13 → 1101 
//			Pista: ¿qué pasa si empiezas por la potencia de 2 más grande que cabe en n, 
//			es decir, intentar empezar por el bit más significativo, 
//			el de la izquierda, para que los dígitos salgan ya en el orden correcto 
//			y se puedan imprimir directamente. 
		case 5:

			break;

//			6. Adivino tu número El usuario piensa un número del 1 al 1000. 
//			El programa intenta adivinarlo y tras cada intento el usuario responde 1
//			(mi número es mayor), 2 (es menor) o 3 (¡acertaste!).
//			El programa debe acertar en 10 intentos como máximo y mostrar cuántos ha necesitado.
//			Si las respuestas son incoherentes (el rango se queda vacío), 
//			debe detectarlo y avisar de que el usuario ha hecho trampa. 			
		case 6:
			System.out.println("Escogiste: Adivino tu número");
			System.out.println("Piensa en un número del 1 al 1000");
			System.out.println("Indicame el número");
			num_pensado = entrada.nextInt();
			System.out.println("Si el número es mayor marca: 1 -- Si el número es menor marca: 2 -- y 3 si Acerté");
			System.out.println();

			num = (int) (1 + Math.random() * (1000 - 1 + 1));
			System.out.println(num);

			System.out.println("¿Acerté? -- > 1 -- < 2 -- = 3");
			op = entrada.nextInt();

			while (opcion != 3) {
				switch (opcion) {
				case 1:
					menor = num_pensado < num;
					menor = true;
					if (menor) {
						num = (int) (num + Math.random() * (1000 - num + 1));
						System.out.println(num);
						System.out.println();
						System.out.println("¿Acerté?");
						op = entrada.nextInt();

					}
					cont++;
					break;
				case 2:
					mayor = num_pensado > num;
					mayor = true;
					if (mayor) {
						num = (int) (num + Math.random() * (num - 1 + 1));
						System.out.println(num);
						System.out.println();
						System.out.println("¿Acerté?");
						op = entrada.nextInt();
					}
					cont++;
					break;
				case 3:
					igual = num_pensado == num;
					igual = true;
					System.out.println("Acerté luego de " + cont + " intentos");
				}

			}

			break;

		default:
			System.out.println("Marcaste una opción errónea");
			break;
		}
	}
}
