package ppp;

//herencia

public class AutoElectrico extends Auto{
	
	String motorElectrico;
	
	public AutoElectrico() {
		
	}
	
public AutoElectrico(String motorElectrico) {
	this.motorElectrico=motorElectrico;
		
	}

@Override
public String toString() {
	return "El coche" + color + ", con un peso de " + peso + " de motor " 
			+ motorElectrico; 
}
	
	
	

}
