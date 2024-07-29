package theme7.task3;

public class Technique {
    private String manufacturer;
    private String name;
    private int amperage;
    final int VOLTAGE = 220;
    private boolean inSocket;
    private int price;

    public Technique(String manufacturer, String name, int amperage, boolean inSocket, int price) {
        this.manufacturer = manufacturer;
        this.name = name;
        this.amperage = amperage;
        this.inSocket = inSocket;
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmperage() {
        return amperage;
    }

    public void setAmperage(int amperage) {
        this.amperage = amperage;
    }

    public int getVOLTAGE() {
        return VOLTAGE;
    }

    public int calculatePower() {
        return amperage * VOLTAGE;
    }

    public boolean isInSocket() {
        return inSocket;
    }

    public void setInSocket(boolean inSocket) {
        this.inSocket = inSocket;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
