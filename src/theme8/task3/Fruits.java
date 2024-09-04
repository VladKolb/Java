package theme8.task3;

public class Fruits extends Food {

    private String name;

    public Fruits(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public FoodType getFoodType() {
        return FoodType.FRUIT;
    }

    @Override
    public String toString() {
        return "Food name: " + name + "\nFood type: " + getFoodType();
    }

}
