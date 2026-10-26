package ud3.ListadoEj2;

import java.util.Scanner;

public class Ej2_SueldoMedio {
	// Crea un algoritmo que calcule el sueldo medio de un grupo de 20 trabajadores.
	
	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		
		double sueldo1=0,sueldo2=0,sueldo3=0,sueldo4=0,sueldo5=0, media; 
		
		System.out.println("Indicame el sueldo del primer trabajador");
		sueldo1=entrada.nextDouble();
		
		System.out.println("Indicame el sueldo del segundo trabajador");
		sueldo2=entrada.nextDouble();

		System.out.println("Indicame el sueldo del tercer trabajador");
		sueldo3=entrada.nextDouble();
		
		System.out.println("Indicame el sueldo del cuarto trabajador");
		sueldo4=entrada.nextDouble();
		
		System.out.println("Indicame el sueldo del quinto trabajador");
		sueldo5=entrada.nextDouble();
		
		if(sueldo1>100 && sueldo1<2000 && sueldo2>100 && sueldo2<2000 && sueldo3>100 && sueldo3<2000 && sueldo4>100 && sueldo4<2000 && sueldo5>100 && sueldo5<2000) {
			
			media=(sueldo1+sueldo2+sueldo3+sueldo4+sueldo5)/5;
			System.out.println("La media de los sueldos de los 5 trabajadores es: "+media);

		}else {
			System.out.println("Has puesto cantidades erróneas");
		}
		
		
		
		
		
	
		
		
		
		entrada.close();
	}

}
