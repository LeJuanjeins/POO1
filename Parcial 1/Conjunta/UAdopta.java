package Conjunta;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UAdopta extends Usuarios{
    private int edad;
    private String direccion;

    public UAdopta() {
    }
    public void ingDatos(){
        Scanner teclado = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("Ingrese la edad: ");
        do{
            try {
                edad = teclado.nextInt();
                validInput = true; 
                teclado.next();
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero \n");
                teclado.nextLine();
            }
        }while(!validInput);
        teclado.nextLine();
        System.out.println("Ingrese el email: ");
        direccion = teclado.nextLine();
    }
    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }
    public void imprimirAdopta() {
        System.out.println("El nombre del funcionario es: " + getNombre());
        System.out.println("El id del funcionario es: " + edad);
        System.out.println("El email del usuario es: " + direccion);
    }
    
}
