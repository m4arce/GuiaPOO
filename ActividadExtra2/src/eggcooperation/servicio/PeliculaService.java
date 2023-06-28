package eggcooperation.servicio;

import java.util.ArrayList;
import java.util.List;

import eggcooperation.entidad.Pelicula;

public class PeliculaService {
	
	private List<Pelicula> peliculas;

    public PeliculaService() {
        this.peliculas = new ArrayList<>();
    }

    public void crearPelicula(String titulo, String genero, int anio, int duracion) {
        Pelicula pelicula = new Pelicula(titulo, genero, anio, duracion);
        peliculas.add(pelicula);
    }

    public void listarPeliculas() {
    	
		if (peliculas.isEmpty()) {
			System.out.println("No hay películas disponibles.");
		} else {
        System.out.println("----- LISTA DE PELÍCULAS -----");
        for (Pelicula pelicula : peliculas) {
            System.out.println("Título: " + pelicula.getTitulo());
            System.out.println("Género: " + pelicula.getGenero());
            System.out.println("Año: " + pelicula.getAnio());
            System.out.println("Duración: " + pelicula.getDuracion() + " minutos");
            System.out.println("-------------------------------------");
        }
        }
    }

    public Pelicula buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getTitulo().equalsIgnoreCase(titulo)) {
                return pelicula;
            }
        }
        return null;
    }

    public Pelicula buscarPeliculaPorGenero(String genero) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getGenero().equalsIgnoreCase(genero)) {
                return pelicula;
            }
        }
        return null;
    }

}
