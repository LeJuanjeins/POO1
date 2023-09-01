import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Crear automóvil");
            System.out.println("2. Crear motocicleta");
            System.out.println("3. Salir");
            System.out.print("Ingrese la opción deseada: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    crearAutomovil();
                    break;
                case 2:
                    crearMotocicleta();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }
        } while (opcion != 3);
    }

    public static void crearAutomovil() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca del automóvil: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo del automóvil: ");
        String modelo = scanner.nextLine();

        System.out.print("Ingrese el número de puertas del automóvil: ");
        int numeroPuertas = scanner.nextInt();

        Automovil automovil = new Automovil(marca, modelo, numeroPuertas);
        System.out.println("¡Automóvil creado exitosamente!");

        System.out.println("Información del automóvil:");
        automovil.mostrarInformacion();
        automovil.conducir();
        automovil.abrirPuertas();
        System.out.println();
    }

    public static void crearMotocicleta() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la marca de la motocicleta: ");
        String marca = scanner.nextLine();

        System.out.print("Ingrese el modelo de la motocicleta: ");
        String modelo = scanner.nextLine();

        System.out.print("¿La motocicleta tiene sidecar? (true/false): ");
        boolean tieneSidecar = scanner.nextBoolean();

        Motocicleta motocicleta = new Motocicleta(marca, modelo, tieneSidecar);
        System.out.println("¡Motocicleta creada exitosamente!");

        System.out.println("Información de la motocicleta:");
        motocicleta.mostrarInformacion();
        motocicleta.conducir();
        motocicleta.realizarAcrobacias();
        System.out.println();
    }
}