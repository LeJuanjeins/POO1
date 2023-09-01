package Parcial3.Clase282023;

class Padre extends Usuario{
    public String workPlace;

    public Padre(String nombre, String apellido, int CI, String workPlace) {
        super(nombre, apellido, CI);
        this.nombre = nombre;
        this.apellido = apellido;
        this.CI = CI;
        this.workPlace = workPlace;
    }

    public void trabajar(String nombre, String workPlace){
        System.out.println(nombre + "trabaja en" + workPlace);
    }
    
}
