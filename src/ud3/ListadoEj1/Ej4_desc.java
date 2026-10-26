package ud3.ListadoEj1;

import java.util.Scanner;

public class Ej4_desc {

	public static void main(String[] args) {
		// Escribe un programa que dado el precio de un artículo y el precio de venta real 
		// nos muestre el porcentaje de descuento realizado. 
		
		Scanner entrada=new Scanner(System.in);
		
		double precioInicial, precioReal, porcentaje, descuento;
		
		System.out.println("Dame el precio del artículo Inicial");
		precioInicial=entrada.nextDouble();
		System.out.println("Dame el precio Real que pagaste");
		precioReal=entrada.nextDouble();
		
		descuento=precioInicial-precioReal;
		porcentaje=((precioInicial-precioReal)/precioInicial)*100;
		
		System.out.println("Precio Inicial es:  "+precioInicial);
		System.out.println("Precio Real es:  "+precioReal);
		System.out.println("El descuento aplicado fue: "+descuento);
		System.out.println("Porcentaje aplicado fue: "+porcentaje);
		
		entrada.close();
	}

}
