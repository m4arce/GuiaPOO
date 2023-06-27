package eggcooperation.main;

import eggcooperation.entidad.Movil;
import eggcooperation.servicio.MovilService;

public class MainApp {

	public static void main(String[] args) {
		MovilService movilService = new MovilService();
        Movil movil = movilService.crearMovil();

        System.out.println("\nInformación del móvil:");
        System.out.println("Marca: " + movil.getMarca());
        System.out.println("Precio: " + movil.getPrecio());
        System.out.println("Modelo: " + movil.getModelo());
        System.out.println("Memoria RAM: " + movil.getMemoriaRam());
        System.out.println("Almacenamiento: " + movil.getAlmacenamiento());
        System.out.print("Código: ");
        int[] codigo = movil.getCodigo();
        for (int i = 0; i < codigo.length; i++) {
            System.out.print(codigo[i]);
        }

	}

}
