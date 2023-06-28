package eggcooperation.entidad;

public class Pentagono extends FiguraGeometrica {
    private double lado;

    public Pentagono(double lado) {
        this.lado = lado;
    }
    
    public Pentagono() {
    	
    }

    public double calcularArea() {
        return (Math.sqrt(5 * (5 + 2 * Math.sqrt(5))) * lado * lado) / 4;
    }

    public double calcularPerimetro() {
        return 5 * lado;
    }

}
