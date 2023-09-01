package Parcial3.Clase282023;

public class Usuario {
    public String nombre;
    public String apellido;
    public int CI;

    public Usuario(String nombre, String apellido, int CI) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.CI = CI;
    }

    public void correr(String nombre){
        System.out.println(nombre + "corre");
    }
    public void saltar(String nombre){
        System.out.println(nombre + "salta");
    }
}
