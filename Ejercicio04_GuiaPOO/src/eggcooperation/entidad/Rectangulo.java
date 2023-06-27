package eggcooperation.entidad;

import java.util.Scanner;

public class Rectangulo {
	private double base;
	private double altura;

	// Constructor con todos los atributos pasados por par�metro
	public Rectangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	// Constructor vac�o
	public Rectangulo() {
	}

	// M�todos getters y setters para los atributos base y altura
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

	// M�todo para crear el rect�ngulo con los datos ingresados por el usuario
	public void crearRectangulo() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese la base del rect�ngulo: ");
		base = scanner.nextDouble();

		System.out.println("Ingrese la altura del rect�ngulo: ");
		altura = scanner.nextDouble();
		
		scanner.close();
	}

	// M�todo para calcular la superficie del rect�ngulo
	public double calcularSuperficie() {
		return base * altura;
	}

	// M�todo para calcular el per�metro del rect�ngulo
	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

	// M�todo para dibujar el rect�ngulo con asteriscos
	public void dibujarRectangulo() {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < base; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
