package eggcooperation;

import eggcooperation.entidad.Cuenta;
import eggcooperation.servicio.CuentaServicio;

public class Main {

	public static void main(String[] args) {
		CuentaServicio cuentaServicio = new CuentaServicio();

        Cuenta cuenta = cuentaServicio.crearCuenta();
        cuentaServicio.consultarDatos(cuenta);
        cuentaServicio.ingresar(cuenta, 100000);   
        cuentaServicio.consultarSaldo(cuenta);        
        cuentaServicio.retirar(cuenta, 400000);
        cuentaServicio.consultarSaldo(cuenta);
        cuentaServicio.extraccionRapida(cuenta, 20000);
        cuentaServicio.extraccionRapida(cuenta, 60000);
        cuentaServicio.consultarSaldo(cuenta);
        cuentaServicio.consultarDatos(cuenta);

	}

}
