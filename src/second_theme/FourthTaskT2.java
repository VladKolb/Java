package second_theme;

import java.util.Scanner;

public class FourthTaskT2 {

    //По порядковому номеру дня недели необходимо
    //вывести его название на экран

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

    public void weekDay(int number){
        switch (number) {
            case 1 -> System.out.println("The day at position 1 is the Monday");
            case 2 -> System.out.println("The day at position 2 is the Tuesday");
            case 3 -> System.out.println("The day at position 3 is the Wednesday day");
            case 4 -> System.out.println("The day at position 4 is the Thursday");
            case 5 -> System.out.println("The day at position 5 is the Friday");
            case 6 -> System.out.println("The day at position 6 is the Saturday");
            case 7 -> System.out.println("The day at position 7 is the Sunday");
            default -> System.out.println("No day at this position");
        }
    }

}
