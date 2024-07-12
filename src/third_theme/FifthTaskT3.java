package third_theme;

import java.util.Scanner;

public class FifthTaskT3 {

    //Найдите сумму и произведение цифр числа, введенного с
    //клавиатуры

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

    public void sumAndProd(int number){
        int totalSum = 0;
        int totalProd = 1;
        String stringNumber = String.valueOf(number);
        for(char charDigit : stringNumber.toCharArray()){
            int digit = Integer.parseInt(String.valueOf(charDigit));
            totalSum += digit;
            totalProd *= digit;
        }

        System.out.println("Sum of digits = " + totalSum + "\nProduct of digits = " + totalProd);
    }

}
