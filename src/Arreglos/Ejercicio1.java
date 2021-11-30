package Arreglos;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		String nombres[] = {"Ian", "Michael"};
		String apellidos[] = {"Thorpe", "Phelps"};
		String procedencia[] = {"Australia", "Estados Unidos"};
		int edad[] = {39, 36};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Nombre: " + nombres[i] + " Apellidos: " + apellidos[i] + " Procedencia: " + procedencia[i] + " Edad: " + edad[i]);
		}
		

	}

}
