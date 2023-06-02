package IngresoConsola;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese la edad: ");
        int edad = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombre = teclado.nextLine();
        System.out.println(nombre + " y su edad " + edad);
    }
}