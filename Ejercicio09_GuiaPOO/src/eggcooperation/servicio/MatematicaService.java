package eggcooperation.servicio;

import eggcooperation.entidad.Matematica;

public class MatematicaService {
	
	public double devolverMayor(Matematica matematica) {
        return Math.max(matematica.getNumero1(), matematica.getNumero2());
    }

    public double calcularPotencia(Matematica matematica) {
        double mayor = Math.round(devolverMayor(matematica));
        double menor = Math.round(Math.min(matematica.getNumero1(), matematica.getNumero2()));
        return Math.pow(mayor, menor);
    }

    public double calcularRaiz(Matematica matematica) {
        double menor = Math.min(matematica.getNumero1(), matematica.getNumero2());
        double valorAbsoluto = Math.abs(menor);        
        return Math.sqrt(valorAbsoluto);
    }

}
