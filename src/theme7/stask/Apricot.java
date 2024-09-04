package theme7.stask;

public class Apricot extends Fruit {

    private String typeOfApricot;

    private final int PRICE = 7;

    static int totalCostOfApricotSold;

    public Apricot(String typeOfApricot, int weight) {
        this.weight = weight;
        this.typeOfApricot = typeOfApricot;
        totalCost += calculateFruitPrice();
        totalCostOfApricotSold += calculateFruitPrice();
    }

    @Override
    public int calculateFruitPrice() {
        return PRICE * weight;
    }

    @Override
    public String toString() {
        return "Type of Apricot " + typeOfApricot +
                "\nWeight " + this.weight +
                "\nFruit price " + calculateFruitPrice() +
                "\nTotal cost of apricot sold " + totalCostOfApricotSold +
                "\nTotal cost of all fruit " + totalCost;
    }
}
