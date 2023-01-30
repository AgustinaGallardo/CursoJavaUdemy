package Autos;

public class AutoMain {
	
	public static void Main (String[] args) {
		
		//String auto = "Peugeot";
		
		//Auto objetoAuto = new AutoElectrico();
		
		Auto objetoAuto2 = new AutoElectrico ("azul","208",9099.99d,"motor");
		
		objetoAuto2.acelerar(50);
		
		System.out.println(objetoAuto2);
			
		
		AutoElectrico autoElectrico = new AutoElectrico();
		
		autoElectrico.acelerar(50);
		autoElectrico.color = "rojo";
		autoElectrico.fabricante = "Peugeot";
		autoElectrico.modelo = "300";
		autoElectrico.motorElectrico= "motor agua";
		autoElectrico.peso = 300.30d;
				
		
		
		System.out.println(autoElectrico);
		
		
	}
		

}
