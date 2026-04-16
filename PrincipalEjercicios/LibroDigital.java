package PrincipalEjercicios;

public class LibroDigital extends Libro{
	
	private int tamanoenMB;

	public LibroDigital(String titulo, String autor, int tamanoenMB) {
		super(titulo, autor);
		this.tamanoenMB = tamanoenMB;
	}
	
	public String mostrarInfo() {
		return super.mostrarInfo() + " Tamano: " + tamanoenMB + "MB";
	}

	}
	
	


