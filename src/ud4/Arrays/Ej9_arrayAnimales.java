package ud4.Arrays;

import java.util.Scanner;

public class Ej9_arrayAnimales {

	public static void main(String[] args) {
		// Crea un array de 5 palabras con nombres de animales y muestra todas 
		// las palabras con un bucle. 
		
		Scanner entrada = new Scanner(System.in);
		
		String animales[] = new String [5]; 
		
		for(int i=0; i<animales.length;i++) {
			System.out.print("nombra al animal: ");
			animales[i]=entrada.next();
		}
		
		for(int i=0; i<animales.length;i++) {
			System.out.println(animales[i]);
		}
		
		
		
		
		entrada.close();
	}

}
