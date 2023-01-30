package Interface;

import Autos.Auto;

public interface InterfaceMain {
	public static void main (String[] args) {
		
		AutoService service1 = new AutoServiceSportImp();
		AutoService service2 = new AutoServiceClassicImp();
		
		Auto auto1 = service1.crearAutoDemo();
		Auto auto2 = service2.crearAutoDemo();
		
		
	}

}
