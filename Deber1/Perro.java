class Perro extends Animales {
    String raza;

    public Perro (String nombre , int edad , String raza){
        super(nombre, edad);
        this.raza = raza;
    }
    public void sound (String perro){
        System.out.println(perro + " ladra poco, aulla mucho");
        System.out.println("\n");
    }
}
