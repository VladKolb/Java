package first_theme;

import java.util.Scanner;

public class FirstTask {

    // Вывести 3-ю цифру 5-тизначного числа

    public void solution(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");

        if(scanner.hasNextInt()){
            String stringNumber = String.valueOf(scanner.nextInt());
            if(stringNumber.length() != 5){
                System.out.println("Invalid number input! Try again!");
                return;
            }
            System.out.println(stringNumber.charAt(2));
        }
        else{
            System.out.println("This isn't a number.");
        }
    }
}
