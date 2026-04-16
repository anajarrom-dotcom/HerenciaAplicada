package Principal;

import PrincipalEjercicios.Bus;
import PrincipalEjercicios.CuentaCorriente;
import PrincipalEjercicios.Docente;
import PrincipalEjercicios.Estudiante;
import PrincipalEjercicios.Gerente;
import PrincipalEjercicios.ProductoPerecedero;
import PrincipalEjercicios.Perro;

public class Main {

	public static void main(String[]args) {
		ejercicioUno();
		ejercicio2();
		ejercicio3();
		ejercicio4();
		ejercicio5();
		ejercicio6();
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
	//ejercicio4
	public static void ejercicio4() {
		
		Bus bus = new Bus(200, " Inter-Ameria");
		System.out.println(bus.descripcion());
	}
	//ejercicio5
	public static void ejercicio5() {
		
		Gerente gerente = new Gerente("Lucas", 10000,1500);
		
		System.out.println("Nombre:" + gerente.getNombre());
		System.out.println("Salario:" + gerente.calcularSalario());
	
	}
	//ejercicio6
	public static void ejercicio6() {
		
		Perro p = new Perro("Charly");
		p.hacerSonido();
	}
	}







//	Ejemplo practico
//import PrincipalEjercicios.CuentaAhorro;
//public static void ejercicioPractico() {
	
	//CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05);
	
	//cuenta.depositar(500);
	//cuenta.retirar(3000);
	//ejercicioPractico();
