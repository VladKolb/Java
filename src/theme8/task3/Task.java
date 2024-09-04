package theme8.task3;

public class Task {

    //Создать enum - FoodType (MEAT, FISH, FRUIT, VEGETABLE, MILK, UNKNOWN)
    //○ Создать базовый абстрактный класс Food и в нем абстрактный метод public FoodType getFoodType();
    //○ Создать 2-3 класса наследника Food и реализовать методы get/set name, a также переопределить getFoodType для каждого.
    //○ Создать отдельный класс с методом проверки boolean isVegetarian(Food[] foods) в метод передается набор ингредиентов, на
    //выходе true если все они вегетарианские.

    public static boolean isVegetarian(Food[] foods) {
        for (Food food : foods) {
            if (food.getFoodType() != FoodType.VEGETABLE && food.getFoodType() != FoodType.FRUIT) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Dairy dairy1 = new Dairy("Yogurt");
        Dairy dairy2 = new Dairy("Cheese");
        Dairy dairy3 = new Dairy("Cottage cheese");

        Vegetarian vegetarian1 = new Vegetarian("Cucumber");
        Vegetarian vegetarian2 = new Vegetarian("Pepper");
        Vegetarian vegetarian3 = new Vegetarian("Tomato");

        Fruits fruit1 = new Fruits("Apple");
        Fruits fruit2 = new Fruits("Banana");
        Fruits fruit3 = new Fruits("Orange");

        System.out.println(Task.isVegetarian(new Food[]{fruit2, vegetarian2, fruit1}));
    }


}
