package second_theme;

import java.util.Scanner;

public class EighthTaskT2 {

    //Создать программу, которая будет находить вещественные
    //корни квадратного уравнения ax²+bx+c=0, либо сообщать,
    //что корней нет

    public int enterNumber(){
        Scanner scanner = new Scanner(System.in);


        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("This isn't a number or it's a big number. Returning 0.");
            return 0;
        }
    }

    public void findRoots(int a, int b, int c){
        int d = b * b - 4 * a * c;

        if(d < 0) {
            System.out.println("No roots");
        } else if (d == 0) {
            System.out.println("The quadratic equation has one root: " + ((-b/2)/a));
        } else {
            System.out.println("The quadratic equation has one root: \n" + ((-b + Math.sqrt(d)) / 2 * a) +
                    "\n" + ((-b - Math.sqrt(d)) / 2 * a));
        }
    }

}
