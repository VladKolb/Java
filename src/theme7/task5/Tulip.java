package theme7.task5;

public class Tulip extends Flower {

    private String type;
    private int stemHeight;

    public Tulip(String name, String color, int price, int height, int lifeTime, String type, int stemHeight) {
        super(name, color, price, height, lifeTime);
        this.type = type;
        this.stemHeight = stemHeight;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStemHeight() {
        return stemHeight;
    }

    public void setStemHeight(int stemHeight) {
        this.stemHeight = stemHeight;
    }
}
