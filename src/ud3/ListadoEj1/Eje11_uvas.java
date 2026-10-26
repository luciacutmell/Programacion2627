package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje11_uvas {

	public static void main(String[] args) {
//		La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se clasifica en tipos (1 y 2), y además en tamaños (500 y 900).
//		Cuando se realiza la venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que entrega en un
//		embarque considerando lo siguiente:
//		Si es de tipo 1, se le cargan 20 céntimos al precio inicial cuando es de tamaño 500 y 30 céntimos si es de tamaño 900.
//		Si es de tipo 2, se rebajan 30 céntimos cuando es de tamaño 500, y 50 céntimos cuando es de tamaño 900.
	
		Scanner entrada= new Scanner(System.in);
		
		
		double precioKilo=10, precioFinal;
		int tipo, tamanio;
		
		
		//PEDIRÉ POR TECLADO QUE TIPO SERÁ 
		System.out.println("Indica el tipo de uva que se comprará -- > 1 o 2 ");
		tipo=entrada.nextInt();
		
		if(tipo==1 || tipo==2) {
			System.out.println();
		} else {
			System.out.println("Pusiste un tipo erróneo");
		}
		
		//PEDIRE POR TECLADO QUE TAMAÑO SERÁ
		System.out.println("Escoge el tamaño de la UVA que vas a elegir (500/900)");
		tamanio=entrada.nextInt();
		if(tamanio==500 || tamanio==900) {
			System.out.println();
		
		}else {
			System.out.println("Has puesto un tamaño erróneo");
		}
		
		System.out.println("Escogiste el tipo: "+tipo+" y el tamaño: "+tamanio);
		System.out.println();
		
		//DEPENDE DEL TIPO SE SUMA CENTIMOS ADICIONALES O SE RESTAN 
		if(tipo==1 && tamanio==500) {
			precioFinal=(precioKilo/2)+0.20;
		}else if(tipo==1 && tamanio==900) {
			precioFinal=precioKilo-(precioKilo*0.10)+0.30;
		}
		else if(tipo==2 && tamanio==500) {
			precioFinal=(precioKilo/2)-0.30;
		}else {
			precioFinal=precioKilo-(precioKilo*0.10)-0.50;
		}
		//MOSTRARÁ EL PRECIO FINAL QUE PAGARÉ	
		System.out.println("El precio Final será "+precioFinal);	
		
		entrada.close();
	}

}
