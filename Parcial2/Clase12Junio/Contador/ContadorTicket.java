package Parcial2.Clase12Junio.Contador;

public class ContadorTicket {
    int Contador = 0;
    int numero;
    String fecha_complra;
    String DNIPersona;

    public ContadorTicket(String fecha_complra, String DNIPersona){
        Contador ++;
        this.numero = Contador;
        this.fecha_complra = fecha_complra;
        this.DNIPersona = DNIPersona;
    }
    @Override
    public String toString(){
        return "ticket{numero= " + this.numero + ", fecha de compra: " + this.fecha_complra + ". DNIPersona: " + this.DNIPersona +"}";
    }
    
}
