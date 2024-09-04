package theme7.stask;

public abstract class Fruit {

    protected int weight;

    static int totalCost;

    public void printManufactureInfo() {
        System.out.print("Made in Ukraine");
    }

    public abstract int calculateFruitPrice();

}
