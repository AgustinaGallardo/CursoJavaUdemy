package ppp;

public class Funciones {
	
	public static void main(String[] args) {
		
		holaMundo();
		holaMundo(4);
		holaMundo("agsutina");
		
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
	
	private static void holaMundo(String name) {
		System.out.println("Hola " + name);
	}
	
     private static void holaMundo(Integer number) {
		System.out.println("El numero es: " + number);
	}
	
	private static void holaMundo(String name, String surname) {
		System.out.println("Hola" + name + " "+ surname);
	}
	
	private static int sum(int num1, int num2) {
		return num1 + num2;
	}

}
