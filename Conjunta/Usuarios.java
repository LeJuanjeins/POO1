package Conjunta;

public class Usuarios {
    String nombre;

    public Usuarios(String nombre){
    this.nombre = nombre;
    }
    
    public void interactuar(String funcionario, String adopta){
        System.out.println("El " + funcionario + " ha aprobado a " + adopta + ", y da su consentimiento para la adopcion");
    }
}
