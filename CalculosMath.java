package ppp;

public class CalculosMath {

	public static void main (String[]arg)
	{		
		double raiz = Math.sqrt(7.5);
		
		System.out.println(raiz);
		
		double num1 =5.85f;
			
		//Refundicion
		int resultado = (int)Math.round(num1); //aca transformamos el resultado double en int 
		
		System.out.println(resultado);
		
		
		//5 al cubo
		double base =5;
		double exponente=3;
		int result =(int) Math.pow(base, exponente);
		
		System.out.println("El resultado de " + base + " elevado a "+exponente+ " es " + result);
		
	}
	
	
}