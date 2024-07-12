package fourth_theme;

import java.util.Arrays;

public class EighthTaskT4 {

    //Выполнить слияние 2 упорядоченных массивов

    public void merging(){
        int[] array1 = {1, 3, 5, 7, 9};
        int[] array2 = {2, 4, 6, 8, 10};

        int[] array3 = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, array3, 0, array1.length);
        System.arraycopy(array2, 0, array3, array1.length, array2.length);

        Arrays.sort(array3);

        System.out.println("Merged Ordered Array: " + Arrays.toString(array3));
    }

}
