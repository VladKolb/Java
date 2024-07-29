package theme7.task3;

public class Fridge extends Technique {

    private boolean isNoFrost;
    private int cellAmount;

    public Fridge(String manufacturer, String name, int amperage, boolean inSocket, int price, boolean isNoFrost, int cellAmount) {
        super(manufacturer, name, amperage, inSocket, price);
        this.isNoFrost = isNoFrost;
        this.cellAmount = cellAmount;
    }

    public boolean isNoFrost() {
        return isNoFrost;
    }

    public void setNoFrost(boolean noFrost) {
        isNoFrost = noFrost;
    }

    public int getCellAmount() {
        return cellAmount;
    }

    public void setCellAmount(int cellAmount) {
        this.cellAmount = cellAmount;
    }
}
