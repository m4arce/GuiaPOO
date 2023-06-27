package eggcooperation.entidad;

public class Cuenta {

	private int numeroCuenta;
	private long DNI;
	private int saldoActual;

	public Cuenta() {
	}

	public Cuenta(int numeroCuenta, long DNI, int saldoActual) {
		this.numeroCuenta = numeroCuenta;
		this.DNI = DNI;
		this.saldoActual = saldoActual;
	}

	// M�todos getters y setters

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDNI() {
		return DNI;
	}

	public void setDNI(long DNI) {
		this.DNI = DNI;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}
}
