package eggcooperation.entidad;

import java.util.Scanner;

public class Circunferencia {
	
	private double radio;
    private final double PI = 3.14159265359;
    
    // M�todo constructor que inicializa el radio pasado como par�metro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //constructor vacio
    public Circunferencia() {
		
	}

	// M�todos get y set para el atributo radio
    public double getRadio() {
        return radio;
    }
    
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    // M�todo para crear una circunferencia ingresando el radio
    public void crearCircunferencia() {
        @SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        radio = scanner.nextDouble();
        
        //scanner.close();
    }
    
    // M�todo para calcular el �rea de la circunferencia
    public double calcularArea() {
        return PI * Math.sqrt(radio);
    }
    
    // M�todo para calcular el per�metro de la circunferencia
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }

}
