package ppp;
import javax.swing.*;

public class EntradaNumeros {
	
	public static void main (String[] args) {
		
		//double x = 111.1;		
		//System.out.printf("%1.2f", x/3);
		
		String num1 = JOptionPane.showInputDialog("Ingrese un numero");
		
		double num2 = Double.parseDouble(num1); 
		
		System.out.print("La raiz de " + num2 + " es ");
		
		System.out.printf("%1.4", Math.sqrt(num2));
		
		
	}
	

}
