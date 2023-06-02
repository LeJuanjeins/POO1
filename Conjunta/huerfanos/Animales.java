package Conjunta.huerfanos;

public class Animales {
    private int edad;
    private String nombre;
    private String especie;

    public void SetAnimales(int edad, String nombre, String especie) {
        this.edad = edad;
        this.nombre = nombre;
        this.especie = especie;
    }
    public int getEdad(){
        return edad;
    }
    public String getNombre(){
        return nombre;
    }
    public String getEspecie(){
        return especie;
    }
    public void comer(String nombre, String especie, int edad){
        System.out.println(nombre + "(" + especie + ") esta comiendo balanceado a sus " + edad + " años");
    }
    
    public void infoanimal() {
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Especie del animal: " + especie);
        System.out.println("Edad del animal: " + edad + " años");
    }

    
}
