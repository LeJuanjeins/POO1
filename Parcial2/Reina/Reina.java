
package Parcial2.Reina;

class Reina {
    private String nombre;
    private int inteligencia;
    private int belleza;

    public Reina(String nombre) {
        this.nombre = nombre;
        this.inteligencia = 0;
        this.belleza = 0;
    }

    public void calificar(int inteligencia, int belleza) {
        this.inteligencia = inteligencia;
        this.belleza = belleza;
    }

    public String getInfo() {
        return "Nombre: " + nombre + ", Inteligencia: " + inteligencia + ", Belleza: " + belleza;
    }
}

class Usuario {
    private String usuario;
    private String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }
}