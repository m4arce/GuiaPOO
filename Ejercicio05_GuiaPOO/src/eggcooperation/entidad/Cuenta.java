package eggcooperation.entidad;

import java.util.Scanner;

public class Cuenta {
	
	private int numeroCuenta;
	private long dniCliente;
	private int saldoActual;
	
	public Cuenta(int numeroCuenta, long dniCliente, int saldoActual) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.dniCliente = dniCliente;
		this.saldoActual = saldoActual;
	}

	public Cuenta() {
		super();
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(long dniCliente) {
		this.dniCliente = dniCliente;
	}

	public int getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(int saldoActual) {
		this.saldoActual = saldoActual;
	}	
	
	public void crearCuenta() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese numero de cuenta: ");
		numeroCuenta = sc.nextInt();
		
		System.out.println("Ingrese DNI Cliente: ");
		dniCliente = sc.nextLong();
		
		System.out.println("Ingrese saldo actual: ");
		saldoActual = sc.nextInt();
		
		sc.close();
	}
	
	public double ingresar(double ingreso) {
		
		saldoActual += ingreso;		
		
		return saldoActual;
		
	}
	
	public double retirar(double retiro) {
		
		if (saldoActual >= retiro) {
			
			saldoActual -= retiro;
			return saldoActual;
		}
		else {
			System.out.println("El saldo es insuficiente...");
			return saldoActual = 0;
		}		
		
	}
	
	public void extraccionRapida(double retiro) {		
		
		double limiteRetiro = saldoActual * 0.20;
		
		if (retiro <= limiteRetiro) {
			
			saldoActual -= retiro;	
			System.out.println("Se ha retirado el dinero exitosamente de forma Rápida");
		}
		else {
			System.out.println("El retiro no puede superar el 20% de su saldo");
		}		
	}
	
	public void consultarSaldo() {
		
		System.out.println("Su saldo es: " + saldoActual);
	}
	
	public void consultarDatos() {
		System.out.println("----DATOS CUENTA----");
		System.out.println("Numero de Cuenta: " + numeroCuenta);
		System.out.println("DNI Cliente: " + dniCliente);
		System.out.println("Saldo en cuenta: " + saldoActual);
	}	

}
