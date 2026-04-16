package PrincipalEjercicios;

public class Bus extends Transporte{
	
	private String ruta;

	public Bus(int capacidad, String ruta) {
		super(capacidad);
		this.ruta = ruta;
	}

	@Override
	public String descripcion() {
		return super.descripcion() + " " +"Ruta:" + ruta;
	}
}
