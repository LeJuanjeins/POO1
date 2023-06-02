class Animales extends Usuarios{
    int edad;

    public Animales(String nombre, int edad){
        super(nombre);
        this.edad = edad;
    }
    public void comer (String animal){
        System.out.println("el " + animal + " esta comiendo");
    }
}
