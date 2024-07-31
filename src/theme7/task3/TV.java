package theme7.task3;

public class TV extends Technique {

    private int screenSize;

    public TV(String manufacturer, String name, int amperage, boolean inSocket, int price, int screenSize) {
        super(manufacturer, name, amperage, inSocket, price);
        this.screenSize = screenSize;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
