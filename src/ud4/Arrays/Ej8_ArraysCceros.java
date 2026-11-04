package ud4.Arrays;

public class Ej8_ArraysCceros {

	public static void main(String[] args) {
		// Crea un array de 8 enteros, rellénalo con ceros y muestra su contenido. 
 
		int numeros [] = new int [8];
		
		
		for(int i=0;i<numeros.length;i++) {
			numeros[i]=0;
		}
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("en la posición "+i+" tienes el valor "+numeros[i]);
		}
	}

}
