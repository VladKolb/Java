package theme7.task5;

public class Carnation extends Flower {

    private String fragrance;
    private boolean coldResistance;

    public Carnation(String name, String color, int price, int height, int lifeTime, String fragrance, boolean coldResistance) {
        super(name, color, price, height, lifeTime);
        this.fragrance = fragrance;
        this.coldResistance = coldResistance;
    }

    public String getFragrance() {
        return fragrance;
    }

    public void setFragrance(String fragrance) {
        this.fragrance = fragrance;
    }

    public boolean isColdResistance() {
        return coldResistance;
    }

    public void setColdResistance(boolean coldResistance) {
        this.coldResistance = coldResistance;
    }
}
