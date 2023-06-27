package eggcooperation.entidad;

import java.util.Scanner;

public class Libro {
	
	//atributos
	private String ISBN;
	private String titulo;
	private String autor;
	private int numeroPaginas;

	// Constructor con todos los atributos pasados por par�metro
	public Libro(String ISBN, String titulo, String autor, int numeroPaginas) {
		this.ISBN = ISBN;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
	}

	// Constructor vac�o
	public Libro() {
	}

	// M�todo para cargar un libro pidiendo los datos al usuario
	public void cargarLibro() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el n�mero de ISBN: ");
		ISBN = scanner.nextLine();

		System.out.println("Ingrese el t�tulo del libro: ");
		titulo = scanner.nextLine();

		System.out.println("Ingrese el autor del libro: ");
		autor = scanner.nextLine();

		System.out.println("Ingrese el n�mero de p�ginas: ");
		numeroPaginas = scanner.nextInt();

		scanner.close();
	}

	// M�todo para informar los detalles del libro
	public void informarLibro() {
		System.out.println("----Detalles del libro----");
		System.out.println("ISBN: " + ISBN);
		System.out.println("T�tulo: " + titulo);
		System.out.println("Autor: " + autor);
		System.out.println("N�mero de p�ginas: " + numeroPaginas);
	}
}
