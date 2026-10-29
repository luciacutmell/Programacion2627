package practica13nov;

public class LaboratorioMatematico {

	public static void main(String[] args) {
//		Desarrolla un programa con un menú principal que se repite hasta que 
//		el usuario elija salir. 
//		Cada opción resuelve uno de los ejercicios siguientes.
//		=== LABORATORIO MATEMÁTICO === 
//		1. Rombo de asteriscos 
//		2. Primos gemelos 
//		3. Secuencia de Collatz 
//		4. Números amigos 
//		5. Decimal a binario 
//		6. Adivino tu número 
//		0. Salir 
//		Restricciones: solo Scanner y System.out. 
//		Sin arrays, sin métodos propios, sin Math.* ni conversiones automáticas 
//		(Integer.toBinaryString, etc.). 
//		Todo se resuelve con variables, condicionales y bucles. 
//		Es decir, solo se puede usar lo visto en clase, 
//		y lo que viene en el pdf publicado en el aula virtual 
//		“Para empezar a programar.pdf”. 
//		Validación: si el usuario introduce un dato no válido, 
//		se le vuelve a pedir hasta que sea correcto. 
//		Por ejemplo, si nos dice que un número sea positivo, 
//		la validación se refiere a que se controle que solo se admitan esos positivos. 
		
//		1. Rombo de asteriscos 
//		El usuario pasará por teclado un número impar entre 1 y 15 
//		y se deberá dibujar un rombo con esa altura. 
//		Ejemplo, para n = 5 
//		  * 
//		 ***  
//		*****
//		 *** 
//		  * 
		
//		2. Primos gemelos En matemáticas, 
//		los primos gemelos son pares de números primos que se diferencian exactamente en 2. 
//		Algunos ejemplos son:
//		(3, 5)      (5, 7)       (41, 43)       (59, 61)     
//		(11, 13)      (17, 19)       (29, 31)       
//		Para resolver este algoritmo, pide un número N ≥ 2 
//		y muestra todas las parejas de primos gemelos (p, p+2)
//		con p+2 ≤ N, y cuántas hay. Pista: no hace falta recorrer los números dos veces. 
		
		
//		3. Secuencia de Collatz La secuencia de Collatz (o problema 3n + 1) 
//		se construye a partir de un número entero positivo n aplicando 
//		repetidamente esta regla:
//			 Si n es par, se divide entre 2: n → n / 2 
//			 Si n es impar, se multiplica por 3 y se suma 1: n → 3n + 1 
//			Se repite hasta llegar a 1 (a partir de ahí se entra en el ciclo 1 → 4 → 2 → 1).
//			La conjetura de Collatz afirma que, empieces por el número que empieces, 
//			siempre acabarás llegando a 1. 
//			Ejemplo con n = 6: 6 → 3 → 10 → 5 → 16 → 8 → 4 → 2 → 1 
//			Ejemplo con n = 7: 7 → 22 → 11 → 34 → 17 → 52 → 26 → 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1 
//			Para resolver dicho algoritmo, pide un número n > 0. 
//			Aplicas las reglas de par o impar indicadas anteriormente hasta llegar a 1. 
//			Muestra la secuencia, el número de pasos y el valor máximo alcanzado. 
//			Ampliación (+0.5): dado N, indica qué número entre 1 y N genera la secuencia más larga.
//			
		
//		4. Números amigos Los números amigos son una pareja de números enteros positivos
//		(a, b), distintos entre sí, tales que la suma de los divisores propios de cada uno
//		es igual al otro número. 
//		Los divisores propios de un número son todos sus divisores positivos 
//		excluyendo el propio número (el 1 sí cuenta).
//		Ejemplo clásico: (220, 284) los números 220 y 284 son números amigos. 
//		 Divisores propios de 220: 1, 2, 4, 5, 10, 11, 20, 22, 44, 55, 110 → suma = 284 
//		 Divisores propios de 284: 1, 2, 4, 71, 142 → suma = 220 
//		Otras parejas conocidas: (1184, 1210), (2620, 2924), (5020, 5564), (6232, 6368). 
//		Para resolver este algoritmo, pide un límite N y muestra todas las parejas (a, b)
//		con a < b y a < N. 
		
		
//		5. Decimal a binario Dado un entero que pasará el usuario por teclado, 
//		debemos mostrar su representación binaria correctamente ordenada. 
//		Por ejemplo, 13 → 1101 
//		Pista: ¿qué pasa si empiezas por la potencia de 2 más grande que cabe en n, 
//		es decir, intentar empezar por el bit más significativo, 
//		el de la izquierda, para que los dígitos salgan ya en el orden correcto 
//		y se puedan imprimir directamente. 
		
//		6. Adivino tu número El usuario piensa un número del 1 al 1000. 
//		El programa intenta adivinarlo y tras cada intento el usuario responde 1
//		(mi número es mayor), 2 (es menor) o 3 (¡acertaste!).
//		El programa debe acertar en 10 intentos como máximo y mostrar cuántos ha necesitado.
//		Si las respuestas son incoherentes (el rango se queda vacío), 
//		debe detectarlo y avisar de que el usuario ha hecho trampa. 
		
	}

}
