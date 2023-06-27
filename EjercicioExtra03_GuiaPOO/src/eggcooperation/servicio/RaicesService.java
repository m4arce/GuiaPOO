package eggcooperation.servicio;

import eggcooperation.entidad.Raices;

public class RaicesService {

    public double calcularDiscriminante(Raices raices) {
        return Math.pow(raices.getB(), 2) - 4 * raices.getA() * raices.getC();
    }

    public boolean tieneRaices(double discriminante) {               
        return discriminante > 0; //debe ser mayor a cero
    }

    public boolean tieneRaiz(double discriminante) {             
        return discriminante == 0;
    }

    public void obtenerRaices(Raices raices) {
        double discriminante = calcularDiscriminante(raices);
        if (tieneRaices(discriminante)) {
            double x1 = (-raices.getB() + Math.sqrt(discriminante)) / (2 * raices.getA());
            double x2 = (-raices.getB() - Math.sqrt(discriminante)) / (2 * raices.getA());
            System.out.println("Posible solucion 1 -> Raíz 1: " + x1);
            System.out.println("Posible solución 2 -> Raíz 2: " + x2);
        }
    }

    public void obtenerRaiz(Raices raices) {
        double discriminante = calcularDiscriminante(raices);
        if (tieneRaiz(discriminante)) {
            double x = -raices.getB() / (2 * raices.getA());
            System.out.println("Tiene Raíz única: " + x);
        }
    }

    public void calcular(Raices raices) {
        double discriminante = calcularDiscriminante(raices);
        if (tieneRaices(discriminante)) {
            obtenerRaices(raices);
        } else if (tieneRaiz(discriminante)) {
            obtenerRaiz(raices);
        } else {
            System.out.println("No existen soluciones reales.");
        }
    }

}
