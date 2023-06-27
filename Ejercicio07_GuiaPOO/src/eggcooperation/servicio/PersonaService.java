package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Persona;

public class PersonaService {
	
	public Persona crearPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre de la persona:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese la edad de la persona:");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer del teclado

        System.out.println("Ingrese el sexo de la persona (H - Hombre, M - Mujer, O - Otro):");
        char sexo = Character.toUpperCase(scanner.nextLine().charAt(0));
        while (sexo != 'H' && sexo != 'M' && sexo != 'O') {
            System.out.println("Sexo no válido. Ingrese nuevamente (H - Hombre, M - Mujer, O - Otro):");
            sexo = Character.toUpperCase(scanner.nextLine().charAt(0));
            
        scanner.close();
        }

        System.out.println("Ingrese el peso de la persona en kg:");
        double peso = scanner.nextDouble();

        System.out.println("Ingrese la altura de la persona en metros:");
        double altura = scanner.nextDouble();

        return new Persona(nombre, edad, sexo, peso, altura);
    }

    public int calcularIMC(Persona persona) {
        double imc = persona.getPeso() / Math.pow(persona.getAltura(), 2);

        if (imc < 20) {
            return -1; // Por debajo del peso ideal
        } else if (imc >= 20 && imc <= 25) {
            return 0; // Peso ideal
        } else {
            return 1; // Sobrepeso
        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;
    }
    
    

}
