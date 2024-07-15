package fourth_theme;

public class ThirteenthTaskT4 {

    // Создать двумерный квадратный массив размера n. Заполнить его случайными
    // числами таким образом:
    // числа по диагонали равны 0;
    // вверху и снизу от пересечения диагоналей находятся только
    // положительные числа;
    // слева и справа от пересечения диагоналей находятся только
    // отрицательные числа;
    // Вывести массив на экран.
    // Найти сумму всех элементов
    // Найти среднее арифметическое всех элементов, которые больше суммы
    // всех элементов
    // Пример:
    // 0 4 5 5 3 8 0
    // -2 0 5 6 3 0 -4
    // -2 -8 0 6 0 -1 -2
    // -5 -9 -2 0 -9 -7 -3
    // -6 -2 0 1 0 -1 -5
    // -2 0 3 5 2 0 -8
    // 0 4 2 9 1 3 0
    // Суммa всех элементов: -3
    // Cреднее арифметическое всех элементов больше -3: 1.6579

    public void competeTask(){
        int[][] matrix = createMatrix();
        printMatrix(matrix);
        int totalSum = sumOfAllElements(matrix);
        double totalAverage = avgOfElements(matrix, totalSum);
        System.out.println("Sum of all elements: " + totalSum +
                "\nAverage of all elements > " + totalSum + " = " + totalAverage);
    }

    public int[][] createMatrix(){
        int[][] matrix = new int[5][5];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if((i < j && matrix[i].length - 1 - i > j) || (i > j && matrix[i].length - 1 - i < j)){
                    matrix[i][j] = ((int)(Math.random() * 10) + 1); //удобнее использовать Random-класс
                } else if ((i > j && matrix[i].length - 1 - i > j) || (i < j && matrix[i].length - 1 - i < j)) {
                    matrix[i][j] = ((int)(Math.random() * -10) - 1);;
                }
            }
        }

        return matrix;
    }

    public int sumOfAllElements(int[][] matrix){
        int totalSum = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                totalSum += matrix[i][j];
            }
        }

        return totalSum;
    }

    public double avgOfElements(int[][] matrix, int flag){
        double size = 0;
        double totalSum = 0;

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j] > flag){
                    totalSum += matrix[i][j];
                    size++;
                }
            }
        }
        //копи-паст (повторение кода) - лучше переиспользовать метод. одна из целей использования мтеодов - избегать копи-паст
//        double totalSum = sumOfAllElements(matrix);
//        double size = matrix.length * matrix[0].length;
        double average = totalSum / size; //и тут idea желтеньким подсвечивает - введена ненужная переменная, лучге сразу return totalSum / size;

        return average;
    }

    public void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(""); //System.out.println();
        }
    }
}
