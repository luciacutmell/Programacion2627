package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje13_viajeAlumnos {

	public static void main(String[] args) {
//		El director de una escuela está organizando un viaje de estudios y 
//		requiere determinar cuánto debe cobrar a cada alumno y 
//		cuánto debe pagar a la compañía de viajes por el servicio. 
//		La forma de cobrar es la siguiente: 
//		Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
//		De 50 a 99 alumnos, el costo es de 70 euros. 
//        De 30 a 49 alumnos, el costo es de 95 euros. 
//        Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, 
//        sin importar el número de alumnos. 
//        Realiza un algoritmo que permita determinar el pago a la compañía de autobuses 
//        y lo que debe pagar cada alumno por el viaje. 

		Scanner entrada=new Scanner (System.in);

		int alumnos,viaje, montoTotal=0;
		
		System.out.println("Cuantos alumnos irán al viaje");
		alumnos=entrada.nextInt();
		//mayor de 100 alumnos pagarán por viaje 65€
		if(alumnos>=100) {
			viaje=65;
			montoTotal=alumnos*viaje;
			System.out.println("El viajré costará: "+montoTotal);
		// alumnos entre 50 y 99 pagarán 70€	
		}else if(alumnos>=50 && alumnos<=99) {
			viaje=70;
			montoTotal=alumnos*viaje;
			System.out.println("El viajré costará: "+montoTotal);
		// alumnos entre 30 y 49 pagara 95
		}else if(alumnos>=30 && alumnos<=49) {
			viaje=95;
			montoTotal=alumnos*viaje;
			System.out.println("El viajré costará: "+montoTotal);
		// menos de 30 alumnos se divide 4000€ entre todos los que irán
		} else if(alumnos<30) {
			montoTotal=(4000/alumnos);
			System.out.println("El viaje costará a cada alumno: "+montoTotal);
		}
		
		
		
		
		
		entrada.close();
	}

}
