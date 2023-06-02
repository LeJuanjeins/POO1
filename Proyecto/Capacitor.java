package Proyecto;

public class Capacitor {
    private double capacitance;
    private double frequency;

    public Capacitor(double capacitance, double frequency) {
        this.capacitance = capacitance;
        this.frequency = frequency;
    }

    public double getImpedance() {
        double reactance = 1 / (2 * Math.PI * frequency * capacitance);
        return reactance;
    }
}
