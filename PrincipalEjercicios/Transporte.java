package PrincipalEjercicios;

public class Transporte {
	
	private int capacidad;

	public Transporte(int capacidad) {
		super();
		this.capacidad = capacidad;
	}
	
public String descripcion() {
		return "Capacidad del bus:" + capacidad;
	}
}
