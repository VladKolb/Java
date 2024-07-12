package fourth_theme;

public class FirstTaskT4 {

    //Найти максимальное значение из массива
    //int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};

    public void findMaxValue(){
        int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};
        int maxValue = array[0];

        for(int candidate : array){
            if(candidate > maxValue){
                maxValue = candidate;
            }
        }

        System.out.println("Maximum value in array is " + maxValue);
    }


}
