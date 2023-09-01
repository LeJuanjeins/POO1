class Adoptante extends Usuarios {
    String address;

    public Adoptante (String nombre , String address){
        super(nombre);
        this.address = address;
    }
    public void adopt(String adoptante, String adoptado) {
        System.out.println(adoptante + " acaba de adoptar a " + adoptado);
    }
}
