package Autos;

//herencia

public class AutoElectrico extends Auto{
	
	String motorElectrico;
	
	public AutoElectrico() {
		
	}
	
public AutoElectrico(String motorElectrico) {
	this.motorElectrico=motorElectrico;
		
	}
	
	public AutoElectrico(String color, String modelo, Double peso,String motorElectrico) {
		super(color,modelo,peso); //metodo super, que asigna los atributos de la clase padre
		this.motorElectrico=motorElectrico;			
		}

@Override
public String toString() {
	return "El coche" + color + ", con un peso de " + peso + " de motor " 
			+ motorElectrico; 
}


//subreescritura de un constructor
@Override
public void acelerar(Integer cantidad) {
	Integer cantidadAjustada = (cantidad*2);
	super.acelerar(cantidadAjustada);
}
	
	

}
