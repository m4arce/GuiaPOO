package eggcooperation.entidad;

import java.util.Scanner;

public class Operacion {

	private double numero1;
	private double numero2;

	// Método constructor con todos los atributos pasados por parámetro
	public Operacion(double numero1, double numero2) {
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	// Método constructor sin los atributos pasados por parámetro
	public Operacion() {
	}

	// Métodos get y set para los atributos numero1 y numero2
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

	// Método para crear una operación ingresando los dos números
	public void crearOperacion() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el primer número: ");
		numero1 = scanner.nextDouble();

		System.out.println("Ingrese el segundo número: ");
		numero2 = scanner.nextDouble();

		scanner.close();
	}

	// Método para sumar los dos números
	public double sumar() {
		return numero1 + numero2;
	}

	// Método para restar los dos números
	public double restar() {
		return numero1 - numero2;
	}

	// Método para multiplicar los dos números
	public double multiplicar() {
		if (numero2 == 0 || numero1 == 0) {
			System.out.println("Error: no se puede multiplicar por cero.");
			return 0;
		} else {
			return numero1 * numero2;
		}
	}

	// Método para dividir los dos números
	public double dividir() {
		if (numero2 == 0 || numero1 == 0) {
			System.out.println("Error: no se puede dividir por cero.");
			return 0;
		} else {
			return numero1 / numero2;
		}
	}
}
