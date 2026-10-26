package ud3.ListadoEj2;

import java.util.Scanner;

public class Ej3_edad {

	public static void main(String[] args) {
		// Crea un algoritmo que solicite la edad de 200 personas y que muestre cuántos mayores y cuántos menores de edad hay

		Scanner entrada=new Scanner(System.in);
		
		int mayores = 0, menores = 0, edad;
		
		for(int i=1;i<5;i++) {
			System.out.println("Indicame la edad de la persona "+i);
			edad=entrada.nextInt();
			
			if(edad<18) {
				menores=menores+1;
			}else {
				mayores=mayores+1;
			}
		}
		
		System.out.println("Hay "+menores+" menor(es) de edad y "+mayores+" mayor(es) de edad");
		
		
		
		
		
		
		entrada.close();
		
	}

}
