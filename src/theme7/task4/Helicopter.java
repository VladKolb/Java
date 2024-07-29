package theme7.task4;

public class Helicopter extends FlyingVehicles {

    private int numberOFBlades;
    private int rotorDiameter;

    public Helicopter(String name, int capacity, int loadCapacity, int rangeOfFlight, int numberOFBlades, int rotorDiameter) {
        super(name, capacity, loadCapacity, rangeOfFlight);
        this.numberOFBlades = numberOFBlades;
        this.rotorDiameter = rotorDiameter;
    }

    public int getNumberOFBlades() {
        return numberOFBlades;
    }

    public void setNumberOFBlades(int numberOFBlades) {
        this.numberOFBlades = numberOFBlades;
    }

    public int getRotorDiameter() {
        return rotorDiameter;
    }

    public void setRotorDiameter(int rotorDiameter) {
        this.rotorDiameter = rotorDiameter;
    }
}
