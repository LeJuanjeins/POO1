class Huron extends Animales {
    int stripes;

    public Huron (String nombre , int edad , int stripes){
        super(nombre,edad);
        this.stripes = stripes;
    }
    public void hides (String huron){
        System.out.println(huron + " juega escondiendose");
        System.out.println("\n");
    }
}
