package Proyecto;

public class Inductor {
    private Color[] colors;

    public Inductor(Color[] colors) {
        this.colors = colors;
    }

    public double getInductance() {
        int firstDigit = (int) colors[0].getvalor();
        int secondDigit = (int) colors[1].getvalor();
        double multiplier = Math.pow(10, colors[2].getvalor());
        return (firstDigit * 10 + secondDigit) * multiplier;
    }
}