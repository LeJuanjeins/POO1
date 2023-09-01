package Conjunta;
import java.util.Scanner;
import java.util.InputMismatchException;

public class UFuncionario extends Usuarios{
    private int id;
    private String email;
    private String puesto;

    public UFuncionario() {

    }
    public void ingDatos(){
        Scanner teclado = new Scanner(System.in);
        boolean validInput = false;
        System.out.println("Ingrese el id del funcionario: ");
        do{
            try {
                id = teclado.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero \n");
                teclado.nextLine();
            }
        }while(!validInput);
        teclado.nextLine();
        System.out.println("Ingrese el email: ");
        email = teclado.nextLine();
        System.out.println("Ingrese el puesto: ");
        puesto = teclado.nextLine();
    }
    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
    public String getPuesto(){
        return puesto;
    }
    public void imprimirFuncionario() {
        System.out.println("El nombre del funcionario es: " + getNombre());
        System.out.println("El id del funcionario es: " + id);
        System.out.println("El email del usuario es: " + email);
        System.out.println("El cargo del Funcionario es: " + puesto);
    }
    
}

