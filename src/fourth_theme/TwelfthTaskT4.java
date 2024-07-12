package fourth_theme;

import java.util.Arrays;

public class TwelfthTaskT4 {

    //Создать массив заполнить его случайными элементами,
    //распечатать, перевернуть, и снова распечатать. При перевороте


    public void reverseArray(){
        int[] array = new int[10];
        System.out.println("Original array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 10));
            System.out.print(array[i] + " ");
        }

        System.out.println("\nReversed array:");
        for(int i = array.length - 1; i >= 0; i--){
            System.out.print(array[i] + " ");
        }

    }
}
