package fourth_theme;

import java.util.Arrays;

public class NinthTaskT4 {

    //Исключить одинаковые элементы массива (каждое
    //значение должно присутствовать в единственном
    //экземпляре)
    // int[] originalArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};

    //идея решения, чекаем элемент, если у него есть дубликат сдвигаем всю цепочку без дубликатов влево, то есть дубликаты затираются сдвигом, а в хвосте массива остается мусор
    //при каждом сдвиге считаем actualArraySize, в конце создаем укороченный массив размером actualArraySize и копируем в него элементы из originalArray
    public void deleteDuplicates() { //твой алгоритм содержит ошибки и не сможет обработать любрй массив, к тому же решение сложно и сожрет много памяти
        int[] originalArray = {2, 2, 1, 1, 5, 3, 3, 2, 2, 1, 3, 1, 4, 4, 1, 2, 1, 1, 1, 1}; //вот тут уже не работает корректно
        //        int[] originalArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};
        //        int[] originalArray = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        int actualArraySize = originalArray.length;

        //так как я меняю длину счетчика actualArraySize внутри for, лучше в таких случаях использовать while, но я уже не буду переписывать
        for (int i = 0; i < actualArraySize; i++) {
            int duplicateAmount = 0;
            for (int j = i + 1; j < actualArraySize; j++) {
                if (originalArray[i] == originalArray[j]) {
                    duplicateAmount++;
                }
            }
            if (duplicateAmount > 0) {
                System.out.println("actual size: " + actualArraySize + " after duplicates: " + duplicateAmount + " " + Arrays.toString(
                        originalArray));
                for (int k = i + 1, l = k; k < actualArraySize; k++) {
                    if (originalArray[i] != originalArray[k]) { //continue почему-то не любят, не используют)
                        originalArray[l++] = originalArray[k];
                    }
                }
                actualArraySize -= duplicateAmount;
            }
        }

        int[] arrayWithoutDuplicates = new int[actualArraySize];
        System.arraycopy(originalArray, 0, arrayWithoutDuplicates, 0, actualArraySize);
        System.out.println(Arrays.toString(arrayWithoutDuplicates));
    }
}
