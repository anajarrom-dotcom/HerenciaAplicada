package Principal;

import PrincipalEjercicios.CuentaCorriente;
import PrincipalEjercicios.Docente;
import PrincipalEjercicios.Estudiante;
import PrincipalEjercicios.ProductoPerecedero;

public class Main {

	public static void main(String[]args) {
		ejercicioUno();
		ejercicio2();
		ejercicio3();
	}
	//ejercicio1
	public static void ejercicioUno() {
		
		Docente docente = new Docente("Luis",35,"Matematica");
		Estudiante estudiante = new Estudiante("Juan", 20 ,32);
		
		System.out.println("Docente");
		docente.mostrar();
		System.out.println("  ");
		System.out.println("Estudiante");
		estudiante.mostrar();
	}
	//ejercicio2
	public static void ejercicio2() {
	
		CuentaCorriente c =  new CuentaCorriente(500,200);
		
		
		c.retirar(1000);
		c.depositar(600);
		c.mostrarSaldo();
	}
	//ejercicio3
	public static void ejercicio3() {
		
		ProductoPerecedero producto = new ProductoPerecedero("Arroz", 20, 20260414);
		
		
		System.out.println("Vencimiento:" +  producto.estaVencido());
	}
	}







//	Ejemplo practico
//import PrincipalEjercicios.CuentaAhorro;
//public static void ejercicioPractico() {
	
	//CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05);
	
	//cuenta.depositar(500);
	//cuenta.retirar(3000);
	//ejercicioPractico();
