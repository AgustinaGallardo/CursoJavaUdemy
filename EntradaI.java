import java.util.*;

public class EntradaI {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese su nombre");
		
		String NombreUsuario = entrada.nextLine();
		
		System.out.println("Ingrese su edad");			
		
		int Edad = entrada.nextInt(); 
		
		System.out.println("Hola " + NombreUsuario + " el año que viene vas a tener " 
		+ (Edad+1) + " años, un MONTON, disfruta todo lo que puedas!!");

	}

}
