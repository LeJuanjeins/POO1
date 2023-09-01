package Parcial2.ArrayObjetos;

public class Perro {
    String raza;
    String Nombre;

    public String datos_Perro(String Nombre, String raza){
        String mensaje_perro = "el nombre del perro es: ";
        return mensaje_perro;    
    }
    public void Mostrar(){
        System.out.println("El perro "+ Nombre +" es de raza " + raza +".");
    }
}
