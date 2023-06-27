package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Puntos;

public class PuntosService {

    Puntos puntos = new Puntos();

    public Puntos crearPuntos() {
        Scanner sc = new Scanner(System.in);        

        System.out.println("Ingrese las coordenadas del primer punto:");
        System.out.println("X1: ");
        puntos.setX1(sc.nextDouble());
       System.out.println("Y1: ");
        puntos.setY1(sc.nextDouble());

        System.out.println("Ingrese las coordenadas del segundo punto:");
        System.out.println("X2: ");
        puntos.setX2(sc.nextDouble());
       System.out.println("Y2: ");
        puntos.setY2(sc.nextDouble());

        sc.close();
        return puntos;
    }

    public double calcularDistancia(Puntos puntos) {

        double distancia = Math.round(Math.sqrt(Math.pow(puntos.getX2() - puntos.getX1(), 2) + Math.pow(puntos.getY2() - puntos.getY1(), 2))); 

        return distancia;

    }
}