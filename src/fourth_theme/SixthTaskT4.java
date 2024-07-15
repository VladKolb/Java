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
            if(number < 0){ //а если элемент ==0, разве ж он в положительные должен идти?) такие элементы стоит пропускать - замечание на внимательность)
                negativeArraySize++;
            }
            else{
                positiveArraySize++;
            }
        }

        int[] positiveArray = new int[positiveArraySize];
        int[] negativeArray = new int[negativeArraySize];

        int totalPositiveIndex = 0; //почему total? просто positiveArrayIndex?
        int totalNegativeIndex = 0;

        for(int number : originalArray){
            if(number < 0){
                negativeArray[totalNegativeIndex] = number;
                totalNegativeIndex++;
                //negativeArray[totalNegativeIndex++] = number; в одну строчку можно
                //negativeArray[++totalNegativeIndex] = number; а, как считаешь, вот это будет работать корректно? понимаешь разницу?
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
