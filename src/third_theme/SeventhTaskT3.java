package third_theme;

import java.util.Scanner;

public class SeventhTaskT3 {

    //Создайте программу, вычисляющую факториал натурального
    //числа n, которое пользователь введёт с клавиатуры

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

    public int factorial(int number){
        if(number >= 1){
            return number * factorial(number - 1);
        }
        else {
            return 1;
        }
    }

}
