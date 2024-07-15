package fourth_theme;

import java.util.Arrays;
import java.util.Random;

public class TwelfthTaskT4 {

    //Создать массив заполнить его случайными элементами,
    //распечатать, перевернуть, и снова распечатать. При перевороте


    public void reverseArray(){
        int[] array = new int[10];
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 10));  //а зачем умножать на 10? посмотри класс Random - пример ниже
            Random random = new Random();
//            random.nextInt();
//            random.nextInt(5); //значение до 5
//            random.nextInt(2, 5); //значение от 2 до 5
// есть методы для генерации случайных значенй разных типов
            System.out.print(array[i] + " ");
        }

        System.out.println("\nReversed array:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
