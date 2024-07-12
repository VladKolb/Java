package fourth_theme;

public class FifthTaskT4 {

    //Найти минимальный из элементов массива с нечетными
    //индексами
    // int[] array = {5, 25, 9, 12, 8, 15, 7, 14, 20, 18};

    public void findMinValue(){
        int[] array = {5, 25, 9, 12, 8, 15, 7, 14, 20, 18};
        int minValue = array[1];

        for(int i = 3; i < array.length; i += 2){
            if(array[i] < minValue){
                minValue = array[i];
            }
        }

        System.out.println("Minimum value in array among elements with odd indexes is " + minValue);
    }
}
