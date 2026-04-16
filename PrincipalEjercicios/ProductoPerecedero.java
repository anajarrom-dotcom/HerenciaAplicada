package PrincipalEjercicios;

public class ProductoPerecedero extends Producto{

	private int fechaVencimiento;

	
	public ProductoPerecedero(String nombre, double precio, int fechaVencimiento) {
		super(nombre, precio);
		this.fechaVencimiento = fechaVencimiento;
	}

	public boolean estaVencido() {
		int hoy = 20260416;
		return fechaVencimiento < hoy;
	}
}
