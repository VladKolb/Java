package second_theme;

import java.util.Scanner;

public class FirstTaskT2 {

    //Найти среднее число из трех, введенных с клавиатуры

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

    public void findMiddle(int number1, int number2, int number3){
        if((number1 <= number2 && number1 >= number3) || (number1 >= number2 && number1 <= number3)){
            System.out.println("The number in the middle is: " + number1);
        }
        else if((number2 <= number1 && number2 >= number3) || (number2 >= number1 && number2 <= number3)){
            System.out.println("The number in the middle is: " + number2);
        }
        else{
            System.out.println("The number in the middle is: " + number3);
        }
    }

}
