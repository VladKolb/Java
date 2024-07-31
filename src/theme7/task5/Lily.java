package theme7.task5;

public class Lily extends Flower {

    private int flowerSize;

    public Lily(String name, String color, int price, int height, int lifeTime, int flowerSize) {
        super(name, color, price, height, lifeTime);
        this.flowerSize = flowerSize;
    }

    public int getFlowerSize() {
        return flowerSize;
    }

    public void setFlowerSize(int flowerSize) {
        this.flowerSize = flowerSize;
    }
}
