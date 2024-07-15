package third_theme;

import java.util.Scanner;

public class SixthTaskT3 {

    //Найдите самую большую цифру числа, введенного с
    //клавиатуры, а также ее индекс

    public int enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");

        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("This isn't a number. Returning 0.");
            return 0;
        }
    }

    //у тедя хорошое решение, но можно было не конвертировать число-строка-массив-число
    //если мы ищем цифры в числа, мы это делаем через остаток от деления %10 - последняя цифра, %100 - препоследняя цифра и так далее
    public void findMax(int number){
        int maxDigit;
        int digitIndex = 0;
        String stringNumber = String.valueOf(number);
        char[] digitsArray = stringNumber.toCharArray();
        maxDigit = Integer.parseInt(String.valueOf(digitsArray[0]));
        for(int i = 1; i < digitsArray.length; i++){
            int candidate = Integer.parseInt(String.valueOf(digitsArray[i]));
            if(maxDigit < candidate){
                maxDigit = candidate;
                digitIndex = i;
            }
        }

        System.out.println("Biggest digit = " + maxDigit + "\nIndex of biggest digit = " + digitIndex);
    }

}
