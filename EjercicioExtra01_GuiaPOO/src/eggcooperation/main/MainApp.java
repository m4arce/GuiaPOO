package eggcooperation.main;

import eggcooperation.entidad.Cancion;

public class MainApp {
	
	public static void main(String[] args) {
	
		Cancion cancion = new Cancion("MisDias", "Nach");
		
		System.out.println("Titulo cancion: " + cancion.getTitulo() + " | Autor: " + cancion.getAutor());
	}

}
