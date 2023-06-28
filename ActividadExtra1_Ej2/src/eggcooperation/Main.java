package eggcooperation;

import java.util.Scanner;

import eggcooperation.entidad.Circulo;
import eggcooperation.entidad.Cuadrado;
import eggcooperation.entidad.FiguraGeometrica;
import eggcooperation.entidad.Hexagono;
import eggcooperation.entidad.Pentagono;
import eggcooperation.entidad.Rectangulo;
import eggcooperation.entidad.Rombo;
import eggcooperation.entidad.Triangulo;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		boolean salir = false;

		while (!salir) {

			System.out.println("Calculadora de áreas y perímetros de figuras geométricas");

			System.out.println("Seleccione una figura geométrica:");
			System.out.println("1. Cuadrado");
			System.out.println("2. Rectángulo");
			System.out.println("3. Triángulo");
			System.out.println("4. Círculo");
			System.out.println("5. Hexágono");
			System.out.println("6. Pentágono");
			System.out.println("7. Rombo");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Ingrese el valor del lado del cuadrado:");
				double ladoCuadrado = scanner.nextDouble();
				FiguraGeometrica cuadrado = new Cuadrado(ladoCuadrado);
				System.out.println("Área del cuadrado: " + cuadrado.calcularArea());
				System.out.println("Perímetro del cuadrado: " + cuadrado.calcularPerimetro());
				break;
			case 2:
				System.out.println("Ingrese el valor de la base del rectángulo:");
				double baseRectangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor de la altura del rectángulo:");
				double alturaRectangulo = scanner.nextDouble();
				FiguraGeometrica rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
				System.out.println("Área del rectángulo: " + rectangulo.calcularArea());
				System.out.println("Perímetro del rectángulo: " + rectangulo.calcularPerimetro());
				break;
			case 3:
				System.out.println("Ingrese el valor de la base del triángulo:");
				double baseTriangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor de la altura del triángulo:");
				double alturaTriangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado 1 del triángulo:");
				double lado1Triangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado 2 del triángulo:");
				double lado2Triangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado 3 del triángulo:");
				double lado3Triangulo = scanner.nextDouble();
				FiguraGeometrica triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo,
						lado2Triangulo, lado3Triangulo);
				System.out.println("Área del triángulo: " + triangulo.calcularArea());
				System.out.println("Perímetro del triángulo: " + triangulo.calcularPerimetro());
				break;
			case 4:
				System.out.println("Ingrese el valor del radio del círculo:");
				double radioCirculo = scanner.nextDouble();
				FiguraGeometrica circulo = new Circulo(radioCirculo);
				System.out.println("Área del círculo: " + circulo.calcularArea());
				System.out.println("Perímetro del círculo: " + circulo.calcularPerimetro());
				break;
			case 5:
				System.out.println("Ingrese el valor del lado del hexágono:");
				double ladoHexagono = scanner.nextDouble();
				FiguraGeometrica hexagono = new Hexagono(ladoHexagono);
				System.out.println("Área del hexágono: " + hexagono.calcularArea());
				System.out.println("Perímetro del hexágono: " + hexagono.calcularPerimetro());
				break;
			case 6:
				System.out.println("Ingrese el valor del lado del pentágono:");
				double ladoPentagono = scanner.nextDouble();
				FiguraGeometrica pentagono = new Pentagono(ladoPentagono);
				System.out.println("Área del pentágono: " + pentagono.calcularArea());
				System.out.println("Perímetro del pentágono: " + pentagono.calcularPerimetro());
				break;
			case 7:
				System.out.println("Ingrese el valor de la diagonal mayor del rombo:");
				double diagonalMayorRombo = scanner.nextDouble();
				System.out.println("Ingrese el valor de la diagonal menor del rombo:");
				double diagonalMenorRombo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado del rombo:");
				double ladoRombo = scanner.nextDouble();
				FiguraGeometrica rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo, ladoRombo);
				System.out.println("Área del rombo: " + rombo.calcularArea());
				System.out.println("Perímetro del rombo: " + rombo.calcularPerimetro());
				break;
			default:
				System.out.println("Opción inválida");
				break;
			}

			System.out.println("¿Desea calcular otra figura? (S/N):");
			String respuesta = scanner.next();
			if (respuesta.equalsIgnoreCase("N")) {
				salir = true;
				System.out.println("Ha salido de la calculadora. Hasta pronto...");
			}

		}

		scanner.close();
	}

}
