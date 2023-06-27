package eggcooperation.main;

import eggcooperation.entidad.Persona;
import eggcooperation.servicio.PersonaService;

public class MainApp {

	public static void main(String[] args) {
        PersonaService personaService = new PersonaService();

        // Crear persona
        Persona persona = personaService.crearPersona();

        // Mostrar persona
        System.out.println("Datos de la persona:");
        personaService.mostrarPersona(persona);

        // Calcular edad
        int edad = personaService.calcularEdad(persona);
        System.out.println("Edad: " + edad + " años");

        // Comparar edades
        int edadComparar = 30;
        boolean esMenor = personaService.menorQue(persona, edadComparar);
        System.out.println("¿Es menor que " + edadComparar + " años?: " + esMenor);
    }

	}


