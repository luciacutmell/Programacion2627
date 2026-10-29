package ud3.ListadoEj1;

import java.util.Scanner;

public class Eje12_costeLlamada_Inc {

	public static void main(String[] args) {
//		La política de cobro de una compañía telefónica es: cuando se realiza una llamada, 
//		el cobro es por el tiempo que esta dura, 
//		de tal forma que los primeros cinco minutos cuestan 1 euro, 
//		los siguientes tres, 80 céntimos, los siguientes dos minutos a 70 céntimos 
//		y a partir del décimo minuto, 50 céntimos. 
//		Además, se carga un impuesto de 3% cuando es domingo, 
//		y si es otro día, en turno de mañana 15% y en turno de tarde 10%.
//		Realiza un algoritmo para determinar cuánto debe pagar por cada concepto 
//		una persona que realiza una llamada.

		Scanner entrada = new Scanner(System.in);

		int minutos;
		double costeLlamada = 0, costetotalLlamada = 1;
		String turno, dia;

		System.out.println("¿Cuánto dura la llamada?");
		minutos = entrada.nextInt();
		System.out.println();

		System.out.println("¿Qué día se está realizando la llamada?");
		dia = entrada.next();
		System.out.println();

		// los primeros cinco minutos cuestan 1 euro,
		if (minutos <= 5) {
			costeLlamada = minutos * 1;

			// los siguientes tres, 80 céntimos :7.4
		} else if (minutos > 5 && minutos <= 8) {
			costeLlamada = 5 + ((minutos - 5) * 0.80);

			// los siguientes dos minutos a 70 céntimos :8.8
		} else if (minutos > 5 && minutos < 10) {
			costeLlamada = 5 + 2.4 + ((minutos - 8) * 0.70);
			// a partir del décimo minuto, 50 céntimos.
		} else if (minutos > 10) {
			costeLlamada = 5 + 2.4 + 0.7 + ((minutos - 10) * 0.50);
		}

		// otro día, en turno de mañana 15% y en turno de tarde 10%
		if (dia == "lunes" || dia == "martes" || dia == "miercoles" || dia == "jueves" || dia == "viernes"
				|| dia == "sabado") {
			System.out.println("¿En qué turno estás llamando? MAÑANA / TARDE");
			turno = entrada.nextLine();
			if (turno == "TARDE") {
				costetotalLlamada = (costeLlamada * 0.10) + costeLlamada;
			} else if (turno == "MAÑANA") {
				costetotalLlamada = (costeLlamada * 0.15) + costeLlamada;
			} else {
				System.out.println("Has puesto un turno erróneo");
			}
			// se carga un impuesto de 3% cuando es domingo
		} else if (dia == "domingo") {
			costetotalLlamada = (costeLlamada * 0.03) + costeLlamada;
		}
		System.out.println("Se pagará el monto total de : "+costetotalLlamada);
		entrada.close();
	}

}
