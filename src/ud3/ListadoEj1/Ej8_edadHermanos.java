package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej8_edadHermanos {

	public static void main(String[] args) {
		// Crea un algoritmo que solicite la edad de 2 hermanos y muestre un mensaje indicando 
		// la edad del mayor y cuántos años de diferencia tiene con el menor. 

		
		Scanner entrada=new Scanner(System.in);
		
		int hermano1, hermano2, diferencia, mayor, menor;

		System.out.println("Dame la edad un hermano");
		hermano1=entrada.nextInt();
		
		System.out.println("Dame la edad del otro hermano");
		hermano2=entrada.nextInt();
		
		
		if(hermano1<hermano2) {
			mayor=hermano2;
			menor=hermano1;
		}else {
			mayor=hermano1;
			menor=hermano2;
		}
		
		diferencia=mayor-menor;
		
		System.out.println("La edad del hermano mayor es: "+mayor);
		System.out.println("La diferencia entre ellos es de: "+diferencia);

	
	
	entrada.close();
	}

}
