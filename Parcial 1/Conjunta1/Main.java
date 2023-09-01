package Conjunta1;
import Conjunta1.Comensal.Cliente;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Mesero mesero1 = new Mesero("mesero", "Pablo");
        Cocinero cocinero1 = new Cocinero("cocinero", "Jose");
        Cliente cliente1 = new Cliente();
        System.out.println("Bienvenido al restaurante. ¿Cómo se llama? ");
        System.out.println("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();
        cliente1.setNombre(nombre);
        int opcion = 0;

        System.out.println("Ingrese el número de mesa: ");
        int mesa = scanner.nextInt();
        cliente1.setMesa(mesa);

        System.out.println("Hola, soy " + mesero1.nombre + ". ¿Puedo tomar su orden?");
        System.out.println("si/no");
        scanner.nextLine();
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("no")) {
            System.out.println("El cliente " + cliente1.getNombre() + " ha salido del restaurante.");
        } else if (respuesta.equalsIgnoreCase("si")) {
            System.out.println("Menú:");
            System.out.println("0. Salir");
            System.out.println("1. Pedir Desayuno");
            System.out.println("2. Pedir Almuerzo");
            System.out.println("3. Pedir Merienda");
            System.out.println("¿Qué desea ordenar? ");
            try {
                opcion = scanner.nextInt();
                scanner.nextLine();           
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero \n");
                scanner.nextLine();
            } 
            switch (opcion) {
                case 0:
                    // Si el cliente elige salir, imprimir mensaje de salida
                    System.out.println("El cliente " + cliente1.getNombre() + " ha salido del restaurante.");
                    break;
                case 1:
                    System.out.println("El "+ cocinero1.rol + " " + cocinero1.nombre +" se encuentra preparando su orden.");
                    System.out.println("El " + mesero1.rol + " " + mesero1.nombre + "está llevando su orden. ¡Buen provecho!");
                    break;
                case 2:
                    System.out.println("El "+ cocinero1.rol + " " + cocinero1.nombre +" se encuentra preparando su orden.");
                    System.out.println("El " + mesero1.rol + " " + mesero1.nombre + "está llevando su orden. ¡Buen provecho!");
                    break;
                case 3:
                    System.out.println("El "+ cocinero1.rol + " " + cocinero1.nombre +" se encuentra preparando su orden.");
                    System.out.println("El " + mesero1.rol + " " + mesero1.nombre + "está llevando su orden. ¡Buen provecho!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } else {
            System.out.println("Respuesta inválida.");
    }
    }
}