package Prueba;

public class Main {

    public static void main(String[] args) {
        Vehiculos vehiculo1 = new Vehiculos(4, "diesel", "Luv D-max");
        Auto auto1 = new Auto(4, "Gasolina", "Mustang", "Tiene aire acondicionado");
        Moto moto1 = new Moto(2, "Gasolina", "Daytona 150", "casco rigido para prevencion extra de caidas");
        vehiculo1.acelerar(vehiculo1.modelo, vehiculo1.nLlantas);
        auto1.drift(auto1.modelo);
        auto1.acelerar(auto1.modelo , auto1.nLlantas);
        moto1.climb(moto1.modelo);
        moto1.acelerar(moto1.modelo, moto1.nLlantas);
        System.out.println(auto1.modelo + " " + auto1.nLlantas + " llantas " + auto1.gas + " " + auto1.aire );
    }
}
