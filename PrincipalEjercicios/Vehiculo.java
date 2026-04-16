package PrincipalEjercicios;

public class Vehiculo {
	
	protected String marca;
	protected int velocidad;
	
	public Vehiculo(String marca, int velocidad) {
		super();
		this.marca = marca;
		this.velocidad = velocidad;
	}
	public String mostrarInfo() {
		return "Marca: " + marca + " " + "Velocidad " + velocidad;
	}

}
