package eggcooperation.entidad;

import java.util.Scanner;

public class Libro {
	
	//atributos
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;

	// Constructor con todos los atributos pasados por parámetro
	public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	// Constructor vacío
	public Libro() {
	}

	// Método para cargar un libro pidiendo los datos al usuario
	public void cargarLibro() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el número de ISBN: ");
		ISBN = scanner.nextLine();

		System.out.println("Ingrese el título del libro: ");
		titulo = scanner.nextLine();

		System.out.println("Ingrese el autor del libro: ");
		autor = scanner.nextLine();

		System.out.println("Ingrese el número de páginas: ");
		numeroPaginas = scanner.nextInt();

		scanner.close();
	}

	// Método para informar los detalles del libro
	public void informarLibro() {
		System.out.println("----Detalles del libro----");
		System.out.println("ISBN: " + ISBN);
		System.out.println("Título: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("Número de páginas: " + numeroPaginas);
	}
}
