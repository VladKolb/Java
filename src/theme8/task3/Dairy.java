package theme8.task3;

public class Dairy extends Food {

    private String name;

    public Dairy(String name) {
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
        return FoodType.MILK;
    }

    @Override
    public String toString() {
        return "Food name: " + name + "\nFood type: " + getFoodType();
    }
}
