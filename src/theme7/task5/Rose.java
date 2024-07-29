package theme7.task5;

public class Rose extends Flower {

    private String type;
    private boolean thorns;

    public Rose(String name, String color, int price, int height, int lifeTime, String type, boolean thorns) {
        super(name, color, price, height, lifeTime);
        this.type = type;
        this.thorns = thorns;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isThorns() {
        return thorns;
    }

    public void setThorns(boolean thorns) {
        this.thorns = thorns;
    }
}
