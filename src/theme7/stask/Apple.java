package theme7.stask;

public class Apple extends Fruit {

    private String typeOfApple;

    private final int PRICE = 3;

    static int totalCostOfAppleSold;

    public Apple(String typeOfApple, int weight) {
        this.weight = weight;
        this.typeOfApple = typeOfApple;
        totalCost += calculateFruitPrice();
        totalCostOfAppleSold += calculateFruitPrice();
    }

    @Override
    public int calculateFruitPrice() {
        return PRICE * weight;
    }

    @Override
    public String toString() {
        return "Type of Apple " + typeOfApple +
                "\nWeight " + this.weight +
                "\nFruit price " + calculateFruitPrice() +
                " \nTotal cost of apple sold " + totalCostOfAppleSold +
                "\nTotal cost of all fruit " + totalCost;
    }
}
