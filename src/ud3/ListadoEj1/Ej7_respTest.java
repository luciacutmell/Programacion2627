package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej7_respTest {
//	Crea un algoritmo que calcule la nota final de un examen tipo test, del cual se
//	solicitarán el número de respuestas correctas, incorrectas y en blanco. 
//	La puntuación se calculará sumando 4 puntos por cada respuesta correcta, restando
//	1 punto por cada incorrecta y 0 puntos por las respuestas en blanco. 
	
	public static void main(String[] args) {
		int notaFinal=0, respCorrectas=0, respIncorrectas=0, respBlanco;
		
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Ingresa la cantidad de respuestas Correctas");
		respCorrectas=entrada.nextInt();
		
		System.out.println("Ingresa la cantidad de respuestas Incorrectas");
		respIncorrectas=entrada.nextInt();
		
		System.out.println("Ingresa la cantidad de respuestas en Blanco");
		respBlanco=entrada.nextInt();
		

		notaFinal=(respCorrectas*4)-respIncorrectas;
		
		System.out.println("La nota final es:"+notaFinal);
		System.out.println("Tienes esta cantidad de resp Blanco "+respBlanco);
		
		
		
		
		entrada.close();
		
	}

	
}
