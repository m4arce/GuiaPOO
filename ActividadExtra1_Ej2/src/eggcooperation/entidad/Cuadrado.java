package eggcooperation.entidad;

public class Cuadrado extends FiguraGeometrica {

	private double lado;

	public Cuadrado(double lado) {
		this.lado = lado;
	}

	public Cuadrado() {

	}

	
	public double calcularArea() {
		return lado * lado;
	}


	public double calcularPerimetro() {
		return 4 * lado;
	}

}
