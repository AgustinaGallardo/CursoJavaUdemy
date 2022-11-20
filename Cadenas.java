package ppp;

public class Cadenas {
	
	public static void main (String[]arg)
	{
		String nombre = "Alfonsina Storni";
		
		System.out.println("Mi nombre es "+nombre);
		System.out.println("Mi nombre tiene "+nombre.length() +" letras");		
		System.out.println("La primera letra de " + nombre + " es " + nombre.charAt(0));
		
		int UltimaLetra = nombre.length();
		
		System.out.println("La ultima letra de " + nombre + " es " + nombre.charAt(UltimaLetra-1));;
	
	
	}

}
