package ppp;

public class AutoMain {
	
	public static void Main (String[] args) {
		
		String auto = "Peugeot";
		Auto objetoAuto = new Auto();
		
		Auto objetoAuto2 = new Auto ("azul","208",9099.99);
		
		objetoAuto2.acelerar(50);
		
		System.out.println(objetoAuto2);
			
		
		AutoElectrico autoElectrico = new AutoElectrico();
		
		autoElectrico.acelerar(50);
		autoElectrico.color = "rojo";
		
		System.out.println(autoElectrico);
		
		
	}
		

}
