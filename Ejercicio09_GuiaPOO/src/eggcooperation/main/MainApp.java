package eggcooperation.main;

import eggcooperation.entidad.Matematica;
import eggcooperation.servicio.MatematicaService;

public class MainApp {

	public static void main(String[] args) {
		MatematicaService matematicaService = new MatematicaService();

		// Generar dos n�meros aleatorios entre 0 y 1
		double numero1 = Math.random();
		double numero2 = Math.random();

		Matematica matematica = new Matematica(numero1, numero2);

		// Imprimir los n�meros generados
		System.out.println("N�mero 1: " + matematica.getNumero1());
		System.out.println("N�mero 2: " + matematica.getNumero2());

		// Calcular y mostrar el mayor n�mero
		double mayor = matematicaService.devolverMayor(matematica);
		System.out.println("El mayor n�mero es: " + mayor);

		// Calcular y mostrar la potencia del mayor n�mero elevado al menor n�mero
		double potencia = matematicaService.calcularPotencia(matematica);
		System.out.println("La potencia del mayor n�mero elevado al menor n�mero es: " + potencia);

		// Calcular y mostrar la ra�z cuadrada del menor n�mero (con valor absoluto)
		double raiz = matematicaService.calcularRaiz(matematica);
		System.out.println("La ra�z cuadrada del menor n�mero es: " + raiz);
	}

}
