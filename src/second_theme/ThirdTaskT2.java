package second_theme;

import java.util.Scanner;

public class ThirdTaskT2 {

    // По порядковому номеру пальца руки необходимо
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

    public void finger(int number){
        switch (number) {
            case 1 -> System.out.println("The finger at position 1 is the Thumb");
            case 2 -> System.out.println("The finger at position 2 is the Pointer");
            case 3 -> System.out.println("The finger at position 3 is the Middle finger");
            case 4 -> System.out.println("The finger at position 4 is the Ring finger");
            case 5 -> System.out.println("The finger at position 5 is the Little");
            default -> System.out.println("No finger at this position");
        }
    }

}
