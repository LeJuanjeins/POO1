package Proyecto;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        String host = "127.0.0.1";
        String user = "root";
        String password = " ";
        int port = 3306;
        String database = "mibase";
        String url = String.format("jdbc:mysql://%s/%s", host, database);

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            System.out.println("Libreria no encontrada: " + e.getMessage());
        }

        conn = DriverManager.getConnection(url, user, password);  
        return conn;  
    }

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ingrese que desea calcular respectivamente (R)esistor, (I)nductor o (C)apacitor"); //
            char operando = scanner.next().charAt(0);
            if (operando == 'r'){                
                Resistor resistor = new Resistor();

                double resistance = resistor.getResistance();
                System.out.println(resistance);

            } else if (operando == 'i'){
                Inductor inductor = new Inductor();
            
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
