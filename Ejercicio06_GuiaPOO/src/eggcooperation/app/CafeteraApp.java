package eggcooperation.app;

import eggcooperation.entidad.Cafetera;
import eggcooperation.servicio.CafeteraService;

public class CafeteraApp {

	public static void main(String[] args) {
		Cafetera cafetera = new Cafetera(500, 250);
        CafeteraService cafeteraService = new CafeteraService();

        System.out.println("Capacidad máxima: " + cafetera.getCapacidadMaxima());
        System.out.println("Cantidad actual: " + cafetera.getCantidadActual());

        cafeteraService.llenarCafetera(cafetera);
        System.out.println("Cantidad actual después de llenar la cafetera: " + cafetera.getCantidadActual());

        cafeteraService.servirTaza(cafetera, 200);
        System.out.println("Cantidad actual después de servir una taza: " + cafetera.getCantidadActual());

        cafeteraService.vaciarCafetera(cafetera);
        System.out.println("Cantidad actual después de vaciar la cafetera: " + cafetera.getCantidadActual());

        cafeteraService.agregarCafe(cafetera, 300);
        System.out.println("Cantidad actual después de agregar café: " + cafetera.getCantidadActual());       		

	}

}
