class Gato extends Animales {
    String genero;

    public Gato (String nombre , int edad , String genero){
        super(nombre, edad);
        this.genero = genero;
    }
    public void claws (String gato){
        System.out.println(gato + " rasguña solo sus juguetes");
        System.out.println("\n");
    }
}
