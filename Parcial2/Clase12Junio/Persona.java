package Parcial2.Clase12Junio;

public class Persona {
    String nombre;
    String apellido;
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    @Override
    public String toString(){
        String informacion = "El nombre de la persona es " + this.nombre + " y su apellido " + this.apellido;
        return informacion;
    }
    
}
