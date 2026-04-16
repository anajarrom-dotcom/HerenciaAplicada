package PrincipalEjercicios;

public class Cuentas {

	protected double saldo;

	public Cuentas(double saldo) {
		super();
		this.saldo = saldo;
	}

	public void depositar(double monto) {
		saldo += monto;
	}
	
	public void retirar(double monto) {
		if (saldo >= monto) {
			saldo -= monto;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}

	public void mostrarSaldo() {
		System.out.println("Saldo:" + saldo);
	}
	}
	

