package eggcooperation;

import eggcooperation.entidad.Cuenta;

public class Main {

	public static void main(String[] args) {

		/*
		 * Cuenta cuenta1 = new Cuenta(12345, 1234567890, 400000);
		 * cuenta1.ingresar(100000); cuenta1.retirar(400000);
		 * cuenta1.extraccionRapida(20000); cuenta1.extraccionRapida(50000);
		 * cuenta1.consultarSaldo(); cuenta1.consultarDatos();
		 */

		
		  Cuenta cuenta2 = new Cuenta();
		  
		  cuenta2.crearCuenta(); cuenta2.consultarDatos(); cuenta2.ingresar(100000);
		  cuenta2.consultarSaldo(); cuenta2.retirar(400000); cuenta2.consultarSaldo();
		  cuenta2.extraccionRapida(20000); cuenta2.extraccionRapida(50000);
		  cuenta2.consultarSaldo(); cuenta2.consultarDatos();
		 
		
	}
}
