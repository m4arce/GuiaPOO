package eggcooperation.main;

import java.util.Scanner;

import eggcooperation.entidad.NIF;
import eggcooperation.servicio.NIFService;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Crear objeto NIF
		NIF nif = new NIF();

		// Crear objeto NIFService
		NIFService nifService = new NIFService();

		// Solicitar al usuario el número de DNI
		System.out.print("Ingrese el número de DNI: ");
		long dni = scanner.nextLong();
		
		scanner.close();

		// Asignar el número de DNI al objeto NIF
		nif.setNumeroDNI(dni);

		// Calcular y asignar la letra correspondiente al objeto NIF utilizando el
		// servicio
		nifService.crearNif(nif, dni);

		// Mostrar el NIF utilizando el servicio
		nifService.mostrar(nif);

	}

}
