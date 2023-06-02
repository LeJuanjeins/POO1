package Conjunta;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UAdopta extends Usuarios{
    int edad;
    String direccion;

    public UAdopta(String nombre) {
        super(nombre);
    }
    public void ingDatos(){
        Scanner teclado = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput){
            try {
                System.out.println("Ingrese nombre de la persona que adoptara: ");
                nombre = teclado.nextLine();
                teclado.nextLine();
                System.out.println("Ingrese la edad: ");
                edad = teclado.nextInt();
                System.out.println("Ingrese el email: ");
                direccion = teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero \n");
                teclado.nextLine();
                continue;
            }
        }
    }
    public void imprimirAdopta() {
        System.out.println("El nombre del funcionario es: " + nombre);
        System.out.println("El id del funcionario es: " + edad);
        System.out.println("El email del usuario es: " + direccion);
    }
    
}
