package eggcooperation.entidad;

public class Hexagono extends FiguraGeometrica {
    private double lado;

    public Hexagono(double lado) {
        this.lado = lado;
    }
    
    public Hexagono() {
    	
    }

    public double calcularArea() {
        return (3 * Math.sqrt(3) * lado * lado) / 2;
    }

    public double calcularPerimetro() {
        return 6 * lado;
    }

}
