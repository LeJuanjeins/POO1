package Prueba;

public class Vehiculos {
    int nLlantas;
    String gas;
    String modelo;

    public Vehiculos(int nLlantas, String gas, String modelo){
        this.nLlantas = nLlantas;
        this.gas = gas;
        this.modelo = modelo;
    }
    public void acelerar(String vehiculo, float km){
        System.out.println(vehiculo + " acelera de 0 a 100 en " + km/100 + " segundos");
        System.out.println("\n");
    }
}
