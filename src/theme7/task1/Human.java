package theme7.task1;

public class Human {

    //Создать класс Human (человек), с полями: имя, возраст, пол
    //и вес. Определить методы задания имени, возраста и веса.
    //● Создать производный класс Student, имеющий поле года
    //обучения.
    //● Определить методы задания и увеличения года обучения.

    private String name;
    private int age;
    private String sex;
    private double weight;

    public Human(String name, int age, String sex, double weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
