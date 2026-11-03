package ud3.ListadoEj3;

public class Eje15_suma3y21 {

	public static void main(String[] args) {
		//Obtener la suma de todos los números impares entre 
		//3 y 21 exceptuando el 13 y el 17. 

		
		int suma = 0, resultado = 0;
		
		for(int i=3;i<=21;i++) {
			suma=suma+i;
			resultado=suma-17-(13);
			
		} System.out.println(resultado);
	}

}
