class Perico extends Animales {
    String size;

    public Perico (String nombre , int edad , String size){
        super(nombre,edad);
        this.size = size;
    }
    public void repeat (String perico){
        System.out.println(perico + " repite lo que cantes");
        System.out.println("\n");
    }
}
