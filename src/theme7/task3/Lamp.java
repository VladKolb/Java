package theme7.task3;

public class Lamp extends Technique {

    private String color;

    public Lamp(String manufacturer, String name, int amperage, boolean inSocket, int price, String color) {
        super(manufacturer, name, amperage, inSocket, price);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
