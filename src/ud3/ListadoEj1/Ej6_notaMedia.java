package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej6_notaMedia {

	public static void main(String[] args) {
		//Crea un algoritmo que calcule la nota media de un alumno, a partir de sus 3 notas parciales. 

		
		Scanner entrada=new Scanner(System.in);
		
		double nota1, nota2, nota3, media;
		
		System.out.println("Dame la primera nota");
		nota1=entrada.nextDouble();
		System.out.println("Dame la segunda nota");
		nota2=entrada.nextDouble();
		System.out.println("Dame la tercera nota");
		nota3=entrada.nextDouble();
		
		media=(nota1+nota2+nota3)/3;
		System.out.println("La media es: "+media);
		
		
		
		entrada.close();
	}

}
