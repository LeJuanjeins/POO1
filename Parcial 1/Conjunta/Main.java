package Conjunta;
import java.util.Scanner;
import Conjunta.huerfanos.Animales;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        UAdopta uadota1 = new UAdopta();
        Animales animal1 = new Animales();
        int choice = teclado.nextInt();
        boolean salir = false;
        UFuncionario ufuncionario1 = new UFuncionario();
        System.out.println("Bienvenido a clinica de adopcion\n");
        System.out.println("----------------------------------");
        do{
            System.out.println("Elija los datos que va ingresar");
            System.out.println("1. Animales");
            System.out.println("2. Usuario que va a Adoptar");
            System.out.println("3. Usuario Funcionario");
            System.out.println("4. Exit");
            switch (choice) {
                case 1:
                    System.out.println("Los datos del Animal a disposicion son: ");
                    animal1.SetAnimales(12, "guayabo", "tucan");
                    System.out.println("La edad de "+ animal1.getNombre() + " (el" + animal1.getEspecie() + ")" + " es de " + animal1.getEdad() );
                    break;
                case 2:
                    System.out.println("Datos de quien Adoptara");
                    uadota1.nomU();
                    uadota1.ingDatos();
                    break;
                case 3:
                    System.out.println("Ingresara los datos del Funcionario que lo atendio: ");
                    ufuncionario1.nomU();
                    ufuncionario1.ingDatos();
                    break;
                case 4:
                    salir = true;
                    System.out.println("Salio del programa.");
                    break;
                default:
                    System.out.println("Opcion invalida. Por favor ingrese opciones validas.");
                    break;
            }
        } while (!salir);
        System.out.println("Los datos del animal, adoptante y funcionario son: ");
        animal1.infoanimal();
        uadota1.imprimirAdopta();
        ufuncionario1.imprimirFuncionario(); 
        teclado.close();
    }
}
