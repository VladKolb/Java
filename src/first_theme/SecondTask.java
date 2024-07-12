package first_theme;

import java.util.Scanner;

public class SecondTask {

    // Вывести длину отрезка, проходящего через две точки

    public void solution(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x1 and x2");

        if(scanner.hasNextInt()){
            int x1 = scanner.nextInt();
            int x2 = scanner.nextInt();

            if(x1 < x2){
                System.out.println("Length is " + (x2 - x1));
            }
            else{
                System.out.println("Length is " + (x1 - x2));
            }
        }
        else{
            System.out.println("This isn't a number.");
        }
    }

}
