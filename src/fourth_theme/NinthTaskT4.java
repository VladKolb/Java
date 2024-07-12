package fourth_theme;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NinthTaskT4 {

    //Исключить одинаковые элементы массива (каждое
    //значение должно присутствовать в единственном
    //экземпляре)
    // int[] originalArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};

    public void deleteDuplicates(){
        int[] originalArray = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        boolean flag = true;

        while(flag){
            for(int i = 0; i < originalArray.length - 1; i++){
                int duplicateAmount = 0;
                for(int j = i + 1; j < originalArray.length; j++){
                    if(originalArray[i] == originalArray[j]){
                        duplicateAmount++;
                    }
                }
                if(duplicateAmount > 0){
                    int[] newOriginalArray = new int[originalArray.length - 1];
                    int totalIndex = 0;

                    for(int m = 0; m < originalArray.length; m++){
                        if(m == i){
                            continue;
                        }
                        newOriginalArray[totalIndex] = originalArray[m];
                        totalIndex++;
                    }

                    originalArray = new int[newOriginalArray.length];
                    originalArray = newOriginalArray;
                    if(originalArray.length == 1){
                        flag = false;
                    }
                    break;
                }
                else{
                    flag = false;
                }
            }
        }

        System.out.println(Arrays.toString(originalArray));
    }

}
