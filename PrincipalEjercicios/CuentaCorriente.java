package PrincipalEjercicios;

public class CuentaCorriente extends Cuentas{
	
private double limite;

public CuentaCorriente(double saldo, double limite) {
	super(saldo);
	this.limite = limite;
}
@Override
public void retirar(double monto) {
	if(saldo + limite >= monto) {
		saldo -= monto;
	}else {
		System.out.println("Supera el limite de sobregiro.");
	}
}
}
