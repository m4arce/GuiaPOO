package eggcooperation.main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import eggcooperation.entidad.Pelicula;
import eggcooperation.servicio.AlquilerService;
import eggcooperation.servicio.PeliculaService;

public class MainApp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PeliculaService peliculaService = new PeliculaService();
		AlquilerService alquilerService = new AlquilerService();

		int opcion = 0;
		while (opcion != 7) {
			System.out.println("----- MENU -----");
			System.out.println("1. Cargar una película");
			System.out.println("2. Listar todas las películas disponibles");
			System.out.println("3. Crear un alquiler");
			System.out.println("4. Lista de todos los alquileres");
			System.out.println("5. Buscar películas por título o género");
			System.out.println("6. Buscar alquileres por fecha");
			System.out.println("7. Salir");
			System.out.print("Ingrese una opción: ");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				System.out.println("----- CARGAR PELÍCULA -----");
				System.out.print("Título: ");
				String titulo = scanner.nextLine();
				System.out.print("Género: ");
				String genero = scanner.nextLine();
				System.out.print("Año: ");
				int anio = scanner.nextInt();
				System.out.print("Duración (en minutos): ");
				int duracion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el buffer
				peliculaService.crearPelicula(titulo, genero, anio, duracion);
				System.out.println("Película cargada exitosamente.");
				break;
			case 2:
				System.out.println("----- LISTA DE PELÍCULAS DISPONIBLES -----");
				peliculaService.listarPeliculas();
				break;
			case 3:
			    System.out.println("----- CREAR ALQUILER -----");
			    System.out.print("Título de la película a alquilar: ");
			    String tituloPelicula = scanner.nextLine();
			    Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo(tituloPelicula);

			    if (pelicula == null) {
			        System.out.println("La película no existe. Intente nuevamente.");
			        break;
			    }

			    System.out.print("Fecha de inicio (dd/MM/yyyy): ");
			    String fechaInicioStr = scanner.nextLine();
			    Date fechaInicio = parseFecha(fechaInicioStr);

			    System.out.print("Fecha de fin (dd/MM/yyyy): ");
			    String fechaFinStr = scanner.nextLine();
			    Date fechaFin = parseFecha(fechaFinStr);

			    alquilerService.crearAlquiler(pelicula, fechaInicio, fechaFin);
			    System.out.println("Alquiler creado exitosamente.");
			    break;

			case 4:
				System.out.println("----- LISTA DE ALQUILERES -----");
				alquilerService.listarAlquileres();
				break;
			case 5:
			    System.out.println("----- BÚSQUEDA DE PELÍCULAS -----");
			    System.out.println("1. Buscar por título");
			    System.out.println("2. Buscar por género");
			    System.out.print("Ingrese una opción: ");
			    int opcionBusqueda = scanner.nextInt();
			    scanner.nextLine(); // Limpiar el buffer

			    switch (opcionBusqueda) {
			        case 1:
			            System.out.print("Ingrese el título de la película: ");
			            String tituloBusqueda = scanner.nextLine();
			            Pelicula peliculaPorTitulo = peliculaService.buscarPeliculaPorTitulo(tituloBusqueda);
			            if (peliculaPorTitulo != null) {
			                System.out.println("----- DETALLES DE LA PELÍCULA -----");
			                System.out.println("Título: " + peliculaPorTitulo.getTitulo());
			                System.out.println("Género: " + peliculaPorTitulo.getGenero());
			                System.out.println("Año: " + peliculaPorTitulo.getAnio());
			                System.out.println("Duración: " + peliculaPorTitulo.getDuracion() + " minutos");
			                System.out.println("-------------------------------------");
			            } else {
			                System.out.println("No se encontró ninguna película con el título especificado.");
			            }
			            break;
			        case 2:
			            System.out.print("Ingrese el género de la película: ");
			            String generoBusqueda = scanner.nextLine();
			            Pelicula peliculaPorGenero = peliculaService.buscarPeliculaPorGenero(generoBusqueda);
			            if (peliculaPorGenero != null) {
			                System.out.println("----- DETALLES DE LA PELÍCULA -----");
			                System.out.println("Título: " + peliculaPorGenero.getTitulo());
			                System.out.println("Género: " + peliculaPorGenero.getGenero());
			                System.out.println("Año: " + peliculaPorGenero.getAnio());
			                System.out.println("Duración: " + peliculaPorGenero.getDuracion() + " minutos");
			                System.out.println("-------------------------------------");
			            } else {
			                System.out.println("No se encontraron películas con el género especificado.");
			            }
			            break;
			        default:
			            System.out.println("Opción inválida.");
			            break;
			    }
			    break;
			case 6:
			    System.out.println("----- BÚSQUEDA DE ALQUILERES POR FECHA -----");
			    System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
			    String fechaStr = scanner.nextLine();
			    Date fecha = parseFecha(fechaStr);
			    if (fecha != null) {
			        alquilerService.buscarAlquileresPorFecha(fecha);
			    }
			    break;
			    
			case 7:
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción inválida. Intente nuevamente.");
				break;
			}
		}scanner.close();
	}

	private static Date parseFecha(String fechaStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		try {
			return sdf.parse(fechaStr);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

}
