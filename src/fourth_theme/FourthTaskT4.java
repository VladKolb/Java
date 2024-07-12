package fourth_theme;

public class FourthTaskT4 {

    //Найти максимальный из элементов массива с четными
    //индексами
    // int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};

    public void findMaxValue(){
        int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};
        int maxValue = array[0];

        for(int i = 2; i < array.length; i += 2){
            if(array[i] > maxValue){
                maxValue = array[i];
            }
        }

        System.out.println("Maximum value in array among elements with even indexes is " + maxValue);
    }
}
