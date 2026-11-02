package ud3.ListadoEj2;

import java.util.Scanner;

public class Ej9_conteo10 {

	public static void main(String[] args) {
//		
//		Realiza un programa que lea una secuencia de notas 
//		(con valores que van de 0 a 10) 
//		que termina con el valor -1 y nos dice si hubo o no alguna nota con valor 10.

		Scanner entrada=new Scanner(System.in);
		int notas, cont=0; 
		
		
		System.out.println("Indicame las notas solo con valores de 0 a 10: ");
		
		for(int i=0; i<10; i++) {
			notas=entrada.nextInt();
			if(notas==10) {
				cont++;
			}else if(notas>=0 && notas<=10){
				i--;
			}else if(notas==-1) {
				i=10;
			}else {
				System.out.println("Has puesto un número erróneo");
				i--;
				System.out.println("Vuelve a poner otra nota");
			}
		
		}
		
		System.out.println("Has puesto en total: "+cont+" 10's");
		
		entrada.close();
	}
}
