class Motocicleta extends Vehiculo {
    private boolean tieneSidecar;

    public Motocicleta(String marca, String modelo, boolean tieneSidecar) {
        super(marca, modelo);
        this.tieneSidecar = tieneSidecar;
    }

    public void realizarAcrobacias() {
        System.out.println("Realizando acrobacias en la motocicleta");
    }
}