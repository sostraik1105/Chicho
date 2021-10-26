package examenIC_L.ejercicio1;

import javax.swing.JOptionPane;

public class ejercicio1 {

	public static void main(String[] args) {
		
		String A,B,C,D;
		double a,b,c,d,e;
		
		
		A = JOptionPane.showInputDialog("Escriba el valor de a: ");
		
		a = Double.parseDouble(A);
		
		B = JOptionPane.showInputDialog("Escriba el valor de b: ");
		
		b = Double.parseDouble(B);
		
		C = JOptionPane.showInputDialog("Escriba el valor de c: ");
		
		c = Double.parseDouble(C);
		
		D = JOptionPane.showInputDialog("Escriba el valor de d: ");
		
		d = Double.parseDouble(D);
		
		// si alguno de estos valores es 0, no se puede hacer la operacion
		if(a+b == 0 || c == 0 || d == 0) {
			
			JOptionPane.showMessageDialog(null, "No se pudo realizar la operacion");
		
		}else { // y si todos son correctos, te muestra el resultado
			
			e = ((a*b*c)/(a+b)) + ( (Math.pow(a,2) - b)/(c/d));
			
			JOptionPane.showMessageDialog(null, e);
			
		}
		
		
		
		
		
		

	}

}
