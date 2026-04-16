package PrincipalEjercicios;

public class Cuenta {

	protected double saldo;
	
	public Cuenta(double saldo) {
		this.saldo = saldo;
	}
	public void depositar(double monto) {
		saldo = saldo + monto;
	}
	public void retirar(double monto) {
		saldo = saldo - monto;
	}
}
