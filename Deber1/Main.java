/*  Programa: appAdopcion
 *  Nombre: Juan Jose Sanchez
    Fecha: 17/05/2023 */

public class Main {
    public static void main(String[] args) {
        Animales animal1 = new Animales("Tulipan", 2);
        Perro perro1 = new Perro("Trota mundos", 3, "Alaskan Malamute");
        Gato gato1 = new Gato("Brinca nieve", 4, "Hembra");
        Perico perico1 = new Perico("Gavilan", 15, "grande");
        Huron huron1 = new Huron("Timon", 9, 3);
        Adoptante adoptante1 = new Adoptante("Fede", "Avenida siempreviva 432");
        Adoptante adoptante2 = new Adoptante("Hillary", "Monteserrin");
        System.out.println(animal1.nombre + ", " + "su edad es " + animal1.edad + " años");
        animal1.comer("perro");
        System.out.println(perro1.nombre + ", " + "su edad es " + perro1.edad + " año/años" + ", " + " es un " + perro1.raza);
        perro1.comer(perro1.nombre);
        perro1.sound(perro1.nombre);
        System.out.println(gato1.nombre + ", " + "su edad es " + gato1.edad + " año/años" + ", " + "Genero: " + gato1.genero);
        gato1.comer(gato1.nombre);
        gato1.claws(gato1.nombre);
        System.out.println(perico1.nombre + ", " + "su edad es " + perico1.edad + " año/años" + ", " + "su tamaño es " + perico1.size);
        perico1.comer(perico1.nombre);
        perico1.repeat(perico1.nombre);
        System.out.println(huron1.nombre + ", " + "su edad es " + huron1.edad + " año/años" + ", " + "Tiene " + huron1.stripes + " rayas");
        huron1.comer(huron1.nombre);
        huron1.hides(huron1.nombre);
        adoptante1.adopt(adoptante1.nombre, perro1.nombre);
        adoptante2.adopt(adoptante2.nombre, perico1.nombre);
    }
}
