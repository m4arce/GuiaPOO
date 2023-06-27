package eggcooperation.servicio;

import eggcooperation.entidad.Cafetera;

public class CafeteraService {

	public void llenarCafetera(Cafetera cafetera) {
		cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
	}

	public void servirTaza(Cafetera cafetera, int tamanoTaza) {
		if (cafetera.getCantidadActual() >= tamanoTaza) {
			cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanoTaza);
			System.out.println("Se ha llenado la taza.");
		} else {
			System.out.println("No se pudo llenar la taza completamente. Quedó con " + cafetera.getCantidadActual()
					+ " unidades de café.");
			cafetera.setCantidadActual(0);
		}
	}

	public void vaciarCafetera(Cafetera cafetera) {
		cafetera.setCantidadActual(0);
	}

	public void agregarCafe(Cafetera cafetera, int cantidadCafe) {
		cafetera.setCantidadActual(cafetera.getCantidadActual() + cantidadCafe);
		if (cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
			cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
		}
	}

}
