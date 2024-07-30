package theme5;

public class Phone {

    //Создайте класс Phone, который содержит поля number, model и
    //weight.
    //● Создайте три экземпляра (instance) этого класса. Выведите в
    //консоль их значения.
    //● Добавить в класс Phone методы: receiveCall (один параметр – имя
    //звонящего). Выводит на консоль сообщение “Звонит {name}”.
    //● getNumber – возвращает номер телефона. Вызвать эти методы
    //для каждого из объектов
    //● Добавить второй метод receiveCall, который принимает два
    //параметра - имя звонящего и номер телефона звонящего. Вызвать
    //этот метод.
    //● Создать метод sendMessage с аргументами переменной длины.
    //Данный метод принимает на вход номера телефонов, которым
    //будет отправлено сообщение. Метод выводит на консоль номера
    //этих телефонов.

    private String number;

    private String model;

    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public void printValues() {
        System.out.println(String.join(", ", number, model, String.valueOf(weight)));
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String callerNumber) {
        System.out.println("Звонит " + name + "\n" + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... recipientNumbers) {
        for (String recipientNumber : recipientNumbers) {
            System.out.println(recipientNumber);
        }
    }
}
