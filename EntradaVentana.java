package ppp;
import javax.swing.*;

public class EntradaVentana {

	public static void main(String[] args) {
		
		String NombreUsuario = JOptionPane.showInputDialog("Ingrese tu nombre");
		
		String edad = JOptionPane.showInputDialog("Ingrese su edad");
		
		int edadUsuario = Integer.parseInt(edad);
		
		edadUsuario ++;
		
		System.out.println("Hola " + NombreUsuario + " el año que viene tendras " 
				 + edadUsuario + " años, Disfrutalos!");

	}

}
