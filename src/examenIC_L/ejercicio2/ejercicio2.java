package examenIC_L.ejercicio2;

import javax.swing.JOptionPane;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String A;
		double a,b,e;
		
		// vamos a Reemplazar (A)...
		A = JOptionPane.showInputDialog("Escriba el valor de a: ");
		
		a = Double.parseDouble(A);
		
		// quedaría así
		// a = Double.parseDouble(JOptionPane.showInputDialog("Escriba el valor de a: "));

		// ahora hacemos lo mismo para el b
		b = Double.parseDouble(JOptionPane.showInputDialog("Escriba el valor de b: "));
		
		e = Math.pow(a, 7) + Math.pow(a+(b*b), 4) + (Math.sqrt(2+b)/((a*a)+(b*b))); 
	
		JOptionPane.showMessageDialog(null, e);
	}

}
