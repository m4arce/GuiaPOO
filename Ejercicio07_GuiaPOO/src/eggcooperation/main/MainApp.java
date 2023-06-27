package eggcooperation.main;

import java.util.ArrayList;
import java.util.List;

import eggcooperation.entidad.Persona;
import eggcooperation.servicio.PersonaService;

public class MainApp {

	public static void main(String[] args) {
		PersonaService personaService = new PersonaService();
        List<Persona> personas = new ArrayList<>();

        // Crear 4 objetos de tipo Persona
        for (int i = 0; i < 4; i++) {
        	
        	System.out.println("Ingrese los datos de la persona " + (i + 1) + ":");
            personas.add(personaService.crearPersona());
            System.out.println();
        }

        int personasPorDebajoPeso = 0;
        int personasPesoIdeal = 0;
        int personasSobrepeso = 0;
        int personasMayoresEdad = 0;
        int personasMenoresEdad = 0;

        // Llamar a los métodos para cada objeto Persona
        for (Persona persona : personas) {
            int resultadoIMC = personaService.calcularIMC(persona);
            boolean esMayorEdad = personaService.esMayorDeEdad(persona);

            if (resultadoIMC == -1) {
                personasPorDebajoPeso++;
            } else if (resultadoIMC == 0) {
                personasPesoIdeal++;
            } else {
                personasSobrepeso++;
            }

            if (esMayorEdad) {
                personasMayoresEdad++;
            } else {
                personasMenoresEdad++;
            }
        }

        // Calcular porcentajes
        double porcentajePorDebajoPeso = (double) personasPorDebajoPeso / personas.size() * 100;
        double porcentajePesoIdeal = (double) personasPesoIdeal / personas.size() * 100;
        double porcentajeSobrepeso = (double) personasSobrepeso / personas.size() * 100;
        double porcentajeMayoresEdad = (double) personasMayoresEdad / personas.size() * 100;
        double porcentajeMenoresEdad = (double) personasMenoresEdad / personas.size() * 100;

        // Imprimir resultados
        System.out.println("Resultados:");
        System.out.println("Porcentaje de personas por debajo del peso ideal: " + porcentajePorDebajoPeso + "%");
        System.out.println("Porcentaje de personas en peso ideal: " + porcentajePesoIdeal + "%");
        System.out.println("Porcentaje de personas con sobrepeso: " + porcentajeSobrepeso + "%");
        System.out.println("Porcentaje de personas mayores de edad: " + porcentajeMayoresEdad + "%");
        System.out.println("Porcentaje de personas menores de edad: " + porcentajeMenoresEdad + "%");
    }

	}


