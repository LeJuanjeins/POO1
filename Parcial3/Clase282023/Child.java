package Parcial3.Clase282023;

class Child extends Usuario {
    public Child(String nombre, String apellido, int CI) {
        super(nombre, apellido, CI);
        this.nombre = nombre;
        this.apellido = apellido;
        this.CI = CI;
    }

    public void jugar(String nombre){
        System.out.println(nombre + "juega");
    }
    
}
