package Conjunta;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UFuncionario extends Usuarios{
    int id;
    String email;
    String puesto;

    public UFuncionario(String nombre) {
        super(nombre);
    }
    public void ingDatos(){
        Scanner teclado = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput){
            try {
                System.out.println("Ingrese el id del funcionario: ");
                id = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el nombre: ");
                nombre = teclado.nextLine();
                System.out.println("Ingrese el email: ");
                email = teclado.nextLine();
                System.out.println("Ingrese el puesto: ");
                puesto = teclado.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero \n");
                teclado.nextLine();
                continue;
            }
        }
    }
    public void imprimirFuncionario() {
        System.out.println("El nombre del funcionario es: " + nombre);
        System.out.println("El id del funcionario es: " + id);
        System.out.println("El email del usuario es: " + email);
        System.out.println("El cargo del Funcionario es: " + puesto);
    }
    
}

