package eggcooperation.main;

import eggcooperation.entidad.Programa;
import eggcooperation.servicio.ProgramaService;

public class MainApp {

	public static void main(String[] args) {
		ProgramaService programaService = new ProgramaService();
		Programa programa = new Programa();

		// Inicializar y mostrar el arreglo A
		programaService.inicializarArregloA(programa);
		double[] arregloA = programa.getArregloA();
		System.out.println("Arreglo A (desordenado):");
		mostrarArreglo(arregloA);

		// Ordenar el arreglo A
		programaService.ordenarArregloA(programa);
		arregloA = programa.getArregloA();
		System.out.println("Arreglo A (ordenado):");
		mostrarArreglo(arregloA);

		// Combinar los arreglos A y B
		programaService.combinarArreglos(programa);
		double[] arregloB = programa.getArregloB();
		System.out.println("Arreglo B:");
		mostrarArreglo(arregloB);
	}

	public static void mostrarArreglo(double[] arreglo) {
		for (double elemento : arreglo) {
			System.out.print(elemento + " ");
		}
		System.out.println();
	}

}
