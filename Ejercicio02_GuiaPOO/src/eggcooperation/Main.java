package eggcooperation;

import eggcooperation.entidad.Circunferencia;

public class Main {

	public static void main(String[] args) {
		
		//ejemplo cuando recibe el area como parametro, activa constructor con parametro
		Circunferencia circunferencia1 = new Circunferencia(5.0);
        System.out.println("�rea: " + circunferencia1.calcularArea());
        System.out.println("Per�metro: " + circunferencia1.calcularPerimetro());
        
        //ejemplo cuando no lo recibe. activa constructor vacio
        Circunferencia circunferencia2 = new Circunferencia();
        circunferencia2.crearCircunferencia();
        System.out.println("�rea: " + circunferencia2.calcularArea());
        System.out.println("Per�metro: " + circunferencia2.calcularPerimetro());

	}

}
