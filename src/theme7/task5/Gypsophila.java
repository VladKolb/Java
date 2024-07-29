package theme7.task5;

public class Gypsophila extends Flower {

    private int flowerClusterSize;

    public Gypsophila(String name, String color, int price, int height, int lifeTime, int flowerClusterSize) {
        super(name, color, price, height, lifeTime);
        this.flowerClusterSize = flowerClusterSize;
    }

    public int getFlowerClusterSize() {
        return flowerClusterSize;
    }

    public void setFlowerClusterSize(int flowerClusterSize) {
        this.flowerClusterSize = flowerClusterSize;
    }
}
