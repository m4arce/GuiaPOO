package eggcooperation.servicio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import eggcooperation.entidad.Persona;

public class PersonaService {

	private Scanner scanner;

	public PersonaService() {
		scanner = new Scanner(System.in);
	}

	public Persona crearPersona() {
		System.out.print("Ingrese el nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Ingrese la fecha de nacimiento (Formato: dd/MM/yyyy): ");
		String fechaString = scanner.nextLine();
		Date fechaNacimiento = parseFecha(fechaString);

		return new Persona(nombre, fechaNacimiento);
	}

	@SuppressWarnings("deprecation")
	public int calcularEdad(Persona persona) {
		Date fechaActual = new Date();
		int anioActual = fechaActual.getYear() + 1900;
		int mesActual = fechaActual.getMonth() + 1;
		int diaActual = fechaActual.getDate();

		int anioNacimiento = persona.getFechaNacimiento().getYear() + 1900;
		int mesNacimiento = persona.getFechaNacimiento().getMonth() + 1;
		int diaNacimiento = persona.getFechaNacimiento().getDate();

		int edad = anioActual - anioNacimiento;

		if (mesActual < mesNacimiento || (mesActual == mesNacimiento && diaActual < diaNacimiento)) {
			edad--;
		}

		return edad;
	}

	public boolean menorQue(Persona persona, int edad) {
		return calcularEdad(persona) < edad;
	}

	public void mostrarPersona(Persona persona) {
		System.out.println("Nombre: " + persona.getNombre());
		System.out.println("Fecha de nacimiento: " + persona.getFechaNacimiento());
	}

	private Date parseFecha(String fechaString) {
		Date fecha = null;
		try {
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			fecha = formatter.parse(fechaString);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return fecha;
	}

}
