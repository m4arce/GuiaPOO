package eggcooperation.servicio;

import eggcooperation.entidad.NIF;

public class NIFService {
	
	// M�todo crearNif
    public void crearNif(NIF nif, long dni) {
        // Calcular la letra correspondiente al n�mero de DNI
        int resto = (int) (dni % 23);
        char[] tablaLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        char letraCalculada = tablaLetras[resto];

        // Asignar la letra calculada al atributo letra del objeto NIF
        nif.setLetra(String.valueOf(letraCalculada));
    }

    // M�todo mostrar
    public void mostrar(NIF nif) {
        System.out.println(String.format("%08d-%s", nif.getNumeroDNI(), nif.getLetra()));
    }

}
