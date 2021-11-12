package BuclesRepetitivos;

import javax.swing.JOptionPane;

public class Teoria {

	public static void main(String[] args) {
		// contador = iterador
		
		/*
		int conta = 0;
		conta = conta + 1; //Nuevo valor del contador = valor actual del conta + 1
		conta += 1;
		conta++;
		*/
		
		/*
		// (valor inicial; valor maximo; razon de uno)
		int contador;
		for(contador = 0; contador<10; contador++) {
			System.out.println(contador);
		}
		*/
		
		/*		
		
		for (int i = 0; i <= 10; i++) {
			
			// % = residuo
			
			// primero, i se divide entre 2
			// i/2 te va a dar un residuo (R)
			// si R==0
			if(i % 2 == 0) {
				System.out.println(i);				
			} else {
				System.out.println("soy " + i + " y no soy multiplo de 2");
			}
			
		}
		*/
		double promedio;
		double suma=0;
		double maximo=Double.MIN_VALUE;
		double minimo=Double.MAX_VALUE;
		double ingreso=0, conta=0;
		
		
		
		for (int i = 0; i < 10; i++) {
			
			ingreso = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero"));
			suma = suma + ingreso;

			if(minimo > ingreso) {
				minimo = ingreso;
			}
			
			if(maximo < ingreso) {
				maximo = ingreso;
			} 
			
			
			
			
		}
		
		promedio = (suma/10.0);
		JOptionPane.showMessageDialog(null, "El promedio es: " + promedio + " \nEl máximo es: " + maximo + "\nEl minimo es: " + minimo);
		
	}
	
	
}
