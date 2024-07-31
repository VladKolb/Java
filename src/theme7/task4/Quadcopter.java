package theme7.task4;

public class Quadcopter extends FlyingVehicles {

    private int maxFlightTime;
    private boolean gpsSupport;

    public Quadcopter(String name, int capacity, int loadCapacity, int rangeOfFlight, int maxFlightTime, boolean gpsSupport) {
        super(name, capacity, loadCapacity, rangeOfFlight);
        this.maxFlightTime = maxFlightTime;
        this.gpsSupport = gpsSupport;
    }

    public int getMaxFlightTime() {
        return maxFlightTime;
    }

    public void setMaxFlightTime(int maxFlightTime) {
        this.maxFlightTime = maxFlightTime;
    }

    public boolean isGpsSupport() {
        return gpsSupport;
    }

    public void setGpsSupport(boolean gpsSupport) {
        this.gpsSupport = gpsSupport;
    }
}
