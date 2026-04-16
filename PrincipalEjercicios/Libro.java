package PrincipalEjercicios;

public class Libro {

	private String titulo;
	private String autor;
	
	public Libro(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}
	public String mostrarInfo() {
		return "Titulo: " + titulo + " Autor: "+ autor;
	}
	
}
