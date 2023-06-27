package eggcooperation.main;

import eggcooperation.entidad.Puntos;
import eggcooperation.servicio.PuntosService;

public class MainApp {

	public static void main(String[] args) {
		
		PuntosService ps = new PuntosService();
		Puntos p = ps.crearPuntos();		

		System.out.println("La distancia entre los 2 puntos es de: " + ps.calcularDistancia(p));

	}

}
