package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Juego;

public class JuegoServicio {
	
	private Juego mesesDelAnio;
    private String mesSecreto;

    public JuegoServicio() {
        mesesDelAnio = new Juego();
        mesSecreto = mesesDelAnio.getMeses()[9]; // Asignar el mes secreto, en este caso, mes[9] = "octubre"
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        String mesAdivinado;

        do {
            System.out.print("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: ");
            mesAdivinado = scanner.nextLine();

            if (mesAdivinado.equals(mesSecreto)) {
                System.out.println("¡Ha acertado!");
                break;
            } else {
                System.out.println("No ha acertado. Intente adivinarlo introduciendo otro mes.");
            }
        } while (true);
        scanner.close();
    }

}
