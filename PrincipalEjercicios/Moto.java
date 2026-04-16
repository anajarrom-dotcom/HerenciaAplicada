package PrincipalEjercicios;

public class Moto extends Vehiculo{

	private int cilidrada;

	public Moto(String marca, int velocidad, int cilidrada) {
		super(marca, velocidad);
		this.cilidrada = cilidrada;
	}
@Override
public String mostrarInfo() {
	return super.mostrarInfo() + " " + "Cilindrada: " + cilidrada;
}
	
	}
	
	

