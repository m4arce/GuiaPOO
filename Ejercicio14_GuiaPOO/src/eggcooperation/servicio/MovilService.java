package eggcooperation.servicio;

import java.util.Scanner;

import eggcooperation.entidad.Movil;

public class MovilService {
	
	private Scanner scanner;

    public MovilService() {
        scanner = new Scanner(System.in);
    }

    public Movil crearMovil() {
        System.out.println("Ingrese los datos del m�vil:");
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
        System.out.println("Ingrese el c�digo del m�vil (7 n�meros):");
        int[] codigo = new int[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("N�mero " + (i + 1) + ": ");
            codigo[i] = scanner.nextInt();
        }

        return codigo;
    }

}
