package ppp;

import java.util.Scanner;

public class Entrada {

	public static void main(String[] args) 
	{		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		
		String NombreUsuario = entrada.nextLine();
		
		System.out.println("Ingrese su edad");
		
		int edad = entrada.nextInt();
		
		System.out.println("Hola "+NombreUsuario+ " el año que viene cumplis "
		                     + (edad+1) + " años, Disfrutalos!!! mientras puedas bue q le pasaba");
		

	}

}
