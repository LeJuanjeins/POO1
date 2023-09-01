package Conjunta1;

public class Mesero extends Usuarios {
    private String usuario;

    public Mesero(String rol, String nombre) {
        super(rol, nombre);
    }

    public void setUsuario(){
    }

    public String getUsuario(){
        return usuario;
    }

    public void llevarOrden(String orden) {
        System.out.println("Llevando orden a la cocina: " + orden);
    }

    public void entregarOrden(String orden) {
        System.out.println("Entregando orden al cliente: " + orden);
    }
}