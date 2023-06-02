package Conjunta;
import java.util.Scanner;
import Conjunta.huerfanos.Animales;

public class Main {
    public static void main(String[] args) {
        int choice = 0;
        Scanner teclado = new Scanner(System.in);
        UAdopta uadota1 = new UAdopta(null);
        Animales animal1 = new Animales();
        UFuncionario ufuncionario1 = new UFuncionario(null);
        System.out.println("Bienvenido a clinica de adopcion\n");
        System.out.println("----------------------------------");
        do {
            System.out.println("Elija los datos que va ingresar");
            System.out.println("1. Animales");
            System.out.println("2. Usuario que va a Adoptar");
            System.out.println("3. Usuario Funcionario");
            System.out.println("4. Exit");

            try {
                choice = teclado.nextInt();
            } catch (Exception e) {
                System.out.println("Valor invalido. Por favor ingrese opciones validas.");
                teclado.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Los datos del Animal a disposicion son: ");
                    animal1.SetAnimales(12, "guayabo", "tucan");
                    System.out.println("La edad de "+ animal1.getNombre() + " (el" + animal1.getEspecie() + ")" + " es de " + animal1.getEdad() );
                    break;
                case 2:
                    System.out.println("Ingresa los datos de quien Adoptara: ");
                    uadota1.ingDatos();
                    break;
                case 3:
                    System.out.println("Ingresara los datos del Funcionario que lo atendio: ");
                    ufuncionario1.ingDatos();
                    break;
                case 4:
                    System.out.println("Salio del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor ingrese opciones validas.");
                    break;
            }
        } while (choice != 4);
        System.out.println("Los datos del animal, adoptante y funcionario son: ");
        animal1.infoanimal();
        uadota1.imprimirAdopta();
        ufuncionario1.imprimirFuncionario(); 

        teclado.close();
    }
}
