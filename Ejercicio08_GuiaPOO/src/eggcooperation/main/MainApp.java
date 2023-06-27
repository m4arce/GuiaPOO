package eggcooperation.main;

import java.util.Scanner;

import eggcooperation.entidad.Cadena;
import eggcooperation.servicio.CadenaService;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CadenaService cadenaService = new CadenaService();

		System.out.println("Ingrese una frase:");
		String frase = scanner.nextLine();

		Cadena cadena = new Cadena();
		cadena.setFrase(frase);

		System.out.println("Longitud de la frase: " + cadena.getLongitud());
		System.out.println("Vocales en la frase: " + cadenaService.contarVocales(cadena));
		System.out.println("Frase invertida: " + cadenaService.invertirFrase(cadena));

		System.out.println("Ingrese una letra para contar su frecuencia:");
		String letra = scanner.nextLine();
		int frecuencia = cadenaService.vecesRepetido(cadena, letra);
		System.out.println("El carácter '" + letra + "' se repite " + frecuencia + " veces.");
		System.out.println("Ingrese otra frase para comparar longitud:");
		String otraFrase = scanner.nextLine();
		boolean tienenMismaLongitud = cadenaService.compararLongitud(cadena, otraFrase);
		if (tienenMismaLongitud) {
			System.out.println("La frase tiene la misma longitud que la frase ingresada anteriormente.");
		} else {
			System.out.println("La frase tiene una longitud diferente a la frase ingresada anteriormente.");
		}

		System.out.println("Ingrese otra frase para unirla:");
		String fraseUnida = scanner.nextLine();
		String fraseResultante = cadenaService.unirFrases(cadena, fraseUnida);
		System.out.println("Frase resultante de la unión: " + fraseResultante);

		System.out.println("Ingrese una letra para reemplazar en la frase:");
		String letraReemplazar = scanner.nextLine();
		System.out.println("Ingrese el carácter de reemplazo:");
		String reemplazo = scanner.nextLine();
		String fraseReemplazada = cadenaService.reemplazarLetra(cadena, letraReemplazar, reemplazo);
		System.out.println("Frase con reemplazo realizado: " + fraseReemplazada);

		System.out.println("Ingrese una letra para verificar si está en la frase:");
		String letraVerificar = scanner.nextLine();
		boolean contieneLetra = cadenaService.contieneLetra(cadena, letraVerificar);
		if (contieneLetra) {
			System.out.println("La frase contiene la letra ingresada.");
		} else {
			System.out.println("La frase no contiene la letra ingresada.");
		}

		scanner.close();
	}

}
