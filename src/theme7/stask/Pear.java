package theme7.stask;

public class Pear extends Fruit {

    private String color;

    private final int PRICE = 5;

    static int totalCostOfPearSold;

    public Pear(String color, int weight) {
        this.color = color;
        this.weight = weight;
        totalCost += calculateFruitPrice();
        totalCostOfPearSold += calculateFruitPrice();
    }

    @Override
    public int calculateFruitPrice() {
        return PRICE * weight;
    }

    @Override
    public String toString() {
        return "Pear color " + color +
                " \nWeight " + weight +
                " \nFruit price " + calculateFruitPrice() +
                " \nTotal cost of pear sold " + totalCostOfPearSold +
                " \nTotal cost of all fruit " + totalCost;
    }
}
