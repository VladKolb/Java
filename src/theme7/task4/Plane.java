package theme7.task4;

public class Plane extends FlyingVehicles {

    private String type;
    private int numberOfEngines;

    public Plane(String name, int capacity, int loadCapacity, int rangeOfFlight, String type, int numberOfEngines) {
        super(name, capacity, loadCapacity, rangeOfFlight);
        this.type = type;
        this.numberOfEngines = numberOfEngines;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNumberOfEngines() {
        return numberOfEngines;
    }

    public void setNumberOfEngines(int numberOfEngines) {
        this.numberOfEngines = numberOfEngines;
    }
}
