package Prueba;

class Moto extends Vehiculos{
    String casco;

    public Moto(int nLlantas, String gas, String modelo , String casco){
        super(nLlantas, gas, modelo);
        this.casco = casco;
    }
    public void climb(String moto){
        System.out.println(moto + " el cilindraje permite trepar montaña");
    }
}
