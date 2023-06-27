package eggcooperation.main;

import eggcooperation.entidad.Matematica;
import eggcooperation.servicio.MatematicaService;

public class MainApp {

	public static void main(String[] args) {
		MatematicaService matematicaService = new MatematicaService();

		// Generar dos números aleatorios entre 0 y 1
		double numero1 = Math.random();
		double numero2 = Math.random();

		Matematica matematica = new Matematica(numero1, numero2);

		// Imprimir los números generados
		System.out.println("Número 1: " + matematica.getNumero1());
		System.out.println("Número 2: " + matematica.getNumero2());

		// Calcular y mostrar el mayor número
		double mayor = matematicaService.devolverMayor(matematica);
		System.out.println("El mayor número es: " + mayor);

		// Calcular y mostrar la potencia del mayor número elevado al menor número
		double potencia = matematicaService.calcularPotencia(matematica);
		System.out.println("La potencia del mayor número elevado al menor número es: " + potencia);

		// Calcular y mostrar la raíz cuadrada del menor número (con valor absoluto)
		double raiz = matematicaService.calcularRaiz(matematica);
		System.out.println("La raíz cuadrada del menor número es: " + raiz);
	}

}
