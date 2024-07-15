package fourth_theme;

import java.util.Arrays;

public class EleventhTaskT4 {

    //Сделать транспонирование матрицы (замена строк на столбцы)

    public void transposition(){
        int[][] matrix = {
                {0,1},
                {2,3},
                {4,5},
                {6,7},
                {8,9}
        };

        int[][] transposedMatrix = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                transposedMatrix[j][i] = matrix[i][j];
            }
        }

        System.out.println("Original matrix: ");
        printMatrix(matrix);
        System.out.println("Transposed matrix: ");
        printMatrix(transposedMatrix);
    }

    public void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); //можно не ставить кавычки внутри
        }
    }

}


