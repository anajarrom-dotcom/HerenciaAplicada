package PrincipalEjercicios;

public class Perro extends Animal{
@Override
	public void hacerSonido() {
		System.out.println("El perrro" + " " + nombre + " " + "ladra");
	}

	public Perro(String nombre) {
		super(nombre);
	}
}
