package fourth_theme;

public class TenthTaskT4 {

    //Найти строку матрицы с максимальной суммой элементов
    //int[][] matrix = {
    // {1, 2, 3},
    // {4, 5, 6},
    // {7, 8, 9},
    // {10, 11, 12}
    //};

    public void findStringWithMaxSum(){
        int[][] matrix = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 11, 12}
                    };

        int totalMaxSum = 0;
        int stringIndex = 0;

        for(int i = 0; i < matrix.length; i++){
            int totalSum = 0;
            for (int j = 0; j < matrix[i].length; j++){
                totalSum += matrix[i][j];
            }
            if(totalSum > totalMaxSum){
                totalMaxSum = totalSum;
                stringIndex = i;
            }
        }

        System.out.println("Row with maximum sum of elements: " + stringIndex);
    }


}
