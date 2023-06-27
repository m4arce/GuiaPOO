package eggcooperation.entidad;

import java.util.Scanner;

public class Circunferencia {
	
	private double radio;
    private final double PI = 3.14159265359;
    
    // Método constructor que inicializa el radio pasado como parámetro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //constructor vacio
    public Circunferencia() {
		
	}

	// Métodos get y set para el atributo radio
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // Método para crear una circunferencia ingresando el radio
    public void crearCircunferencia() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
        
        //scanner.close();
    }
    
    // Método para calcular el área de la circunferencia
    public double calcularArea() {
        return PI * Math.sqrt(radio);
    }
    
    // Método para calcular el perímetro de la circunferencia
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

}
