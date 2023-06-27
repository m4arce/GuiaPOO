package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Cuenta;

public class CuentaServicio {
	
	
	    public Cuenta crearCuenta() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el número de cuenta: ");
	        int numeroCuenta = scanner.nextInt();

	        System.out.println("Ingrese el DNI del cliente: ");
	        long DNI = scanner.nextLong();

	        System.out.println("Ingrese el saldo actual: ");
	        int saldoActual = scanner.nextInt();
	        
	        scanner.close();

	        return new Cuenta(numeroCuenta, DNI, saldoActual);
	    }

	    public void ingresar(Cuenta cuenta, double ingreso) {
	        cuenta.setSaldoActual((int) (cuenta.getSaldoActual() + ingreso));
	    }

	    public void retirar(Cuenta cuenta, double retiro) {
	        if (retiro <= cuenta.getSaldoActual()) {
	            cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - retiro));
	        } else {
	            cuenta.setSaldoActual(0);
	        }
	    }

	    public void extraccionRapida(Cuenta cuenta, double retiro) {
	        double limite = cuenta.getSaldoActual() * 0.2;

	        if (retiro <= limite) {
	            cuenta.setSaldoActual((int) (cuenta.getSaldoActual() - retiro));
	            System.out.println("Se ha retirado el dinero exitosamente de forma Rápida por el monto de: " + Math.floor(retiro));
	        } else {
	        	System.out.println("El retiro no puede superar el 20% de su saldo");
	        }
	    }

	    public void consultarSaldo(Cuenta cuenta) {
	        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
	    }

	    public void consultarDatos(Cuenta cuenta) {
	        System.out.println("Número de cuenta: " + cuenta.getNumeroCuenta());
	        System.out.println("DNI del cliente: " + cuenta.getDNI());
	        System.out.println("Saldo actual: " + cuenta.getSaldoActual());
	    }
	}



