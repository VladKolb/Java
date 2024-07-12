package second_theme;

import java.util.Scanner;

public class SixthTaskT2 {

    //Напишите программу расчета даты следующего дня
    //введя 3 числа - день, месяц и год

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

    public void nextDay(int day, int month, int year){

        if(day > 31 || day < 1 || month < 1 || month > 12) {
            System.out.println("Invalid input data!");
            return;
        }


        boolean thirtyDays = false;
        boolean february = false;
        switch(month){
            case 4, 6, 9, 11 -> thirtyDays = true;
            case 2 -> february = true;
        }

        if(day == 31 && (thirtyDays || february)){
            System.out.println("Invalid input date");
        }
        else if((day == 30 || day == 29) &&  february){
            System.out.println("Invalid input date");
        }
        else if (day == 28 && february) {
            day = 1;
            month++;
            System.out.println("The next day is: " + day + " " + month + " " + year);
        }
        else if (day == 30 && thirtyDays) {
            day = 1;
            month++;
            System.out.println("The next day is: " + day + " " + month + " " + year);
        }
        else if (day == 31 && month == 12) {
            day = 1;
            month = 1;
            year++;
            System.out.println("The next day is: " + day + " " + month + " " + year);
        }
        else if (day == 31) {
            day = 1;
            month++;
            System.out.println("The next day is: " + day + " " + month + " " + year);
        }
        else {
            System.out.println("The next day is: " + (++day) + " " + month + " " + year);
        }



    }

}
