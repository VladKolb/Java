package fourth_theme;

public class SeventhTaskT4 {

    //Найти максимальный и минимальные элементы массива
    //и вывести их индексы на экран

    public void findMinAndMaxValuesIndexes(){
        //лучше printMaxValueIndex, printMinValueIndex - find обычно используется в названиях методов, когда они возвращают значение, но пока можно и find использовать
        findMaxValueIndex();
        findMinValueIndex();
    }

    public void findMaxValueIndex(){
        int[] array = {5, 12, 9, -25, 8, 15, -7, 14, 20, -18};
        int maxValue = array[0];
        int maxValueIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] > maxValue){
                maxValue = array[i];
                maxValueIndex = i;
            }
        }

        System.out.println("Index of maximum value in array is " + maxValueIndex);
    }

    public void findMinValueIndex(){
        int[] array = {5, 12, 9, -25, 8, 15, -7, 14, 20, -18};
        int minValue = array[0];
        int minValueIndex = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] < minValue){
                minValue = array[i];
                minValueIndex = i;
            }
        }

        System.out.println("Index of minimum value in array is " + minValueIndex);
    }

}
