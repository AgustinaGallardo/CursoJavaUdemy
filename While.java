package ppp;

public class While {
	public static void main(String[] args) {
		
		int count = 0; 
		while(count < 10)
		{
			count ++; //Condicion
			if(count == 6)
			{
				//continue; //salta el valor 6 y continua la sig. iteracion
				break; //rompe el flujo de ejecucion
			}
			System.out.println("Hola mundo" + count);
			
			
		}
		System.out.println("FIN");
	}

}
