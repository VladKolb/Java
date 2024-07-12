package fourth_theme;

public class SecondTaskT4 {

    //Найти минимальное значение из массива
    //int[] array = {12, 5, 8, 3, 10, 15, 7};

    public void findMinValue(){
        int[] array = {12, 5, 8, 3, 10, 15, 7};
        int minValue = array[0];

        for(int candidate : array){
            if(candidate < minValue){
                minValue = candidate;
            }
        }

        System.out.println("Minimum value in array is " + minValue);
    }

}
