package ppp;

public class PolimorfismoMain {
	
	public static void main (String[] args) {
		
		Auto coche1 = new Auto();
		AutoElectrico coche2 = new AutoElectrico();
		AutoHibrido coche3 =new AutoHibrido();
		
	//polimorfismo
		
		Auto coche4 = new AutoElectrico();
		
		
		if(coche4 instanceof Auto )
		{
			System.out.println("Es un auto");
			
		}
		if(coche4 instanceof AutoElectrico)
		{
			System.out.println("Es un auto electrico");
		}
		if(coche4 instanceof AutoHibrido)
		{
			System.out.println("Es un auto Hibrido");
		}
		
		
		
	}

}
