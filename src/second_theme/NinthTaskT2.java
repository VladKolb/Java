package second_theme;

import java.util.Scanner;

public class NinthTaskT2 {

    //переменную n должно записываться случайное (на время тестирования программы) целое
    //число из [0;28800], далее оно должно выводиться на экран и на следующей строке
    //должна выводиться фраза о количестве полных часов, содержащихся в n секундах

    public int enterNumber(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number:");

        if(scanner.hasNextInt()){
            return scanner.nextInt();
        }
        else {
            System.out.println("This isn't a number or it's a big number. Returning 0.");
            return 0;
        }
    }

    public void restOfTime(int seconds){
        if(seconds < 0 || seconds > 28800){ //магическое число 28800 в константу
            System.out.println("Invalid time input");
            return;
        } //у тебя ввод с консоли, а в условии написано про случайное число из [0;28800] - это случайно не про класс Random и nextInt(0, 28800)?

        int hours = seconds / 3600; //магическое число 3600 в константу

        System.out.println(seconds + "\nОсталось " + hours + " часов.");
    }

}
