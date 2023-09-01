package Parcial2.Clase12Junio;
import Parcial2.Clase12Junio.Contador.ContadorTicket;

public class Principal {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Juan","Sanchez");
        ContadorTicket ticket1 = new ContadorTicket("10/10/23", "1717");
        System.out.println(persona1);
        System.out.println(ticket1);

        
    }
    
}
