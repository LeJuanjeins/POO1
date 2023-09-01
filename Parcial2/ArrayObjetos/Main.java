package Parcial2.ArrayObjetos;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Perro perro1 = new Perro();
        Perro perro2 = new Perro();
        Perro perro3 = new Perro();
        Perro perro4 = new Perro();
        Perro perro5 = new Perro();
        Perro perro6 = new Perro();
        Perro perro7 = new Perro();
        Perro perro8 = new Perro();
        Perro perro9 = new Perro();
        Perro perro10 = new Perro();
        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona persona5 = new Persona();
        Persona persona6 = new Persona();
        Persona persona7 = new Persona();
        Persona persona8 = new Persona();
        Persona persona9 = new Persona();
        Persona persona10 = new Persona();
        String dato_perro1 = perro1.datos_Perro("Terminator", "Shitzu");
        String dato_perro2 = perro2.datos_Perro("Selene", "Samoyedo");
        String dato_perro3 = perro3.datos_Perro("Helios", "Samoyedo");
        String dato_perro4 = perro4.datos_Perro("LaraCroft", "Samoyedo");
        String dato_perro5 = perro5.datos_Perro("Kratos", "Husky");
        String dato_perro6 = perro6.datos_Perro("MasterChief", "Alaskan Malamute");
        String dato_perro7 = perro7.datos_Perro("Link", "Golden Retriever");
        String dato_perro8 = perro8.datos_Perro("Morgana", "Fila Brasilero");
        String dato_perro9 = perro9.datos_Perro("Rebeca", "ChowChow");
        String dato_perro10 = perro10.datos_Perro("Manhattan", "Cane Corso");
        String dato_persona1 = persona1.datos_Persona("Juan","23");
        String dato_persona2 = persona2.datos_Persona("Jose","21");
        String dato_persona3 = persona3.datos_Persona("Fernando","25");
        String dato_persona4 = persona4.datos_Persona("Nicolas","21");
        String dato_persona5 = persona5.datos_Persona("Adrian","24");
        String dato_persona6 = persona6.datos_Persona("Gabriel","23");
        String dato_persona7 = persona7.datos_Persona("Milena","29");
        String dato_persona8 = persona8.datos_Persona("Grisela","26");
        String dato_persona9 = persona9.datos_Persona("Andrea","20");
        String dato_persona10 = persona10.datos_Persona("Elizabeth","18");
        ArrayList <String> perros = new ArrayList<String>();
        ArrayList <String> persona = new ArrayList<String>();
        perros.add(dato_perro1);
        perros.add(dato_perro2);
        perros.add(dato_perro3);
        perros.add(dato_perro4);
        perros.add(dato_perro5);
        perros.add(dato_perro6);
        perros.add(dato_perro7);
        perros.add(dato_perro8);
        perros.add(dato_perro9);
        perros.add(dato_perro10);
        persona.add(dato_persona1);
        persona.add(dato_persona2);
        persona.add(dato_persona3);
        persona.add(dato_persona4);
        persona.add(dato_persona5);
        persona.add(dato_persona6);
        persona.add(dato_persona7);
        persona.add(dato_persona8);
        persona.add(dato_persona9);
        persona.add(dato_persona10);
        for (int i = 0; i < perros.size(); i++){
            System.out.println(perros.get(i));
        }
        for (int j = 0; j < persona.size(); j++){
            System.out.println(persona.get(j));
        }
    }
    
}
