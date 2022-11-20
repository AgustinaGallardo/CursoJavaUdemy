package ppp;

public class ConstantesOperadores {
	
	public static void main(String[] arg)
	{
		int a =3;
		int b = 10;
		int c = a+b;
		c++;
		c++;
		c+=5;
		c-=7;
		final double d = c/3;
		
		System.out.println("El valor final de c es " + c + " y el valor de d es: " + d);
	
	    final double dolar = 305;
	
	    double pesos = 100;
	    double result = pesos/dolar;
	
     	System.out.println("Los " + pesos + " pesos se transforman en " + pesos/dolar + " dolares," + " sino tmb en variable result: " + result + " dolares. UNA MISERIA");
	
        int num1, num2, resultado;
        num1=5;
        num2=5;
        resultado = num1+num2;
        System.out.println(resultado);
	
	}

}
