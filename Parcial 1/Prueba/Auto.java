package Prueba;

class Auto extends Vehiculos{
    String aire;

    public Auto(int nLlantas , String gas , String modelo, String aire){
        super(nLlantas, gas, modelo);
        this.aire = aire;
    }
    public void drift(String auto){
        System.out.println(auto + " no ha sido modificado para drift");
        System.out.println("\n");
    }
}
