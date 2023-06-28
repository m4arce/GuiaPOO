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
			System.out.println("1. Cargar una pel�cula");
			System.out.println("2. Listar todas las pel�culas disponibles");
			System.out.println("3. Crear un alquiler");
			System.out.println("4. Lista de todos los alquileres");
			System.out.println("5. Buscar pel�culas por t�tulo o g�nero");
			System.out.println("6. Buscar alquileres por fecha");
			System.out.println("7. Salir");
			System.out.print("Ingrese una opci�n: ");
			opcion = scanner.nextInt();
			scanner.nextLine(); // Limpiar el buffer

			switch (opcion) {
			case 1:
				System.out.println("----- CARGAR PEL�CULA -----");
				System.out.print("T�tulo: ");
				String titulo = scanner.nextLine();
				System.out.print("G�nero: ");
				String genero = scanner.nextLine();
				System.out.print("A�o: ");
				int anio = scanner.nextInt();
				System.out.print("Duraci�n (en minutos): ");
				int duracion = scanner.nextInt();
				scanner.nextLine(); // Limpiar el buffer
				peliculaService.crearPelicula(titulo, genero, anio, duracion);
				System.out.println("Pel�cula cargada exitosamente.");
				break;
			case 2:
				System.out.println("----- LISTA DE PEL�CULAS DISPONIBLES -----");
				peliculaService.listarPeliculas();
				break;
			case 3:
			    System.out.println("----- CREAR ALQUILER -----");
			    System.out.print("T�tulo de la pel�cula a alquilar: ");
			    String tituloPelicula = scanner.nextLine();
			    Pelicula pelicula = peliculaService.buscarPeliculaPorTitulo(tituloPelicula);

			    if (pelicula == null) {
			        System.out.println("La pel�cula no existe. Intente nuevamente.");
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
			    System.out.println("----- B�SQUEDA DE PEL�CULAS -----");
			    System.out.println("1. Buscar por t�tulo");
			    System.out.println("2. Buscar por g�nero");
			    System.out.print("Ingrese una opci�n: ");
			    int opcionBusqueda = scanner.nextInt();
			    scanner.nextLine(); // Limpiar el buffer

			    switch (opcionBusqueda) {
			        case 1:
			            System.out.print("Ingrese el t�tulo de la pel�cula: ");
			            String tituloBusqueda = scanner.nextLine();
			            Pelicula peliculaPorTitulo = peliculaService.buscarPeliculaPorTitulo(tituloBusqueda);
			            if (peliculaPorTitulo != null) {
			                System.out.println("----- DETALLES DE LA PEL�CULA -----");
			                System.out.println("T�tulo: " + peliculaPorTitulo.getTitulo());
			                System.out.println("G�nero: " + peliculaPorTitulo.getGenero());
			                System.out.println("A�o: " + peliculaPorTitulo.getAnio());
			                System.out.println("Duraci�n: " + peliculaPorTitulo.getDuracion() + " minutos");
			                System.out.println("-------------------------------------");
			            } else {
			                System.out.println("No se encontr� ninguna pel�cula con el t�tulo especificado.");
			            }
			            break;
			        case 2:
			            System.out.print("Ingrese el g�nero de la pel�cula: ");
			            String generoBusqueda = scanner.nextLine();
			            Pelicula peliculaPorGenero = peliculaService.buscarPeliculaPorGenero(generoBusqueda);
			            if (peliculaPorGenero != null) {
			                System.out.println("----- DETALLES DE LA PEL�CULA -----");
			                System.out.println("T�tulo: " + peliculaPorGenero.getTitulo());
			                System.out.println("G�nero: " + peliculaPorGenero.getGenero());
			                System.out.println("A�o: " + peliculaPorGenero.getAnio());
			                System.out.println("Duraci�n: " + peliculaPorGenero.getDuracion() + " minutos");
			                System.out.println("-------------------------------------");
			            } else {
			                System.out.println("No se encontraron pel�culas con el g�nero especificado.");
			            }
			            break;
			        default:
			            System.out.println("Opci�n inv�lida.");
			            break;
			    }
			    break;
			case 6:
			    System.out.println("----- B�SQUEDA DE ALQUILERES POR FECHA -----");
			    System.out.print("Ingrese la fecha (dd/MM/yyyy): ");
			    String fechaStr = scanner.nextLine();
			    Date fecha = parseFecha(fechaStr);
			    if (fecha != null) {
			        alquilerService.buscarAlquileresPorFecha(fecha);
			    }
			    break;
			    
			case 7:
				System.out.println("�Hasta luego!");
				break;
			default:
				System.out.println("Opci�n inv�lida. Intente nuevamente.");
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
