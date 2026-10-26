package ud2;

import java.util.Scanner;

/*	1. Declarar e inicializar variables precioOriginal=0 y porcentajeDesc=0 y precioFinal=0
	2. Pedir al usuario que pase por teclado el precioOriginal y porcentajeDesc
	3. El precioFinal=precioOriginal-(precioOriginal*(porcentajeDesc/100))
	-- Entraría las condicionales if/else --
	4. Si el valor del precioFinal =< 100 se muestra "Economico"
	5. Si el valor del precioFinal > 100 se muestra "Caro"*/

public class Ej2_desc {

	public static void main(String[] args) {

		Scanner entrada=new Scanner(System.in);
		
		// DECLARAR VARIABLES
		
		double precioOriginal=0, precioFinal=0, importeDesc=0, porcentajeDesc=0;
		
		//PASAR POR TECLADO PRECIO INICIAL + PORCENTAJE DE DESCUENTO
		System.out.println("Indicame el precio inicial: ");
		precioOriginal=entrada.nextDouble();
		
		System.out.println("Indicame el porcentaje de descuento: ");
		porcentajeDesc=entrada.nextDouble();
		
		//CALCULAR DESCUENTO 
		importeDesc = precioOriginal*(porcentajeDesc/100);
		
		//CALCULAR TOTAL
		precioFinal= precioOriginal - importeDesc;
		
		
		System.out.println("El precio final a pagar es "+precioFinal);

		if(precioFinal>100) {
			System.out.println("Es Caro");
		}
		else {
			System.out.println("Es Económico");
		}
		
		entrada.close();
	}

}
