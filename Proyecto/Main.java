package Proyecto;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Create a resistor with color bands brown, black, and red
             
            
            
             // Create an inductor with color bands orange, white, and black
             Color[] inductorColors = {new Color("orange", 3), new Color("white", 9), new Color("black", -1)};
             
            System.out.println("Ingrese que desea calcular respectivamente (R)esistor, (I)nductor o (C)apacitor");
            char operando = scanner.next().charAt(0);
            if (operando == 'r'){
                
                Color[] resistorColors = {new Color("brown", 1), new Color("black", 0), new Color("red", 2)};
                Resistor resistor = new Resistor(resistorColors);

                double resistance = resistor.getResistance();
                System.out.println(resistance);

            } else if (operando == 'i'){
                Inductor inductor = new Inductor(inductorColors);
            
                // Calculate the inductance of the inductor
                double inductance = inductor.getInductance();
                System.out.println(inductance);

            } else if (operando == 'c'){
                // Create a capacitor with capacitance 100 nF and frequency 1 kHz
                Capacitor capacitor = new Capacitor(100e-9, 1e3);
                System.out.println(capacitor);
                
                // Calculate the impedance of the capacitor
                double impedance = capacitor.getImpedance();
                System.out.println(impedance);

            } else {
                System.out.println("No se reconoce el operador");
            }
        }
        }
    }
