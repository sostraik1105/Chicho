package numerosPerfectos;

import javax.swing.JOptionPane;

public class NumerosPerfectos {

	public static void main(String[] args) {
		
		
		/*
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un n�mero"));
		
		int divisores = 0;
		
		for (int i = 1; i < numero; i++) {
			if(numero % i == 0) {
				divisores += i;
			}
		}
		
		if(numero == divisores) {
			JOptionPane.showMessageDialog(null, "Es un numero perfecto");
		} else {
			JOptionPane.showMessageDialog(null, "No es un numero perfecto");
		}
		
		*/
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de n�meros perfectos que quiere ver: "));
		
		// Cadena de texto para poder juntar mas numeros
		String numeros ="";
		
		double nPerfecto;
		
		for (int i = 0; i <= n ; i++) {
			nPerfecto = (Math.pow(2, i) - 1) * (Math.pow(2, i-1));
			
			//numeros = numeros + nPerfecto + "\n"
			numeros += nPerfecto + "\n";
		}
		
		JOptionPane.showMessageDialog(null, numeros);
	}

}
