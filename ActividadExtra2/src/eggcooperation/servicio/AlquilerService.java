package eggcooperation.servicio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import eggcooperation.entidad.Alquiler;
import eggcooperation.entidad.Pelicula;

public class AlquilerService {

	private List<Alquiler> alquileres;

	public AlquilerService() {
		this.alquileres = new ArrayList<>();
	}

	public void crearAlquiler(Pelicula pelicula, Date fechaInicio, Date fechaFin) {
		int diasAlquiler = calcularDiasAlquiler(fechaInicio, fechaFin);
		double precio = calcularPrecioAlquiler(diasAlquiler);
		Alquiler alquiler = new Alquiler(pelicula, fechaInicio, fechaFin, precio);
		alquileres.add(alquiler);
	}

	public void listarAlquileres() {
		if (alquileres.isEmpty()) {
			System.out.println("No hay alquileres disponibles.");
		} else {
			System.out.println("----- LISTA DE ALQUILERES -----");
			for (Alquiler alquiler : alquileres) {
				System.out.println("Película alquilada: " + alquiler.getPelicula().getTitulo());
				System.out.println("Fecha de inicio: " + alquiler.getFechaInicio());
				System.out.println("Fecha de fin: " + alquiler.getFechaFin());
				System.out.println("Precio: $" + alquiler.getPrecio());
				System.out.println("-------------------------------------");
			}
		}
	}

	public void buscarAlquileresPorFecha(Date fecha) {
		boolean alquileresEncontrados = false;
		System.out.println("----- ALQUILERES POR FECHA -----");
		for (Alquiler alquiler : alquileres) {
			if (alquiler.getFechaInicio().equals(fecha) || alquiler.getFechaFin().equals(fecha)) {
				System.out.println("Película: " + alquiler.getPelicula().getTitulo());
				System.out.println("Fecha de inicio: " + alquiler.getFechaInicio());
				System.out.println("Fecha de fin: " + alquiler.getFechaFin());
				System.out.println("Precio: $" + alquiler.getPrecio());
				System.out.println("-------------------------------------");
				alquileresEncontrados = true;
			}
		}
		if (!alquileresEncontrados) {
			System.out.println("No se encontraron alquileres para la fecha especificada.");
		}
	}

	public double calcularIngresoTotal() {
		double ingresoTotal = 0;
		for (Alquiler alquiler : alquileres) {
			int diasAlquiler = calcularDiasAlquiler(alquiler.getFechaInicio(), alquiler.getFechaFin());
			double precio = calcularPrecioAlquiler(diasAlquiler);
			ingresoTotal += precio;
		}
		return ingresoTotal;
	}

	private int calcularDiasAlquiler(Date fechaInicio, Date fechaFin) {
		long diferencia = fechaFin.getTime() - fechaInicio.getTime();
		int diasAlquiler = (int) (diferencia / (24 * 60 * 60 * 1000));
		return diasAlquiler;
	}

	private double calcularPrecioAlquiler(int dias) {
		double precioBase = 10;
		int diasBase = 3;
		double interes = 0.1;
		double precio = precioBase;
		if (dias > diasBase) {
			int diasExtras = dias - diasBase;
			precio += precioBase * interes * diasExtras;
		}
		return precio;
	}
}
