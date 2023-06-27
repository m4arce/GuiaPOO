package eggcooperation.entidad;

import java.util.Scanner;

public class Rectangulo {
	private double base;
	private double altura;

	// Constructor con todos los atributos pasados por parámetro
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// Constructor vacío
	public Rectangulo() {
	}

	// Métodos getters y setters para los atributos base y altura
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Método para crear el rectángulo con los datos ingresados por el usuario
	public void crearRectangulo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la base del rectángulo: ");
		base = scanner.nextDouble();

		System.out.println("Ingrese la altura del rectángulo: ");
		altura = scanner.nextDouble();
		
		scanner.close();
	}

	// Método para calcular la superficie del rectángulo
	public double calcularSuperficie() {
		return base * altura;
	}

	// Método para calcular el perímetro del rectángulo
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

	// Método para dibujar el rectángulo con asteriscos
	public void dibujarRectangulo() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
