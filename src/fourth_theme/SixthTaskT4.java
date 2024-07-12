package fourth_theme;

import java.sql.Array;
import java.util.Arrays;

public class SixthTaskT4 {

    //Разложить положительные и отрицательные числа по
    //разным массивам

    public void filter(){
        int[] originalArray = {5, -12, 9, -25, 8, 15, -7, 14, 20, -18};
        int positiveArraySize = 0;
        int negativeArraySize = 0;

        for(int number : originalArray){
            if(number < 0){
                negativeArraySize++;
            }
            else{
                positiveArraySize++;
            }
        }

        int[] positiveArray = new int[positiveArraySize];
        int[] negativeArray = new int[negativeArraySize];

        int totalPositiveIndex = 0;
        int totalNegativeIndex = 0;

        for(int number : originalArray){
            if(number < 0){
                negativeArray[totalNegativeIndex] = number;
                totalNegativeIndex++;
            }
            else{
                positiveArray[totalPositiveIndex] =  number;
                totalPositiveIndex++;
            }
        }

        System.out.println("Positive numbers: " + Arrays.toString(positiveArray) +
                "\nNegative numbers: " + Arrays.toString(negativeArray));
    }

}
