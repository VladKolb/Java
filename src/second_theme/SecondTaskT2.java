package second_theme;

import java.util.Scanner;

public class SecondTaskT2 {

    // Определить является ли целое число чётным либо нечётным

    public int enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("This isn't a number. Returning 0.");
            return 0;
        }
    }

    public void isEven(int number){
        if (number % 2 == 0){
            System.out.println(number + " is even");
        }
        else{
            System.out.println(number + " is odd");
        }
    }

}
