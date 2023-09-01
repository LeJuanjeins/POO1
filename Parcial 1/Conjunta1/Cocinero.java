package Conjunta1;

public class Cocinero extends Usuarios {
    private String usuario;

    public Cocinero(String rol, String nombre) {
        super(rol, nombre);
    }

    public void setUsuario(){
    }

    public String getUsuario(){
        return usuario;
    }

    public void hacerOrden(int orden) {
        System.out.println("Preparando orden: " + orden);
    }
}