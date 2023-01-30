package ppp;

public abstract class Auto {
	
	//Atributos
	String color;
	String modelo;
	String fabricante;
	Integer velocidad;
	Double peso;
	
	
	//Constructores
	
	public Auto() {}
	
	public Auto(String color, String modelo, Double peso) {
		this.color=color;
		this.modelo=modelo;
		this.peso=peso;
		
	}
	
	//comportamiento
	
	public void acelerar(Integer cantidad)
	{
		if(cantidad < 0 && cantidad > 120)
		{
			this.velocidad += cantidad;
		}
	}
	
	

}
