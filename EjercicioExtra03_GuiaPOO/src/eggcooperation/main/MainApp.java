package eggcooperation.main;

import java.util.Scanner;

import eggcooperation.entidad.Raices;
import eggcooperation.servicio.RaicesService;

public class MainApp {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese el coeficiente c: ");
        double c = scanner.nextDouble();

		scanner.close();

        Raices raices = new Raices(a, b, c);
        RaicesService raicesService = new RaicesService();
        raicesService.calcular(raices);

	}

}
