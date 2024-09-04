package theme8;

import java.util.Arrays;

public class FirstTaskT8<T> {

    //Написать класс, который умеет хранить в себе массив любых типов данных (int, long etc.). Реализовать метод,
    //который возвращает любой элемент массива по индексу.

    private final int array_size = 5;

    private T[] array;

    public FirstTaskT8(T[] array) {
        this.array = array;
    }

    public T[] getArray() {
        return array;
    }

    public void setArray(T[] array) {
        this.array = array;
    }

    public T getElement(int index) {
        return array[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(array);
    }
}
