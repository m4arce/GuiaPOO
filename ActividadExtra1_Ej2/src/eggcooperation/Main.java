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

			System.out.println("Calculadora de �reas y per�metros de figuras geom�tricas");

			System.out.println("Seleccione una figura geom�trica:");
			System.out.println("1. Cuadrado");
			System.out.println("2. Rect�ngulo");
			System.out.println("3. Tri�ngulo");
			System.out.println("4. C�rculo");
			System.out.println("5. Hex�gono");
			System.out.println("6. Pent�gono");
			System.out.println("7. Rombo");

			int opcion = scanner.nextInt();
			scanner.nextLine();

			switch (opcion) {
			case 1:
				System.out.println("Ingrese el valor del lado del cuadrado:");
				double ladoCuadrado = scanner.nextDouble();
				FiguraGeometrica cuadrado = new Cuadrado(ladoCuadrado);
				System.out.println("�rea del cuadrado: " + cuadrado.calcularArea());
				System.out.println("Per�metro del cuadrado: " + cuadrado.calcularPerimetro());
				break;
			case 2:
				System.out.println("Ingrese el valor de la base del rect�ngulo:");
				double baseRectangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor de la altura del rect�ngulo:");
				double alturaRectangulo = scanner.nextDouble();
				FiguraGeometrica rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);
				System.out.println("�rea del rect�ngulo: " + rectangulo.calcularArea());
				System.out.println("Per�metro del rect�ngulo: " + rectangulo.calcularPerimetro());
				break;
			case 3:
				System.out.println("Ingrese el valor de la base del tri�ngulo:");
				double baseTriangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor de la altura del tri�ngulo:");
				double alturaTriangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado 1 del tri�ngulo:");
				double lado1Triangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado 2 del tri�ngulo:");
				double lado2Triangulo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado 3 del tri�ngulo:");
				double lado3Triangulo = scanner.nextDouble();
				FiguraGeometrica triangulo = new Triangulo(baseTriangulo, alturaTriangulo, lado1Triangulo,
						lado2Triangulo, lado3Triangulo);
				System.out.println("�rea del tri�ngulo: " + triangulo.calcularArea());
				System.out.println("Per�metro del tri�ngulo: " + triangulo.calcularPerimetro());
				break;
			case 4:
				System.out.println("Ingrese el valor del radio del c�rculo:");
				double radioCirculo = scanner.nextDouble();
				FiguraGeometrica circulo = new Circulo(radioCirculo);
				System.out.println("�rea del c�rculo: " + circulo.calcularArea());
				System.out.println("Per�metro del c�rculo: " + circulo.calcularPerimetro());
				break;
			case 5:
				System.out.println("Ingrese el valor del lado del hex�gono:");
				double ladoHexagono = scanner.nextDouble();
				FiguraGeometrica hexagono = new Hexagono(ladoHexagono);
				System.out.println("�rea del hex�gono: " + hexagono.calcularArea());
				System.out.println("Per�metro del hex�gono: " + hexagono.calcularPerimetro());
				break;
			case 6:
				System.out.println("Ingrese el valor del lado del pent�gono:");
				double ladoPentagono = scanner.nextDouble();
				FiguraGeometrica pentagono = new Pentagono(ladoPentagono);
				System.out.println("�rea del pent�gono: " + pentagono.calcularArea());
				System.out.println("Per�metro del pent�gono: " + pentagono.calcularPerimetro());
				break;
			case 7:
				System.out.println("Ingrese el valor de la diagonal mayor del rombo:");
				double diagonalMayorRombo = scanner.nextDouble();
				System.out.println("Ingrese el valor de la diagonal menor del rombo:");
				double diagonalMenorRombo = scanner.nextDouble();
				System.out.println("Ingrese el valor del lado del rombo:");
				double ladoRombo = scanner.nextDouble();
				FiguraGeometrica rombo = new Rombo(diagonalMayorRombo, diagonalMenorRombo, ladoRombo);
				System.out.println("�rea del rombo: " + rombo.calcularArea());
				System.out.println("Per�metro del rombo: " + rombo.calcularPerimetro());
				break;
			default:
				System.out.println("Opci�n inv�lida");
				break;
			}

			System.out.println("�Desea calcular otra figura? (S/N):");
			String respuesta = scanner.next();
			if (respuesta.equalsIgnoreCase("N")) {
				salir = true;
				System.out.println("Ha salido de la calculadora. Hasta pronto...");
			}

		}

		scanner.close();
	}

}
