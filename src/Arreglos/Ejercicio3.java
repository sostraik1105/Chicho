package Arreglos;

public class Ejercicio3 {

	public static void main(String[] args) {
		
		int numeros[] = {1, 2, 3, 4, 5};
		
		int nInvertido[] = new int[numeros.length];
		
		/*
		 	nInvertido => vas a tener numeros.length (en este caso, 5)
		 	
		 	[0] = _
		 	[1] = _
		 	[2] = _
		 	[3] = _
		 	[4] = _
		 	
		*/
		
		int j = 0;
		
		for(int i = numeros.length; i > 0; i--) {
			nInvertido[j] = numeros[i-1];
			j++;
		}
		
		for (int k = 0; k < nInvertido.length; k++) {
			System.out.println(nInvertido[k]);
		}
		
	} 
}