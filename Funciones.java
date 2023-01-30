package ppp;

public class Funciones {
	
	public static void main(String[] args) {
		
		holaMundo();
		
		String hola = devolverHola();
		System.out.println(hola);
		
	}

	public static String devolverHola() {
		
		return "hola";
	}

	public static void holaMundo() {
		System.out.println("HolaMundo");
		System.out.println("HolaMundo");
	}
	
	private static void holaMundo (String name) {
		System.out.println("HolaMundo" + name);
	}
	

}
