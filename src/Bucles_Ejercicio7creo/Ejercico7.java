package Bucles_Ejercicio7creo;

import java.util.Scanner;

public class Ejercico7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int suma=0;
		float promedio=0;
		
		System.out.println("Cuantos alumnos hay?");
        String Nota= scan.nextLine();
        int nota = Integer.parseInt(Nota);
        int[] notas=new int[nota];
        for(int i=0;i<nota;i++){
            notas[i]=scan.nextInt();
            suma+=notas[i];
        }
        promedio= (float) suma/nota;
        int mayores=0;
        System.out.println("Las notas ingresadas son:");
        for(int i=0;i<nota;i++){
            System.out.print(notas[i]+" ");
            if(notas[i]>promedio){
                mayores++;
            }
        }
        System.out.println("\nEl promedio es:\n"+promedio);
        System.out.println("El número de notas mayores al promedio es:\n"+mayores);
	}

}
