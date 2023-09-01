package Proyecto;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Resistor{

    public double getResistance() {
        int firstDigit = (int) colors[0].getvalor();
        int secondDigit = (int) colors[1].getvalor();
        double multiplier = Math.pow(10, colors[2].getvalor());
        double tolerance = colors.length == 4 ? colors[3].getvalor() : 0.0;
        return (firstDigit * 10 + secondDigit) * multiplier;
    }
}
