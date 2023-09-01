class Automovil extends Vehiculo {
    private int numeroPuertas;

    public Automovil(String marca, String modelo, int numeroPuertas) {
        super(marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public void abrirPuertas() {
        System.out.println("Abriendo las " + numeroPuertas + " puertas del automóvil");
    }
}