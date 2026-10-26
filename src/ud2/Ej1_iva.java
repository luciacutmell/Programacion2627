package ud2;

import java.util.Scanner;

public class Ej1_iva {

	public static void main(String[] args) {
		
		Scanner montoUsuario = new Scanner (System.in);

		final double IVA=0.21;
		double montoFinal=0, precioSinIva=0, precioIVA=0;
		
		
		System.out.println("Indicar precio del articulo: ");
		precioSinIva=montoUsuario.nextDouble();
		montoFinal=precioSinIva+(precioSinIva*IVA);
		precioIVA=precioSinIva*IVA;
		
		System.out.println("El monto que pagará el usuario es "+montoFinal);
		System.out.println("El monto del IVA es: "+precioIVA);

		montoUsuario.close();
	}
}

