package ud4.Arrays;

public class Ej4_crearRellenarbucle {

	public static void main(String[] args) {
		// Crea un array de 10 enteros y rellénalo con los números del 1 al 10 usando un bucle.
	
		int numeros[] = new int[20];
		
		//inicializamos array valores
		for(int i=0;i<numeros.length;i++) {
			numeros[i]= i+1;
			}
		
		//mostramos los valors
		for(int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
			}
	
	}

}
