package eggcooperation.entidad;

import java.util.Scanner;

public class Operacion {

	private double numero1;
	private double numero2;

	// M�todo constructor con todos los atributos pasados por par�metro
	public Operacion(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// M�todo constructor sin los atributos pasados por par�metro
	public Operacion() {
	}

	// M�todos get y set para los atributos numero1 y numero2
	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	// M�todo para crear una operaci�n ingresando los dos n�meros
	public void crearOperacion() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer n�mero: ");
		numero1 = scanner.nextDouble();

		System.out.println("Ingrese el segundo n�mero: ");
		numero2 = scanner.nextDouble();

		scanner.close();
	}

	// M�todo para sumar los dos n�meros
	public double sumar() {
		return numero1 + numero2;
	}

	// M�todo para restar los dos n�meros
	public double restar() {
		return numero1 - numero2;
	}

	// M�todo para multiplicar los dos n�meros
	public double multiplicar() {
		if (numero2 == 0 || numero1 == 0) {
			System.out.println("Error: no se puede multiplicar por cero.");
			return 0;
		} else {
			return numero1 * numero2;
		}
	}

	// M�todo para dividir los dos n�meros
	public double dividir() {
		if (numero2 == 0 || numero1 == 0) {
			System.out.println("Error: no se puede dividir por cero.");
			return 0;
		} else {
			return numero1 / numero2;
		}
	}
}
