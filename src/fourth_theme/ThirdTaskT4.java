package fourth_theme;

public class ThirdTaskT4 {

    //Найти сумму чисел массива
    //int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};


    public void findSum(){
        int[] array = {5, 12, 9, 25, 8, 15, 7, 14, 20, 18};
        int totalSum = 0;

        for(int number : array){
            totalSum += number;
        }

        System.out.println("Sum of the numbers in the array is " + totalSum);
    }

}
