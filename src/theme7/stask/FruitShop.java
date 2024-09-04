package theme7.stask;

public class FruitShop {

    Apple apple1 = new Apple("Juice", 20);
    Apple apple2 = new Apple("Sun", 100);
    Apple apple3 = new Apple("Nice", 5);

    Apricot apricot1 = new Apricot("Orange", 40);
    Apricot apricot2 = new Apricot("Yummy", 200);
    Apricot apricot3 = new Apricot("Red", 150);

    Pear pear1 = new Pear("Red", 67);
    Pear pear2 = new Pear("Green", 67);
    Pear pear3 = new Pear("Yellow", 67);

    public void printPearInfo() {
        System.out.println(pear1.toString());
    }

}
