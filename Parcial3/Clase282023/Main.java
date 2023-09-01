package Parcial3.Clase282023;

public class Main {
    public static void main(String[] args) {
        Padre padre1 = new Padre("Edwin", "Guachi", 1756245559, "Espe");
        Child child1 = new Child("Juan", "Sanchez", 1717859761);
        padre1.correr(padre1.nombre);
        padre1.saltar(padre1.nombre);
        padre1.trabajar(padre1.nombre, padre1.workplace);
        child1.correr(child1.nombre);
        child1.saltar(child1.nombre);
        child1.jugar(child1.nombre);
    }
}