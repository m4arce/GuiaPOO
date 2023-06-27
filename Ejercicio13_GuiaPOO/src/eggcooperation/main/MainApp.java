package eggcooperation.main;

import eggcooperation.entidad.Curso;
import eggcooperation.servicio.CursoService;

public class MainApp {

	public static void main(String[] args) {
		CursoService cursoService = new CursoService();

		Curso curso = cursoService.crearCurso();

		System.out.println("\nDetalles del curso:");
		System.out.println("Nombre: " + curso.getNombreCurso());
		System.out.println("Horas por día: " + curso.getCantidadHorasPorDia());
		System.out.println("Días por semana: " + curso.getCantidadDiasPorSemana());
		System.out.println("Turno: " + curso.getTurno());
		System.out.println("Precio por hora: " + curso.getPrecioPorHora());
		System.out.println("Alumnos:");

		for (String alumno : curso.getAlumnos()) {
			System.out.println(alumno);
		}

		double gananciaSemanal = cursoService.calcularGananciaSemanal(curso);
		System.out.println("\nGanancia semanal del curso: $" + gananciaSemanal);
	}

}
