package Conjunta1.Comensal;

public class Cliente {
    private String nombre;
    private int orden;

    public void pedirOrden(int nuevaOrden) {
        orden = nuevaOrden;
        System.out.println("El cliente " + nombre + " ha pedido la orden " + orden + ".");
    }

    public void setOrden(int orden) {
    }

    public void setMesa(int mesa) {
    }

    public void setNombre(String nombre) {
    }

    public String getNombre() {
        return nombre;
    }
}