package theme8.task2;

public class Pair<T> {

    //Реализовать класс Pair, который будет содержать 2 значения любого типа. Класс умеет выводить:
    //○ first() - возвращает 1ый элемент
    //○ last() - возвращает 2ой элемент
    //○ swap() - меняет элементы местами
    //○ replaceFirst() - заменяет 1ый элемент на новый
    //○ replaceLast() - заменяет 2ой элемент на новый

    private T firstElement;
    private T secondElement;

    public Pair(T firstElement, T secondElement) {
        this.firstElement = firstElement;
        this.secondElement = secondElement;
    }

    public T first() {
        return firstElement;
    }

    public void setFirstElement(T firstElement) {
        this.firstElement = firstElement;
    }

    public T last() {
        return secondElement;
    }

    public void setSecondElement(T secondElement) {
        this.secondElement = secondElement;
    }

    public void swap() {
        T tmp = firstElement;
        firstElement = secondElement;
        secondElement = tmp;
    }

    public void replaceFirst(T newFirst) {
        firstElement = newFirst;
    }

    public void replaceLast(T newLast) {
        secondElement = newLast;
    }

    @Override
    public String toString() {
        return "First element: " + firstElement + "\nLast element: " + secondElement;
    }
}
