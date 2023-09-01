package Parcial2.Reina;

import java.util.InputMismatchException;
import java.util.Scanner;

class Menu {
    private Scanner scanner;

    public Menu(Scanner scanner) {
        this.scanner = scanner;
    }

    public void mostrar() {
        System.out.println("=== Menú ===");
        System.out.println("1. Calificar");
        System.out.println("2. Ver información");
        System.out.println("3. Salir");
        System.out.print("Ingrese una opción: ");
    }

    public int obtenerOpcion() {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.println("Error: Opción inválida. Debe ingresar un número.");
            return -1;
        }
    }

    public int obtenerOpcionReina() {
        try {
            while (true) {
                System.out.println("Seleccione una reina para calificar (1, 2, 3): ");
                int seleccion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer de entrada

                if (seleccion >= 1 && seleccion <= 3) {
                    return seleccion;
                } else {
                    System.out.println("Error: Selección inválida. Debe ser un número del 1 al 3.");
                }
            }
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.println("Error: Selección inválida. Debe ser un número del 1 al 3.");
            return -1;
        }
    }

    public int obtenerCalificacion() {
        try {
            int calificacion = scanner.nextInt();
            if (calificacion >= 1 && calificacion <= 10) {
                return calificacion;
            } else {
                System.out.println("Error: Calificación inválida. Debe ser un número del 1 al 10.");
                return -1;
            }
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Limpiar el buffer de entrada
            System.out.println("Error: Calificación inválida. Debe ingresar un número.");
            return -1;
        }
    }

    public void mostrarInformacionReinas(Reina[] reinas) {
        for (Reina reina : reinas) {
            System.out.println(reina.getInfo());
        }
    }

    public void calificarReina(Reina reina, int calificacionInteligencia, int calificacionBelleza) {
        reina.calificar(calificacionInteligencia, calificacionBelleza);
    }
}