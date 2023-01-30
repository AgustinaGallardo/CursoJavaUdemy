package Interface;

import Autos.Auto;
import Autos.AutoHibrido;

public class AutoServiceSportImp implements AutoService{

	@Override
	public Auto crearAutoDemo() {
		System.out.println("creando Coche de carreras");
		return new AutoHibrido();
	}

	@Override
	public void DestruirAuto(Auto auto) {
		System.out.println("Destruyendo auto");
		
	}

}
