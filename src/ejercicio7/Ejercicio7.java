package ejercicio7;

import javax.swing.JOptionPane;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		/*
		 	se ingresa por teclado el radio y la altura de 
		 	un cilindro. Calcular el area y el volumen
		 	de dicho cilindro
		*/
		
		String radio,  altura;
		
		double areaTotal, Radio, Altura, volumen, suma;
		
		double pi = 3.1416;
		
		// TEXTORADIO
		radio = JOptionPane.showInputDialog("¿Cuánto vale el radio?");
		
		// TEXTORADIO CONVERTIDO A DECIMALES
		Radio = Double.parseDouble(radio);
		
		
		// TEXTOALTURA
		altura = JOptionPane.showInputDialog("¿Cuánto vale el altura?");
		
		// TEXTOALTURA CONVERTIDO A DECIMALES
		Altura = Double.parseDouble(altura);
		
		volumen = pi * Math.pow(Radio, 2) * Altura;
		
		//volumen = pi * (Radio * Radio) * Altura;
		
		areaTotal = 2 * pi * Radio * (Radio + Altura);
		
		
		// MOSTRAMOS EN CUADRO
		JOptionPane.showMessageDialog(null, "El volumen del cilindro es " + volumen + " metros cúbicos");
		
		JOptionPane.showMessageDialog(null, "El área total del cilindro es " + areaTotal + " metros cuadrados");
		
		
	
		
		
		
		
		
		

	}

}
