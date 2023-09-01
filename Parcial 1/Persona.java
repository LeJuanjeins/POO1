import java.util.InputMismatchException;
import java.util.Scanner;

public class Persona {
    int edad;
    String nombre;

    public Persona() {
    }
    public void correr(){
        System.out.println("la persona esta corriendo");
    }
    public void ingDatos(){
        Scanner teclado = new Scanner(System.in);
        boolean validInput = false;

        while(!validInput){
            try {
                System.out.println("Ingrese la edad: ");
                edad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Ingrese el nombre: ");
                String nombre = teclado.nextLine();
                System.out.println(nombre + " y su edad " + edad);
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un numero entero \n");
                teclado.nextLine();
                continue;
            }
        }
    }

}
