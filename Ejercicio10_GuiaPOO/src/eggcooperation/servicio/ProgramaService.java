package eggcooperation.servicio;

import java.util.Arrays;
import java.util.Random;

import eggcooperation.entidad.Programa;

public class ProgramaService {
	
	public void inicializarArregloA(Programa programa) {
        double[] arregloA = new double[50];
        Random random = new Random();
        for (int i = 0; i < arregloA.length; i++) {
            arregloA[i] = random.nextDouble();
        }
        programa.setArregloA(arregloA);
    }

    public void ordenarArregloA(Programa programa) {
        double[] arregloA = programa.getArregloA();
        Arrays.sort(arregloA);
        programa.setArregloA(arregloA);
    }

    public void combinarArreglos(Programa programa) {
        double[] arregloA = programa.getArregloA();
        double[] arregloB = new double[20];

        for (int i = 0; i < 10; i++) {
            arregloB[i] = arregloA[i];
        }

        for (int i = 10; i < 20; i++) {
            arregloB[i] = 0.5;
        }

        programa.setArregloB(arregloB);
    }

}
