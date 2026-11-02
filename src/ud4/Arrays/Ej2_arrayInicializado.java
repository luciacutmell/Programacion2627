package ud4.Arrays;

import java.util.Scanner;

public class Ej2_arrayInicializado {

	public static void main(String[] args) {
		// Crea un array de 5 enteros e inicializa cada elemento 
		// con el número de su índice: 0, 1, 2, 3, 4. 

		Scanner entrada=new Scanner(System.in);
		
		int num [] = new int []{0, 1, 2, 3, 4}; 
		
		
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
		entrada.close();
	}

}
