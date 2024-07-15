package fourth_theme;

import java.lang.reflect.Array;
import java.util.Arrays;

public class NinthTaskT4 {

    //Исключить одинаковые элементы массива (каждое
    //значение должно присутствовать в единственном
    //экземпляре)
    // int[] originalArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};

    public void deleteDuplicates(){ //твой алгоритм содержит ошибки и не сможет обработать любрй массив, к тому же решение сложно и сожрет много памяти
//        int[] originalArray = {1, 1, 2, 1, 1, 1, 1, 1, 1, 1}; вот тут уже не работает корректно
//         int[] originalArray = {5, 12, 9, -25, 8, 15, 7, 14, 20, -18, 9, 5};
        int[] originalArray = {1, 1, 1, 1, 1, 1, 1, 1, 1};
        boolean flag = true;

        while(flag){
            for(int i = 0; i < originalArray.length - 1; i++){
                int duplicateAmount = 0;
                for(int j = i + 1; j < originalArray.length; j++){
                    if(originalArray[i] == originalArray[j]){
                        duplicateAmount++;
                        //зачем мы сначала считаем дубликаты, а потом удаляем? в этом месте уже можно удалять элемент - по одному, а также ввести счетчик актальной длины массива
                        //то есть удаляем один элемент, сдвигаем по одному элементы после него, получаем в хвосте у нас ненужные элементы
                        //в конце после циклов создать массив длиной счетчика акутальной длины и скопировать туда все элементы
                        //я так понимаю, ты попытался оптимизировать и сдвигать сразу все дубликаты, но с ошибками) это можно делать без новых массивов
                    }
                }
                if(duplicateAmount > 0){
                    int[] newOriginalArray = new int[originalArray.length - 1]; //new int[originalArray.length - duplicateAmount];
                    int totalIndex = 0;

                    for(int m = 0; m < originalArray.length; m++){ //обычно идут по порядку, сначала i, j, потом k, l, а потом, если такая огромная вложенность, то будет m
                        if(m == i){
                            continue;
                        }
                        newOriginalArray[totalIndex] = originalArray[m];
                        totalIndex++;
                    }

                    originalArray = new int[newOriginalArray.length]; //эта строчка в IDEA подсвечивается серым, потому что ее можно удалить и ничего не изменится

                    //почитай, что такое стек и куча в памяти java, если в твоем курсе не было
                    //попробую объяснить
                    //изначально originalArray ссылается на массив из 1 длиной 9
                    //далее originalArray = new int[newOriginalArray.length];
                    //originalArray теперь выделена новая память длиной new int[newOriginalArray.length], массив из 1 забыт и будет удален сборщиком мусора
                    //далее originalArray = newOriginalArray;
                    //ссылка originalArray теперь ссылается на существующий newOriginalArray, а новый память под новый массив new int[newOriginalArray.length] была выделена понапрасну и пустой массив будет удален сборшщиком мусора
                    originalArray = newOriginalArray;
                    if(originalArray.length == 1){
                        flag = false;
                    }
                    break;
                }
                else{
                    flag = false;
                }
            }
        }

        System.out.println(Arrays.toString(originalArray));
    }

}
