package Conjunta;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Usuarios {
    private String nombre;

    public void nomU(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese nombre de la persona: ");
        nombre = teclado.nextLine();
        teclado.nextLine();
        System.out.println("Ingrese datos validos \n");
        teclado.nextLine();   
        }
    public String getNombre(){
        return nombre;
    }
    public void interactuar(String funcionario, String adopta){
        System.out.println("El " + funcionario + " ha aprobado a " + adopta + ", y da su consentimiento para la adopcion");
    }
}
