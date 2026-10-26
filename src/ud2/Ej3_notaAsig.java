package ud2;

import java.util.Scanner;

public class Ej3_notaAsig {

//	Diseña un algoritmo que determine la nota final de un alumno en la asignatura. La nota compone de: 
//	Examen teorico:  60%
//	Practicas de aula: 40%
//	Pediremos al usuario la nota de la parte teórica y la de la práctica. 
//	Para aprobar es imprescindible que la nota del examen teórico sea mayor o igual a 5.0. 
//	Si no alcanza el 5.0 en el teórico, la nota final será directamente la nota del teórico. 
//	Si la nota del examen es mayor o igual a 5.0, se calcula la media ponderada. 
//	Si la media es mayor o igual a 5.0, el alumno estará "Aprobado", de lo contrario "Suspenso".

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);		
		
		double teorico = 0, practica = 0, notaFinal = 0;


		System.out.println("Introduce tu nota del exámen teórico:");
		teorico = entrada.nextDouble();

		if (teorico >= 5) {
			System.out.println("Introduce la nota de las prácticas de aula:");
			practica = entrada.nextDouble();

			teorico=teorico/100*60;
			practica=practica/100*40;
			
			notaFinal = practica + teorico;

			System.out.println("La nota Final es: " + notaFinal);

			if (notaFinal >= 5) {
				System.out.println("Estás Aprobado");
			} else {
				System.out.println("Estás Suspenso");
			}
		}

		else {
			notaFinal = teorico;
			System.out.println("La nota final es: " + notaFinal);
			System.out.println("Estás Suspenso");

		}
		entrada.close();
	}
}
