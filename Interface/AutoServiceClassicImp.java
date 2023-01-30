package Interface;

import Autos.Auto;
import Autos.AutoElectrico;

public class AutoServiceClassicImp implements AutoService{

	@Override
	public Auto crearAutoDemo() {
		System.out.println("creando Coche clasico");
		return new AutoElectrico();
	}

	@Override
	public void DestruirAuto(Auto auto) {
		System.out.println("Destruyendo auto");
		
	}

}
