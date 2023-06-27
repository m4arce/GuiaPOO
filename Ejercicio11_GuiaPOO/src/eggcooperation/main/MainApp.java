package eggcooperation.main;

import java.util.Date;
import java.util.Scanner;

public class MainApp {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		// Obtener los valores de d�a, mes y a�o del usuario
		Scanner scanner = new Scanner(System.in);

		System.out.print("Ingrese el d�a: ");
		int dia = scanner.nextInt();
		System.out.print("Ingrese el mes: ");
		int mes = scanner.nextInt();
		System.out.print("Ingrese el a�o: ");
		int anio = scanner.nextInt();

		// Crear la fecha utilizando la clase Date
		Date fecha = new Date(anio - 1900, mes - 1, dia);

		// Mostrar la fecha ingresada
		System.out.println("Fecha ingresada: " + fecha);

		// Obtener la fecha actual
		Date fechaActual = new Date();

		// Calcular la diferencia de a�os entre la fecha ingresada y la fecha actual
		int aniosDiferencia = calcularDiferenciaAnios(fecha, fechaActual);

		// Mostrar la diferencia de a�os
		System.out.println("Diferencia de a�os: " + aniosDiferencia);
		
		scanner.close();

	}

	@SuppressWarnings("deprecation")
	public static int calcularDiferenciaAnios(Date fecha1, Date fecha2) {
		int anio1 = fecha1.getYear();
		int anio2 = fecha2.getYear();
		return anio2 - anio1;

	}

}
