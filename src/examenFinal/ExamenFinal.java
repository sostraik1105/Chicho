package examenFinal;

import javax.swing.JOptionPane;

public class ExamenFinal {

	public static void main(String[] args) {
		
		int num, random;
		
		random = 6;
		
		num = Integer.parseInt(JOptionPane.showInputDialog("Elije un número entero entre el 0 y el 100"));
		
		
		while(num>100 || num<0) {
			num = Integer.parseInt(JOptionPane.showInputDialog("El valor no esta permitido, intentelo nuevamente"));
		}
		
		while(num != random) {
			if(num > random) { //(condicion)
				num = Integer.parseInt(JOptionPane.showInputDialog("Vamos, el número es menor, intentalo nuevamente"));
				while(num>100 || num<0) {
					num = Integer.parseInt(JOptionPane.showInputDialog("El valor no esta dentro de los permitidos, intentelo nuevamente"));
				}
			} else{
				num = Integer.parseInt(JOptionPane.showInputDialog("Vamos, el número es mayor, intentalo nuevamente"));
				while(num>100 || num<0) {
					num = Integer.parseInt(JOptionPane.showInputDialog("El valor no esta dentro de los permitidos, intentelo nuevamente"));
				}
			} //~(condicion)
			
		}
		
		if (num == random) {
			JOptionPane.showMessageDialog(null, "Felicitaciones!! Encontraste el número");
		}
	}

}
