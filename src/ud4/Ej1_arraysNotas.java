package ud4;

import java.util.Scanner;

public class Ej1_arraysNotas {

	public static void main(String[] args) {
		// almacenar las notas de 10 alumnos en un array. Despues sacar la nota media.

		
		
		Scanner entrada = new Scanner(System.in);

		double media, suma = 0;
			double notas[] = new double[10];
			
			
			
			
				//recorro el array para guardar las 10 notas
			for(int i=0;i<notas.length;i++) {
				System.out.print("Nota: ");
				//generamos las 10 notas
				notas[i]=(1+Math.random()*(10-1+1));
				//mostramos
				System.out.println(notas[i]);
				//sumamos los valores 
				suma=suma+notas[i];
				//divido para la media
				media=suma/10;
				System.out.println("La media es: "+media);
			}
			
		
		
		
		
		
		
		
		entrada.close();
	}

}
