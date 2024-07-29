package theme7.task5;

public class Flower {

    private String name;
    private String color;
    private int price;
    private int height;
    private int lifeTime;

    public Flower(String name, String color, int price, int height, int lifeTime) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.height = height;
        this.lifeTime = lifeTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLifeTime() {
        return lifeTime;
    }

    public void setLifeTime(int lifeTime) {
        this.lifeTime = lifeTime;
    }
}
