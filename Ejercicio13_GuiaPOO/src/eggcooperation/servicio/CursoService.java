package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Curso;

public class CursoService {
	
	private Scanner scanner;

    public CursoService() {
        scanner = new Scanner(System.in);
    }

    public void cargarAlumnos(Curso curso) {
        System.out.println("Ingrese los nombres de los alumnos:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            String nombreAlumno = scanner.next();
            curso.getAlumnos()[i] = nombreAlumno;
        }
        System.out.println("�Alumnos cargados exitosamente!");
    }

    public Curso crearCurso() {
        System.out.println("Ingrese los datos del curso:");

        System.out.print("Nombre del curso: ");
        String nombreCurso = scanner.nextLine();

        System.out.print("Cantidad de horas por d�a: ");
        int cantidadHorasPorDia = scanner.nextInt();

        System.out.print("Cantidad de d�as por semana: ");
        int cantidadDiasPorSemana = scanner.nextInt();

        scanner.nextLine(); // Consumir el salto de l�nea

        System.out.print("Turno (ma�ana o tarde): ");
        String turno = scanner.nextLine();

        System.out.print("Precio por hora: ");
        double precioPorHora = scanner.nextDouble();

        Curso curso = new Curso(nombreCurso, cantidadHorasPorDia, cantidadDiasPorSemana, turno, precioPorHora);

        cargarAlumnos(curso);

        return curso;
    }

    public double calcularGananciaSemanal(Curso curso) {
        int cantidadHorasSemanal = curso.getCantidadHorasPorDia() * curso.getCantidadDiasPorSemana();
        int cantidadAlumnos = curso.getAlumnos().length;

        return cantidadHorasSemanal * curso.getPrecioPorHora() * cantidadAlumnos;
    } 

}
