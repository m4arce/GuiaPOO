package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Movil;

public class MovilService {
	
	private Scanner scanner;

    public MovilService() {
        scanner = new Scanner(System.in);
    }

    public Movil crearMovil() {
        System.out.println("Ingrese los datos del móvil:");
        System.out.print("Marca: ");
        String marca = scanner.next();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Modelo: ");
        String modelo = scanner.next();

        System.out.print("Memoria RAM: ");
        String memoriaRam = scanner.next();

        System.out.print("Almacenamiento: ");
        String almacenamiento = scanner.next();

        int[] codigo = ingresarCodigo();

        return new Movil(marca, precio, modelo, memoriaRam, almacenamiento, codigo);
    }

    private int[] ingresarCodigo() {
        System.out.println("Ingrese el código del móvil (7 números):");
        int[] codigo = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }

        return codigo;
    }

}
