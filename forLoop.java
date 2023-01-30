package ppp;

public class forLoop {
	public static void main (String[]arg)
	{		
		for(int i = 0;i<=10;i++ )
		{
			if(i == 6)
			{
				continue;
			}
			System.out.println(i + " Hola mundo");
		}
		
		System.out.println("Fin");
		
		
	}
}
