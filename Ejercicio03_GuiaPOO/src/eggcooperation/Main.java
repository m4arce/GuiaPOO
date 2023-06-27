package eggcooperation;

import eggcooperation.entidad.Operacion;

public class Main {

	public static void main(String[] args) {
		
		//ejemplo pasandole valores por parametro
		Operacion operacion1 = new Operacion(10.0, 5.0);
        System.out.println("Suma: " + operacion1.sumar());
        System.out.println("Resta: " + operacion1.restar());
        System.out.println("Multiplicación: " + operacion1.multiplicar());
        System.out.println("División: " + operacion1.dividir());
        
        //ejemplo sin pasarle valores
        Operacion operacion2 = new Operacion();
        operacion2.crearOperacion();
        System.out.println("Suma: " + operacion2.sumar());
        System.out.println("Resta: " + operacion2.restar());
        System.out.println("Multiplicación: " + operacion2.multiplicar());
        System.out.println("División: " + operacion2.dividir());

	}

}
