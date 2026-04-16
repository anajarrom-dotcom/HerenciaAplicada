package Principal;

import PrincipalEjercicios.CuentaAhorro;

public class Main {

	public static void main(String[]args) {
		
		ejercicioPractico();
	}
	
	public static void ejercicioPractico() {
		
		CuentaAhorro cuenta = new CuentaAhorro(1000, 0.05);
		
		cuenta.depositar(500);
		cuenta.retirar(3000);
		
	}
}
