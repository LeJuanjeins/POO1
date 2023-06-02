package Proyecto;

public class Resistor{
    private Color[] colors;

    public Resistor(Color[] colors) {
        this.colors = colors;
    }
    public double getResistance() {
        int firstDigit = (int) colors[0].getvalor();
        int secondDigit = (int) colors[1].getvalor();
        double multiplier = Math.pow(10, colors[2].getvalor());
        double tolerance = colors.length == 4 ? colors[3].getvalor() : 0.0;
        return (firstDigit * 10 + secondDigit) * multiplier;
    }
}
